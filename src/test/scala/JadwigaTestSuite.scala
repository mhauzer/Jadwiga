package com.mhalab

import org.scalatest.PrivateMethodTester
import org.scalatest.funsuite.AnyFunSuite

class JadwigaTestSuite extends AnyFunSuite with PrivateMethodTester {
  test("Simple greeting") {
    assertResult("witaj")(Jadwiga reply "cześć")
  }

  test("Simple goodbye") {
    assertResult("do zobaczenia")(Jadwiga reply "do widzenia")
  }
}
