package org.talangsoft.codingtests

import org.scalatest.{ShouldMatchers, WordSpec}

class p22rangeSpec extends WordSpec with ShouldMatchers{
  "range" should {
    "return range" in {
      p22range.range(4,9) shouldBe List(4, 5, 6, 7, 8, 9)
    }
  }

}
