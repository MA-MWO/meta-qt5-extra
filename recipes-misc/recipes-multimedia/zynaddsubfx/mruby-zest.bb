require ${BPN}.inc

REQUIRED_DISTRO_FEATURES = "x11 opengl"

inherit autotools-brokensep distro_features_check

SRC_URI += " \
    file://0005-mruby-Use-native-mrbc.patch \
    file://0006-mruby-regexp-pcre-link-against-libpcre.patch \
"

DEPENDS += " \
    ${BPN}-native \
    virtual/libx11 \
    virtual/egl \
    virtual/libgles2 \
    libuv \
    libpcre \
"

# This is by far the worst hack I've ever done but the ruby/rake mixed with
# autotools (don't forget git submodules) does not allow a cleaner approach.
# But we are lucky: there is only one autoconf target (yet). If that happens
# we need to try running autotoools multiple times in a dynamically
# linked forlder. Let's hope that will not be necessary...

AUTOTOOLS_SCRIPT_PATH = "${S}/mruby/build/mrbgems/mruby-file-stat"

do_configure_prepend() {
    # taken from https://github.com/zynaddsubfx/zyn-fusion-build/blob/master/build-rpi3.rb
    sed -i -- 's/GL2/GLES2/g' ${WORKDIR}/git/src/mruby-widget-lib/src/gem.c
    sed -i -- 's/MRUBY_NANOVG_GL2/MRUBY_NANOVG_GLES2/g' ${WORKDIR}/git/build_config.rb
    sed -i '/idiot/d' ${WORKDIR}/git/deps/mruby-nanovg/src/nvg_impl.h

    # Fetch ruby gems. Although unexpected it starts building happily and
    # breaks so ignore that.
    cd mruby
    MRUBY_CONFIG=../build_config.rb ruby minirake --pull-gems || true

    # ensure config.h is created at the right place...
    cd build/mrbgems/mruby-file-stat/src
}

do_install() {
    oe_runmake pack

    install -d ${D}/opt/zyn-fusion
    install -m 755 ${B}/package/zest ${D}/opt/zyn-fusion/zyn-fusion
    cp -a ${B}/package/{libzest.so,font,schema} ${D}/opt/zyn-fusion/

    install -d ${D}/opt/zyn-fusion/qml
    touch ${D}/opt/zyn-fusion/qml/MainWindow.qml

    install -d ${D}${bindir}
	ln -s /opt/zyn-fusion/zyn-fusion ${D}${bindir}
}

FILES_${PN} += "/opt/zyn-fusion/*"
