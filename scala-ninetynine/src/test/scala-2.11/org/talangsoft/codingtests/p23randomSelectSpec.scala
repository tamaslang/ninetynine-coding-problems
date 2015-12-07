package org.talangsoft.codingtests

import org.scalatest.{ShouldMatchers, WordSpec}

class p23randomSelectSpec extends WordSpec with ShouldMatchers{
  "randomSelect" should {
    "select 3 random element from list" in {
      val originalList = List('a, 'b, 'c, 'd, 'f, 'g, 'h)
      val randomElementsFromList = p23randomSelect.randomSelect(3, originalList)
      // validate result size
      randomElementsFromList.size shouldBe 3
      // validate results are not repeated
      randomElementsFromList(0) should not equal randomElementsFromList(1)
      randomElementsFromList(1) should not equal randomElementsFromList(2)
      // validate results are all from the original list
      originalList.contains(randomElementsFromList(0)) shouldBe true
      originalList.contains(randomElementsFromList(1)) shouldBe true
      originalList.contains(randomElementsFromList(2)) shouldBe true
    }
  }
}
