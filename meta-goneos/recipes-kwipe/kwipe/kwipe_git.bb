DESCRIPTION = "kwipe tool for secure erasure"
LICENSE = "GPLv3"
LIC_FILES_CHKSUM = "file://${COREBASE}/LICENSES/GPL-3.0-only.txt;md5=<checksum>"

SRC_URI = "git://github.com/Knogle/kwipe.git;branch=master"
SRCREV = "${AUTOREV}"

S = "${WORKDIR}/git"

inherit autotools

do_configure() {
    ./autogen.sh
}

do_install() {
    oe_runmake install DESTDIR=${D}
}
