package org.talangsoft.codingtests

import org.scalatest._

class p05reverseSpec extends WordSpecLike with ShouldMatchers {
  "reverse list" should {
    "return reversed for a list with even nr of elements" in {
      p05reverse.reverse(List(1, 1, 2, 3, 5, 8)) shouldBe List(8, 5, 3, 2, 1, 1)
    }
  }

  "reverse list" should {
    "return reversed for a list of odd nr of elements" in {
      p05reverse.reverse(List(1, 1, 3, 5, 8)) shouldBe List(8, 5, 3, 1, 1)
    }
  }

  "reverse list" should {
    "return empty list for empty list" in {
      p05reverse.reverse(List()) shouldBe List()
    }
  }

}