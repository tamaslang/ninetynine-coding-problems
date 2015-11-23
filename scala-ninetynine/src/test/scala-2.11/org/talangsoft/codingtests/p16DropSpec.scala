package org.talangsoft.codingtests

import org.scalatest.{ShouldMatchers, WordSpec}

class p16DropSpec extends WordSpec with ShouldMatchers {

  "drop" should {
    "drop every 3rd element in list" in {
      p16drop.drop(3,List('a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i, 'j, 'k)) shouldBe List('a, 'b, 'd, 'e, 'g, 'h, 'j, 'k)
    }
  }

}
