SUMMARY = "Add support for global workspace shortcuts"
LICENSE = "LGPL-2.0 & LGPL-2.0+ & LGPL-2.1 & LGPL-3.0"
LIC_FILES_CHKSUM = " \
    file://LICENSES/LGPL-2.0-only.txt;md5=6d2d9952d88b50a51a5c73dc431d06c7 \
    file://LICENSES/LGPL-2.0-or-later.txt;md5=6d2d9952d88b50a51a5c73dc431d06c7 \
    file://LICENSES/LGPL-2.1-only.txt;md5=fabba2a3bfeb22a6483d44e9ae824d3f \
    file://LICENSES/LGPL-3.0-only.txt;md5=c51d3eef3be114124d11349ca0d7e117 \
"

inherit kde-kf5

DEPENDS += " \
    kconfig-native \
    kcoreaddons-native \
    kcrash \
    kdbusaddons \
    kservice \
    ${@bb.utils.contains("DISTRO_FEATURES", "x11", "virtual/libx11 qtx11extras", "", d)} \
"

PV = "${KF5_VERSION}"
SRC_URI[sha256sum] = "9b6e7785e2d4fdfe485f1d7e98aa9d397800f9804ea013fd828338271ac2b561"

FILES_${PN} += " \
    ${datadir}/dbus-1 \
    ${datadir}/kservices5 \
    ${systemd_user_unitdir} \
    ${OE_QMAKE_PATH_PLUGINS} \
"
