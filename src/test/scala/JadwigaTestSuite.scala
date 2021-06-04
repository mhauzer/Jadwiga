package com.mhalab

import org.scalatest.PrivateMethodTester
import org.scalatest.funsuite.AnyFunSuite

class JadwigaTestSuite extends AnyFunSuite with PrivateMethodTester {
  private val StopCondition = "do widzenia"
  private val handleMsg = PrivateMethod[Boolean](Symbol("handleMsg"))

  test("Simple greeting") {
    assertResult("cześć")(Jadwiga reply "cześć")
  }

  test("Simple goodbye") {
    assertResult("do zobaczenia")(Jadwiga reply "do widzenia")
  }

  test("handleMessage returns true for a message that is not a stop condition") {
    assert(JadwigaApp invokePrivate handleMsg("cześć", StopCondition))
  }

  test("handleMessage returns false for a message that is a stop condition") {
    assertResult(false)(JadwigaApp invokePrivate handleMsg("do widzenia", StopCondition))
  }
}
