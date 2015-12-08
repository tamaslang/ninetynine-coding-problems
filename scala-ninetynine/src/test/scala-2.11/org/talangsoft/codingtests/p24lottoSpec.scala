package org.talangsoft.codingtests

import org.scalatest.{ShouldMatchers, WordSpec}

class p24lottoSpec extends WordSpec with ShouldMatchers{
  "lotto" should {
    "take 6 numbers" in {
      val nrs = p24lotto.lotto(6,49)
      // validate result size
      nrs.size shouldBe 6
      // validate results are not repeated
      nrs(0) should not equal nrs(1)
      nrs(1) should not equal nrs(2)
      nrs(2) should not equal nrs(3)
      nrs(3) should not equal nrs(4)
      nrs(4) should not equal nrs(5)
      // validate results are all from the original list
      for(nr <- nrs) nr>=1 && nr<=49 shouldBe true
    }
  }

}
