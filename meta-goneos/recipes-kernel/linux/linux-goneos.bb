DESCRIPTION = "Linux Kernel for GoneOS"
LICENSE = "GPL-2.0-only"
LIC_FILES_CHKSUM = "file://${COREBASE}/LICENSES/GPL-2.0-only.txt;md5=d41d8cd98f00b204e9800998ecf8427e"

inherit kernel

SRC_URI = "git:///workspace/poky/external/kernel;protocol=file;branch=master \
           file://defconfig"

SRCREV = "${AUTOREV}"

S = "${WORKDIR}/git"

KERNEL_DEFCONFIG = "defconfig"
