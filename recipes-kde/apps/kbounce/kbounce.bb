SUMMARY = "KBounce is a single player arcade game with the elements of puzzle"
DESCRIPTION = "KBounce is a single player arcade game with the elements of puzzle. It is played on a field, surrounded by wall, with two or more balls bouncing around within the walls. The object of the game is to build new walls to decrease the size of the active field."
LICENSE = "GPLv2 & LGPLv2 & GFDL-1.2"
LIC_FILES_CHKSUM = " \
    file://COPYING;md5=b234ee4d69f5fce4486a80fdaf4a4263 \
    file://COPYING.LIB;md5=5f30f0716dfdd0d91eb439ebec522ec2 \
    file://COPYING.DOC;md5=ad1419ecc56e060eccf8184a87c4285f \
"

inherit kde-apps gettext

DEPENDS += "\
    kauth-native \
    kconfig-native \
    kcoreaddons-native \
    kdoctools-native \
    kdbusaddons  \
    ki18n \
    kguiaddons \
    kconfigwidgets \
    kiconthemes \
    kcompletion \
    ktextwidgets \
    kxmlgui \
    kio \
    knotifyconfig \
    libkdegames \
"

PV = "${KDE_APP_VERSION}"
SRC_URI[md5sum] = "0073a901af8bd25a30d945b62a35a90c"
SRC_URI[sha256sum] = "9a752b37694e26268129e2aa2dc550e72c75f0c8cfd9248eca097bb00fe5cfab"

FILES_${PN} += " \
    ${datadir}/kxmlgui5 \
    ${datadir}/icons \
"
