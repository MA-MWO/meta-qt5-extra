SUMMARY = "Provides integration of QML and KDE Frameworks"
LICENSE = "LGPLv2.1+"
LIC_FILES_CHKSUM = " \
	file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1 \
"

inherit kde-kf5

DEPENDS += "qtdeclarative kconfig kconfig-native ki18n kiconthemes kio kwidgetsaddons \
            kwindowsystem kglobalaccel kguiaddons kpackage libepoxy gettext-native \
            kcoreaddons-native kauth-native kpackage-native"

SRC_URI += " \
    file://0001-kpackagelauncherqml-Add-include-of-QDebug.patch \
    file://0002-Use-QML-debugger-only-if-qtdeclarative-was-build-wit.patch \
"

PV = "${KF5_VERSION}"
SRC_URI[md5sum] = "0ca32ecb1b1ceeba811d74804c4d004d"
SRC_URI[sha256sum] = "a0274de8c84d73dd17b1bc0faf64a9e0d0655035c0574148ba64986e367cd881"

FILES_${PN} += "${OE_QMAKE_PATH_QML}/org/kde"
