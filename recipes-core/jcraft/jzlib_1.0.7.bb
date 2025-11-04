SUMMARY = "zlib implementation in Java"
LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=a2b2e5b95bf768dd5c4ca097c9cde9e9"

HOMEPAGE = "http://www.jcraft.com/jzlib"

SRC_URI = "https://github.com/nedap/nsm-mirror-jzlib/releases/download/jzlib-1.0.7/jzlib-1.0.7.tar.gz"

inherit java-library

do_compile() {
  mkdir -p build

  javac -sourcepath . -d build `find com -name "*.java"`

  fastjar cf ${JARFILENAME} -C build .
}

SRC_URI[sha256sum] = "20923a3f771a14c58c8cddfff2b589d568aff09f8a931919dc63ddaabb32407a"

BBCLASSEXTEND = "native"

