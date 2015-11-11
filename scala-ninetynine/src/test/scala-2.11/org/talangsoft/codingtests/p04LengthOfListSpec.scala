package org.talangsoft.codingtests

import org.scalatest._

class p04LengthOfListSpec extends WordSpecLike with ShouldMatchers {
  "length of list" should {
    "return 0 for empty list" in {
      val list:List[Int] = List()
      p04LengthOfList.length(list) shouldBe 0
    }
  }

  "length of list" should {
    "return 6 for list with 6 element" in {
      val list = List(1, 1, 2, 3, 5, 8)
      p04LengthOfList.length(list) shouldBe 6
    }
  }
}