package org.talangsoft.codingtests

import org.scalatest.{ShouldMatchers, WordSpec}

class p21insertAtSpec extends WordSpec with ShouldMatchers {
  "insertAt" should {
    "insert element at pos 1" in {
      p21insertAt.insertAt('new, 1, List('a, 'b, 'c, 'd)) shouldBe List('a, 'new, 'b, 'c, 'd)
    }

    "insert element at pos 0" in {
      p21insertAt.insertAt('new, 0, List('a, 'b, 'c, 'd)) shouldBe List('new, 'a, 'b, 'c, 'd)
    }

    "insert element at pos last" in {
      p21insertAt.insertAt('new, 4, List('a, 'b, 'c, 'd)) shouldBe List('a, 'b, 'c, 'd, 'new)
    }
  }
}
