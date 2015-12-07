package org.talangsoft.codingtests

import org.scalatest.{ShouldMatchers, WordSpec}

class p17splitSpec extends WordSpec with ShouldMatchers  {
  "split" should {
    "split list in " in {
      p17split.split(3, List('a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i, 'j, 'k)) shouldBe
        (List('a, 'b, 'c),List('d, 'e, 'f, 'g, 'h, 'i, 'j, 'k))
    }
  }
}
