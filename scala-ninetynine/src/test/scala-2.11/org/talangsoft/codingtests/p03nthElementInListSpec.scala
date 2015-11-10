package org.talangsoft.codingtests

import org.scalatest._

class p03nthElementInListSpec extends WordSpecLike with ShouldMatchers {
  "nth element" should {
    "return 2nd element from a list with more elements" in {
      val list = List(1, 1, 2, 3, 5, 8)
      p03nthElementInList.nth(2,list) shouldBe 2
    }
  }

  "nth element" should {
    "throw exception for a list with size smaller than n" in {
      val list = List(1)
      an [NoSuchElementException] should be thrownBy {
        p03nthElementInList.nth(1,list)
      }
    }
  }

  "nth element" should {
    "return 1st for index 0 efor a list with 1 element" in {
      val list = List(1)
      p03nthElementInList.nth(0,list) shouldBe 1
    }
  }

  "nth element" should {
    "throw exception for a list with size 1, than n" in {
      val list = List(1)
      an [NoSuchElementException] should be thrownBy {
        p03nthElementInList.nth(1,list)
      }
    }
  }



}
