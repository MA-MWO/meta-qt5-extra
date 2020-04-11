SUMMARY = "Monitoring user activity"
LICENSE = "GPLv2 | LGPLv2.1"
LIC_FILES_CHKSUM = " \
	file://COPYING;md5=5c213a7de3f013310bd272cdb6eb7a24 \
	file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1 \
"

inherit kde-kf5

DEPENDS += "${@bb.utils.contains("DISTRO_FEATURES", "x11", "libxcb qtx11extras libxscrnsaver", "", d)}"

PV = "${KF5_VERSION}"
SRC_URI[md5sum] = "eaa25bcf56f201ea95e42c6ef25fea0d"
SRC_URI[sha256sum] = "c78fc5cc59c022431876e185e9182bc448b1b71e1ffabef291274c093be815c4"

FILES_${PN} += "${OE_QMAKE_PATH_PLUGINS}"
