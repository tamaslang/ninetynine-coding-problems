package org.talangsoft.codingtests

import org.scalatest.{ShouldMatchers, WordSpecLike}

class p01LastElementInListSpec extends WordSpecLike with ShouldMatchers{
  "last element" should {
    "return first element for list with 1 item" in {
      val list = List(1)
      p01LastElementInList.last(list) shouldBe 1
    }
  }
}
