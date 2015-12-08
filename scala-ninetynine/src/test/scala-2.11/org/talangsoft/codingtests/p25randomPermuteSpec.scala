package org.talangsoft.codingtests

import org.scalatest.{ShouldMatchers, WordSpec}

class p25randomPermuteSpec extends WordSpec with ShouldMatchers{
  "randomPermute" should {
    "random pemrute list" in {
      val originalList = List('a, 'b, 'c, 'd, 'e, 'f)
      val permute = p25randomPermute.randomPermute(originalList)
      permute.size shouldBe 6 // e.g.: List('b, 'a, 'd, 'c, 'e, 'f)
      for((p,index) <- permute.zipWithIndex) {
        originalList.contains(p) shouldBe true
        if(index<permute.size-1) permute.takeRight(permute.size-index-1).contains(p) shouldBe false // should not be 2 times in the list
      }
    }
  }
}
