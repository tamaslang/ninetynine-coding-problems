package org.talangsoft.codingtests

import org.scalatest.{ShouldMatchers, WordSpecLike}

class p02PenultimateSpec extends WordSpecLike with ShouldMatchers {
  "penultimate" should {
    "return the one before last element for list with more elements" in {
       p02Penultimate.penultimate( List(1, 1, 2, 3, 5, 8)) shouldBe 5
    }
  }
  "penultimate" should {
    "throw exception for a list with size smaller than 2" in {
      an [NoSuchElementException] should be thrownBy {
        p02Penultimate.penultimate(List(1))
      }
    }
  }
}