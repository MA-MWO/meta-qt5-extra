SUMMARY = "raw image decoder"
LICENSE = "LGPL-2.1 | CDDL-1.0"
LIC_FILES_CHKSUM = "file://COPYRIGHT;md5=74c9dffdc42805f9c0de2f97df6031fc"

SRC_URI = "git://github.com/LibRaw/LibRaw.git"
SRCREV = "0209b6a2caec189e6d1a9b21c10e9e49f46e5a92"
S = "${WORKDIR}/git"
PV = "0.20.2"

inherit autotools pkgconfig

DEPENDS = "jpeg jasper lcms"
