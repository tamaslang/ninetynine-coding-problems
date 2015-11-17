package org.talangsoft.codingtests

import org.scalatest._

class p07flattenSpec extends WordSpecLike with ShouldMatchers {
  "flatter" should {
    "return flattened list" in {
      p07flatten.flatten(List(List(1, 1), 2, List(3, List(5, 8)))) shouldBe List(1, 1, 2, 3, 5, 8)
    }
  }

  "flatter" should {
    "return flattened list for a flattened list" in {
      p07flatten.flatten(List(1,2,3,4,5,6,7)) shouldBe List(1,2,3,4,5,6,7)
    }
  }

  "flatter" should {
    "return flattened list for a 1 element nested list" in {
      p07flatten.flatten(List(List(List(1,2,3,4,5,6,7)))) shouldBe List(1,2,3,4,5,6,7)
    }
  }
}
