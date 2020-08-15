SUMMARY = "A Qt/Qml wrapper library for markdown libraries cmark and sundown"
LICENSE = "GPLv3 & BSD-2-Clause & MIT & SUNDOWN"
LIC_FILES_CHKSUM = " \
    file://LICENSE;md5=5b4473596678d62d9d83096273422c8c \
    file://LICENSE.cmarkdown-gfm;md5=81f9cae6293cc0345a9144b78152ab62 \
    file://LICENSE.github-markdown-css;md5=915042b5df33c31a6db2b37eadaa00e3 \
    file://LICENSE.sundown;beginline=117;endline=128;md5=2cd7bacd09353172bdd3ac13b6c59568 \
"

DEPENDS = " \
    qtbase \
    qtdeclarative \
    qtwebengine \
    cmark \
"

SRC_URI = "gitsm://github.com/schnitzeltony/markdown-qt.git"
SRCREV = "c790c84d2b214b341cb58e06529f8041fc13eac4"
PV = "0.0.1+git${SRCPV}"
S = "${WORKDIR}/git"

inherit cmake_qt5

FILES_${PN} += "${libdir}/libmarkdown-qt"
