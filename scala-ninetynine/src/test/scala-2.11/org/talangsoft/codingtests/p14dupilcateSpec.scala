package org.talangsoft.codingtests

import org.scalatest._

class p14dupilcateSpec extends WordSpec with ShouldMatchers {

  "duplicate" should {
    "duplicate each element in list" in {
      p14duplicate.duplicate(List('a, 'b, 'c, 'c, 'd)) shouldBe List('a, 'a, 'b, 'b, 'c, 'c, 'c, 'c, 'd, 'd)
    }
  }

}
