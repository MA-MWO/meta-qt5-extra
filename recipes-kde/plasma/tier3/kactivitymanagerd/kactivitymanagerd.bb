SUMMARY = "System service to manage user's activities"
LICENSE = "GPLv2 | GPLv3"
LIC_FILES_CHKSUM = " \
    file://COPYING.GPL2;md5=b234ee4d69f5fce4486a80fdaf4a4263 \
    file://COPYING.GPL3;md5=d32239bcb673463ab874e80d47fae504 \
"

inherit kde-plasma gettext

DEPENDS += " \
    boost \
    kdbusaddons \
    ki18n \
    kauth-native \
    kcoreaddons \
    kcoreaddons-native \
    kconfig \
    kconfig-native \
    kxmlgui \
    kwindowsystem \
    kio \
    kservice \
    kglobalaccel \
"

PV = "${PLASMA_VERSION}"
SRC_URI[md5sum] = "d7aa47027645ed446177daac5743dd1b"
SRC_URI[sha256sum] = "24f32eb4585d427ee62e08a9fa2f057353085c62644d6bec8fb4b2568e507ac7"
SRC_URI += "file://0001-replace-try_run-by-try_compile-in-compiler-feature-c.patch"

# Workaround
# default_constructible_unary_fn.hpp:38:9: error: no match for 'operator==' (operand types are 'const boost::optional<std::_Bind<ActivityInfo (Activities::*(const Activities*, std::_Placeholder<1>))(const QString&) const> >' and 'int')
CXXFLAGS += "-DBOOST_DISABLE_ASSERTS"

FILES_SOLIBSDEV = ""

FILES_${PN} += " \
	${datadir}/k*5 \
    ${datadir}/dbus-1 \
    ${libdir}/libkactivitymanagerd_plugin.so \
    ${OE_QMAKE_PATH_PLUGINS} \
"
