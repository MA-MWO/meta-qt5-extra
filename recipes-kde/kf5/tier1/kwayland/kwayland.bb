SUMMARY = "KWayland provides a Qt-style Client and Server library wrapper for the Wayland libraries"
LICENSE = "BSD-3-Clause & LGPL-2.1 & LGPL-2.1+ & LGPL-3.0 & MIT & MIT-CMU"
LIC_FILES_CHKSUM = " \
    file://LICENSES/BSD-3-Clause.txt;md5=954f4d71a37096249f837652a7f586c0 \
    file://LICENSES/LGPL-2.1-only.txt;md5=fabba2a3bfeb22a6483d44e9ae824d3f \
    file://LICENSES/LGPL-2.1-or-later.txt;md5=2a4f4fd2128ea2f65047ee63fbca9f68 \
    file://LICENSES/LGPL-3.0-only.txt;md5=c51d3eef3be114124d11349ca0d7e117 \
    file://LICENSES/MIT.txt;md5=38aa75cf4c4c87f018227d5ec9638d75 \
    file://LICENSES/MIT-CMU.txt;md5=b6936b5be2ab721140d9bf57c37b0b92 \
"

inherit kde-kf5

DEPENDS += " \
    qtwayland-native \
    qtwayland \
    plasma-wayland-protocols \
"

PV = "${KF5_VERSION}"
SRC_URI[sha256sum] = "a0a2fe5a02cb2a7a9f020d396ac3ffaff2b6259499a8a960d6fc4c0d0a256d9b"
