SUMMARY = "Support for icon themes"
LICENSE = "GPL-2.0 & GPL-3.0 & LGPL-2.0 & LGPL-2.0+ & LGPL-2.1 & LGPL-3.0"
LIC_FILES_CHKSUM = " \
    file://LICENSES/GPL-2.0-only.txt;md5=93e64b4a83c7e441e48bbdeeea05c977 \
    file://LICENSES/GPL-3.0-only.txt;md5=1c76c4cc354acaac30ed4d5eefea7245 \
    file://LICENSES/LGPL-2.0-only.txt;md5=6d2d9952d88b50a51a5c73dc431d06c7 \
    file://LICENSES/LGPL-2.0-or-later.txt;md5=6d2d9952d88b50a51a5c73dc431d06c7 \
    file://LICENSES/LGPL-2.1-only.txt;md5=fabba2a3bfeb22a6483d44e9ae824d3f \
    file://LICENSES/LGPL-3.0-only.txt;md5=c51d3eef3be114124d11349ca0d7e117 \
"

inherit kde-kf5

DEPENDS += " \
    gettext-native \
    kcoreaddons-native \
    kauth-native \
    kconfig-native \
    qtsvg \
    ki18n \
    kconfig \
    kconfigwidgets \
    kwidgetsaddons \
    kitemviews \
"

PV = "${KF5_VERSION}"
SRC_URI[sha256sum] = "8c4dd72838648f0253b9ff9d266fad7ab02ef3545b50f33478a3b9cb6ad2ecf8"

FILES_${PN} += "${OE_QMAKE_PATH_PLUGINS}"
