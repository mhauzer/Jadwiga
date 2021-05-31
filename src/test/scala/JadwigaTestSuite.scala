package com.mhalab

import org.scalatest.PrivateMethodTester
import org.scalatest.funsuite.AnyFunSuite

class JadwigaTestSuite extends AnyFunSuite with PrivateMethodTester {
  test("Simple greeting") {
    assertResult("Cześć")(Jadwiga reply "Cześć")
  }

  test("Simple goodbye") {
    assertResult("Do widzenia")(Jadwiga reply "Do widzenia")
  }
}
