package org.talangsoft.codingtests

import org.scalatest.{ShouldMatchers, WordSpec}

class p20removeAtSpec extends WordSpec with ShouldMatchers{
  "removeAt" should {
    "remove elemen at position 1" in {
      p20removeAt.removeAt(1, List('a, 'b, 'c, 'd)) shouldBe (List('a, 'c, 'd),'b)
    }

    "remove elemen at position 0" in {
      p20removeAt.removeAt(0, List('a, 'b, 'c, 'd)) shouldBe (List('b, 'c, 'd),'a)
    }

    "remove elemen at position last" in {
      p20removeAt.removeAt(3, List('a, 'b, 'c, 'd)) shouldBe (List('a, 'b, 'c),'d)
    }
  }
}
