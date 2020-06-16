SUMMARY = "QtQuickControls 2 style that integrates with the desktop"
LICENSE = "GPLv2 & LGPLv3"
LIC_FILES_CHKSUM = " \
	file://LICENSE.GPL-2;md5=b234ee4d69f5fce4486a80fdaf4a4263 \
	file://LICENSE.LGPL-3;md5=15d6edab0fdf34fa80484687e7319ce2 \
"

inherit kde-kf5 gettext

DEPENDS += " \
    kconfig-native \
    kcoreaddons-native \
    kauth-native \
    kirigami2 \
    kiconthemes \
    kconfigwidgets \
    ${@bb.utils.contains("DISTRO_FEATURES", "x11", "virtual/libx11 qtx11extras", "", d)} \
"

PV = "${KF5_VERSION}"
SRC_URI[md5sum] = "b05e72654c018e12983eb8cf191e47ac"
SRC_URI[sha256sum] = "b968ce6fc7c1d111aa2c63584dddc0f74e9066a0b4ea26d1194e46e2f7b38700"

FILES_${PN} += " \
    ${OE_QMAKE_PATH_PLUGINS} \
    ${OE_QMAKE_PATH_QML} \
"
