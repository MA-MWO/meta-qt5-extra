SUMMARY = "Monitoring user activity"
LICENSE = "GPL-2.0+ & LGPL-2.0 & MIT"
LIC_FILES_CHKSUM = " \
    file://LICENSES/GPL-2.0-or-later.txt;md5=fed54355545ffd980b814dab4a3b312c \
    file://LICENSES/LGPL-2.0-only.txt;md5=6d2d9952d88b50a51a5c73dc431d06c7 \
    file://LICENSES/MIT.txt;md5=38aa75cf4c4c87f018227d5ec9638d75 \
"

inherit kde-kf5

DEPENDS += "${@bb.utils.contains("DISTRO_FEATURES", "x11", "libxcb qtx11extras libxscrnsaver", "", d)}"

PV = "${KF5_VERSION}"
SRC_URI[sha256sum] = "d054e755aefb07b35e369b7fcda56c9e1dac00eeab3e7d6f5038101dfb95aa5b"

FILES_${PN} += "${OE_QMAKE_PATH_PLUGINS}"
