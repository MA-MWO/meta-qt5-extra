SUMMARY = "Process launcher to speed up launching KDE applications"
LICENSE = "LGPLv2.1"
LIC_FILES_CHKSUM = " \
	file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1 \
"

inherit kde-kf5

DEPENDS += " \
    libcap \
    kservice \
    kio \
    ki18n \
    kwindowsystem \
    kcrash \
    kconfig \
    kdoctools \
    ${@bb.utils.contains("DISTRO_FEATURES", "x11", "virtual/xserver", "", d)} \
"

PV = "${KF5_VERSION}"
SRC_URI[md5sum] = "bbf6f2743ffc9ffba7dcb151e7b579e0"
SRC_URI[sha256sum] = "08bc4f46cb90c164cd3e087e14c42859bf1e26057a0132c2395c6bfafca95d90"

SRC_URI += " \
    file://0001-return-WAYLAND_DISPLAY-if-all-known-options-fail.patch \
    file://0002-kdeinit-fix-paths-to-libraries.patch \
"

FILES_${PN} += "${datadir}/dbus-1 ${libdir}/libkdeinit5_klauncher.so"
FILES_${PN}-dbg += "${libdir}/*/*/.debug"
FILES_${PN}-dev = "${libdir}/cmake"
