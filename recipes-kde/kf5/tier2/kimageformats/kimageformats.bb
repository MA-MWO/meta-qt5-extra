SUMMARY = "Image format plugins for Qt"
LICENSE = "LGPL-2.0+ & LGPL-2.1 & LGPL-2.1+ & LGPL-3.0"
LIC_FILES_CHKSUM = " \
    file://LICENSES/LGPL-2.0-or-later.txt;md5=6d2d9952d88b50a51a5c73dc431d06c7 \
    file://LICENSES/LGPL-2.1-only.txt;md5=fabba2a3bfeb22a6483d44e9ae824d3f \
    file://LICENSES/LGPL-2.1-or-later.txt;md5=2a4f4fd2128ea2f65047ee63fbca9f68 \
    file://LICENSES/LGPL-3.0-only.txt;md5=c51d3eef3be114124d11349ca0d7e117 \
"

inherit kde-kf5

DEPENDS += " \
    karchive \
    ${@bb.utils.contains("DISTRO_FEATURES", "x11", "qtx11extras", "", d)} \
"

PV = "${KF5_VERSION}"
SRC_URI[sha256sum] = "3e7852b85f2a2e5d7136548747b5fd75b8c81e99c9f691bb8a168ce72bb1057d"

FILES_${PN} += " \
    ${OE_QMAKE_PATH_PLUGINS} \
    ${datadir}/kservices5 \
"
