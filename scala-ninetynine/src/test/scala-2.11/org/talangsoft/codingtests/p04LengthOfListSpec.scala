package org.talangsoft.codingtests

import org.scalatest._

class p04LengthOfListSpec extends WordSpecLike with ShouldMatchers {
  "length of list" should {
    "return 0 for empty list" in {
      p04LengthOfList.length(List()) shouldBe 0
    }
  }

  "length of list" should {
    "return 6 for list with 6 element" in {
      p04LengthOfList.length(List(1, 1, 2, 3, 5, 8)) shouldBe 6
    }
  }
}