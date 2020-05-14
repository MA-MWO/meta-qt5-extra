SUMMARY = "Interaction with XMLRPC services"
LICENSE = "BSD"
LIC_FILES_CHKSUM = " \
	file://COPYING.BSD;md5=5c262c13b60ebefe3060aed37d334ab6 \
"

inherit kde-kf5 gettext

DEPENDS += "ki18n kio kcoreaddons-native kconfig-native kauth-native"

PV = "${KF5_VERSION}"
SRC_URI[md5sum] = "b1e8cf4271ff15c2405ea53a1ad96770"
SRC_URI[sha256sum] = "0b75fdd516efa6f2c7eec58eccca0c7949c4e7f98e2b5b2494283a9fb8d8aeb2"
