package org.talangsoft.codingtests

import org.scalatest.{ShouldMatchers, WordSpecLike}

class p01LastElementInListSpec extends WordSpecLike with ShouldMatchers{
  "last element" should {
    "return first element for list with 1 item" in {
      val list = List(1)
      p01LastElementInList.last(list) shouldBe 1
    }
  }

  "last element" should {
    "return last element for list with more items" in {
      val list = List(1, 1, 2, 3, 5, 8)
      p01LastElementInList.last(list) shouldBe 8
    }
  }

  "last element" should {
    "thrown NoSuchElementException for an empty list" in {
      val list = List.empty[Int]
      an [NoSuchElementException] should be thrownBy {
        p01LastElementInList.last(list)
      }
    }
  }

}
