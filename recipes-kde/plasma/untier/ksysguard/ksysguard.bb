SUMMARY = "KSYSGUARD"
LICENSE = "GPL-2.0 & GFDL-1.2"
LIC_FILES_CHKSUM = " \
    file://COPYING;md5=5c213a7de3f013310bd272cdb6eb7a24 \
    file://COPYING.DOC;md5=ad1419ecc56e060eccf8184a87c4285f \
"

inherit kde-plasma gettext mime-xdg

DEPENDS += " \
    kauth-native \
    kconfig-native \
    kcoreaddons \
    kcoreaddons-native \
    kdoctools-native \
    ki18n \
    kitemviews \
    knewstuff \
    kconfig \
    kiconthemes \
    kdelibs4support \
    libksysguard \
    libnl \
"

# REVISIT optionals
# TODO libcap
DEPENDS += " \
    lmsensors \
    networkmanager-qt \
"

PV = "${PLASMA_VERSION}"
SRC_URI[sha256sum] = "103b34b83fd2ea1af1cb01b67de70be2ad5362e22270d23cd437ac210bca1bb0"

# do not move so-libs to -dev package
FILES_SOLIBSDEV = ""

FILES_${PN} += " \
    ${datadir}/dbus-1 \
    ${datadir}/icons \
    ${datadir}/k*5 \
    ${datadir}/knsrcfiles \
    ${libdir}/libkdeinit5_ksysguard.so \
    ${libdir}/libksgrdbackend.so \
    ${OE_QMAKE_PATH_PLUGINS}/ksysguard \
"
