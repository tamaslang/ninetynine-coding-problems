package org.talangsoft.codingtests

import org.scalatest.{ShouldMatchers, WordSpec}

class p18sliceSpec extends WordSpec with ShouldMatchers{
  "slice" should {
    "slice list" in {
      p18slice.slice(3, 7, List('a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i, 'j, 'k)) shouldBe  List('d, 'e, 'f, 'g)
    }
  }

}
