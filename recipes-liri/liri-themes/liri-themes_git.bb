SUMMARY = "Themes for a uniform look throughout Liri OS"
LICENSE = "GPL-3.0"
LIC_FILES_CHKSUM = " \
	file://LICENSE.GPLv3;md5=d32239bcb673463ab874e80d47fae504 \
"

inherit liri

PV = "0.9.0+git${SRCPV}"

SRCREV = "57b73b4539d8559dd85d371004d3e9484405f4a0"
S = "${WORKDIR}/git"

EXTRA_OECMAKE += " \
    -DINSTALL_GRUBDIR=/boot/grub \
"

do_install_append() {
    ${@bb.utils.contains('BBFILE_COLLECTIONS', 'meta-initramfs', '', 'rm -rf ${D}${datadir}/plymouth', d)}
}

PACKAGES += " \
    ${PN}-grub \
    ${PN}-sddm \
    ${@bb.utils.contains('BBFILE_COLLECTIONS', 'meta-initramfs', '${PN}-plymouth', '', d)} \
"

RDEPENDS_${PN}-plymouth += " \
    plymouth \
    plymouth-set-default-theme \
"

FILES_${PN} += "${datadir}/color-schemes"
FILES_${PN}-grub += "/boot/grub/themes"
FILES_${PN}-plymouth += "${datadir}/plymouth/themes"
FILES_${PN}-sddm += "${datadir}/sddm/themes"

# there is no plymouth-native yet
pkg_postinst_ontarget_${PN}-plymouth() {
    plymouth-set-default-theme -R lirios
}
