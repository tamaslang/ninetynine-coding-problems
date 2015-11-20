package org.talangsoft.codingtests

import org.scalatest._

class p15dupilcateNSpec extends WordSpec with ShouldMatchers {

  "duplicateN" should {
    "replicate each element in list n times" in {
      p15duplicateN.duplicateN(3,List('a, 'b, 'c, 'c, 'd)) shouldBe List('a, 'a, 'a, 'b, 'b, 'b, 'c, 'c, 'c, 'c, 'c, 'c, 'd, 'd, 'd)
    }
  }

}
