SUMMARY = "Monitoring user activity"
LICENSE = "GPLv2 | LGPLv2.1"
LIC_FILES_CHKSUM = " \
	file://COPYING;md5=5c213a7de3f013310bd272cdb6eb7a24 \
	file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1 \
"

inherit kde-kf5

DEPENDS += "${@bb.utils.contains("DISTRO_FEATURES", "x11", "libxcb qtx11extras libxscrnsaver", "", d)}"

PV = "${KF5_VERSION}"
SRC_URI[md5sum] = "8049864248f5ab73af529140a10b0386"
SRC_URI[sha256sum] = "5b8e81f0005d997d8bddfa02ba0f6228a21f472dc05960a81bf938c33b81a6d6"

FILES_${PN} += "${OE_QMAKE_PATH_PLUGINS}"
