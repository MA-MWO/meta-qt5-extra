SUMMARY = "A dedicated search application built on top of Baloo"
LICENSE = "GPL-2.0 & LGPL-2.1"
LIC_FILES_CHKSUM = " \
    file://COPYING;md5=b234ee4d69f5fce4486a80fdaf4a4263 \
    file://COPYING.LIB;md5=4fbd65380cdd255951079008b364516c \
"

inherit kde-plasma gettext

DEPENDS += " \
    qtscript \
    qtdeclarative \
    \
    kconfig-native \
    kcoreaddons-native \
    kpackage-native \
    krunner \
    plasma-framework \
    ki18n \
    kdeclarative \
    kservice \
    kitemmodels \
"

PV = "${PLASMA_VERSION}"
SRC_URI[sha256sum] = "123ac9470a94f2eb6e4212979d2df4160fa15962b1fc18551bfcdfe5aa18a201"

FILES_${PN} += " \
    ${datadir}/k*5 \
    ${datadir}/plasma \
    ${OE_QMAKE_PATH_PLUGINS} \
    ${OE_QMAKE_PATH_QML} \
"
