package org.talangsoft.codingtests

import org.scalatest.{ShouldMatchers, WordSpecLike}

class p01LastElementInListSpec extends WordSpecLike with ShouldMatchers{
  "last element" should {
    "return first element for list with 1 item" in {
      p01LastElementInList.last(List(1)) shouldBe 1
    }
  }

  "last element" should {
    "return last element for list with more items" in {
      p01LastElementInList.last(List(1, 1, 2, 3, 5, 8)) shouldBe 8
    }
  }

  "last element" should {
    "thrown NoSuchElementException for an empty list" in {
      an [NoSuchElementException] should be thrownBy {
        p01LastElementInList.last(List.empty[Int])
      }
    }
  }

}
