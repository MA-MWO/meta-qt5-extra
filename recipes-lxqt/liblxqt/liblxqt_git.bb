SUMMARY = "Core utility library for all LXQt components"
LICENSE = "LGPLv2.1"
LIC_FILES_CHKSUM = "file://COPYING;md5=435ed639f84d4585d93824e7da3d85da"

inherit lxqt features_check

REQUIRED_DISTRO_FEATURES = "x11"

DEPENDS += "qttools libqtxdg kwindowsystem libxscrnsaver polkit-qt-1"

SRCREV = "ea81cb4bfc8cdcc449b160769998587b0a77cc5e"
PV = "0.14.1+git${SRCPV}"

EXTRA_OECMAKE += " \
    -DCMAKE_INSTALL_DATAROOTDIR=share \
    -DLXQT_ETC_XDG_DIR=${sysconfdir}/xdg \
"

# This is not the full truth but at least opkg terminates do_rootfs if there
# are multiple RCONFLICTS. To workaround we add the triple below to lxqt base
# library.
RPROVIDES_${PN} += "lxqt-common"
RREPLACES_${PN} += "lxqt-common"
RCONFLICTS_${PN} += "lxqt-common"

FILES_${PN} += " \
    ${datadir}/polkit-1/ \
    ${datadir}/lxqt/power.conf \
"
