SUMMARY = "Library for managing partitions"
LICENSE = "CC0-1.0 & CC-BY-SA-4.0 & GPL-3.0+ & MIT"
LIC_FILES_CHKSUM = " \
    file://LICENSES/CC0-1.0.txt;md5=6fd064768b8d61c31ddd0540570fbd33 \
    file://LICENSES/CC-BY-4.0.txt;md5=28bacf04b75cbad10cb7871e0b063188 \
    file://LICENSES/GPL-3.0-or-later.txt;md5=d32239bcb673463ab874e80d47fae504 \
    file://LICENSES/MIT.txt;md5=38aa75cf4c4c87f018227d5ec9638d75 \
"

inherit kde-apps pkgconfig gettext

DEPENDS += " \
    kconfig-native \
    kauth-native \
    kcoreaddons-native \
    qca \
    ki18n \
    kiconthemes \
    kio \
    kservice \
    \
    parted \
    libatasmart \
"

PV = "${KDE_APP_VERSION}"
SRC_URI[sha256sum] = "28a678e39781cd43e42a1cef8a11a170a6bbd9d5347817c2966d9c326f5176cb"

FILES_${PN} += " \
    ${datadir}/k*5 \
    ${datadir}/dbus-1 \
    ${datadir}/polkit-1 \
    ${OE_QMAKE_PATH_PLUGINS} \
"
