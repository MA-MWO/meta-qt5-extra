SUMMARY = "2D and 3D Graph Calculator"
LICENSE = "GPL-2.0 & LGPL-2.0 & GFDL-1.2"
LIC_FILES_CHKSUM = " \
    file://COPYING;md5=b234ee4d69f5fce4486a80fdaf4a4263 \
    file://COPYING.LIB;md5=5f30f0716dfdd0d91eb439ebec522ec2 \
    file://COPYING.DOC;md5=28d73eafa40ebd0ccdc6b37df8de10a3 \
"

inherit kde-apps gettext gtk-icon-cache mime-xdg

DEPENDS += "\
    ncurses \
    readline \
    analitza \
    kauth-native \
    kconfig-native \
    kcoreaddons-native \
    kdoctools-native \
    ki18n \
    kconfigwidgets \
    kwidgetsaddons \
"

PV = "${KDE_APP_VERSION}"
SRC_URI[sha256sum] = "af43c9afcfab9dfbf155cdeedcb97797c44146b9bfb9c53bc98274ede4f3ede2"

FILES_${PN} += " \
    ${datadir}/icons \
    ${datadir}/kalgebramobile \
"
