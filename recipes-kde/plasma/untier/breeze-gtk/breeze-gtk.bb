SUMMARY = "Widget theme for GTK 2 and 3"
LICENSE = "BSD-3-Clause & LGPL-2.1"
LIC_FILES_CHKSUM = " \
    file://LICENSES/BSD-3-Clause.txt;md5=954f4d71a37096249f837652a7f586c0 \
    file://LICENSES/LGPL-2.1-only.txt;md5=fabba2a3bfeb22a6483d44e9ae824d3f \
"

inherit kde-plasma python3native

DEPENDS += "sassc-native cairo breeze python3-pycairo-native"

PV = "${PLASMA_VERSION}"
SRC_URI[sha256sum] = "0fab052f237447df0de55701ab8fb2edce968c865fbba2f2c934d9dc53f0c719"

FILES_${PN} += " \
    ${datadir}/kconf_update \
    ${datadir}/themes \
    ${libdir}/kconf_update_bin \
"
