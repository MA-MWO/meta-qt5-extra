SUMMARY = "A BitTorrent protocol implementation"
LICENSE = "GPL-2.0"
LIC_FILES_CHKSUM = "file://COPYING;md5=5c213a7de3f013310bd272cdb6eb7a24"

inherit kde-apps gettext

DEPENDS += " \
    ki18n-native \
    kcoreaddons-native \
    kconfig-native \
    kauth-native \
    boost \
    gmp \
    qca \
    karchive \
    kcrash \
    kio \
    solid \
"

PV = "${KDE_APP_VERSION}"
SRC_URI[sha256sum] = "f6ee742ca5e3f64bc56e94cd65dd8b69ecbb9b2a901262f6274be69b22793e9c"
SRC_URI += "file://0001-Find-libgmp-with-pkgconfig.patch"
