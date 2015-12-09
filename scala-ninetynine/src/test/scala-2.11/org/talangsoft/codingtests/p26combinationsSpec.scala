package org.talangsoft.codingtests

import org.scalatest.{ShouldMatchers, WordSpec}

class p26combinationsSpec extends WordSpec with ShouldMatchers{
  "combination" should {
    "return 1 combination for taking 3 of 3 element list" in {
      p26combinations.combinations(3,List('a,'b,'c)) shouldBe List(List('a,'b,'c))
    }

    "return 2 combinations for taking 3 of 4 element list" in {
      p26combinations.combinations(3,List('a,'b,'c,'d)) shouldBe List(List('a,'b,'c),List('a,'b,'d),List('a,'c,'d),List('b,'c,'d))
    }

    "return 120 combinations for taking 3 of 12 element list" in {
      p26combinations.combinations(3,List(1,2,3,4,5,6,7,8,9,10,11,12)).size shouldBe 220
    }
  }
}
