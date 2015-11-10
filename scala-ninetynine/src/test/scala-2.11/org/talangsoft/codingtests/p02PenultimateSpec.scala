package org.talangsoft.codingtests

import org.scalatest.{ShouldMatchers, WordSpecLike}

class p02PenultimateSpec extends WordSpecLike with ShouldMatchers {
  "penultimate" should {
    "return the one before last element for list with more elements" in {
       val list = List(1, 1, 2, 3, 5, 8)
       p02Penultimate.penultimate(list) shouldBe 5
    }
  }
  "penultimate" should {
    "throw exception for a list with size smaller than 2" in {
      val list = List(1)
      an [NoSuchElementException] should be thrownBy {
        p02Penultimate.penultimate(list)
      }
    }
  }
}