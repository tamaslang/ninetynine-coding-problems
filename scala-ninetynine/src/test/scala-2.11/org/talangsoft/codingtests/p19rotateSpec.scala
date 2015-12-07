package org.talangsoft.codingtests

import org.scalatest.{ShouldMatchers, WordSpec}

class p19rotateSpec extends WordSpec with ShouldMatchers{
  "rotate" should {
    "rotate list with a positive rotation nr" in {
      p19rotate.rotate(3, List('a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i, 'j, 'k)) shouldBe
        List('d, 'e, 'f, 'g, 'h, 'i, 'j, 'k, 'a, 'b, 'c)
    }

    "not rotate list with 0 rotation" in {
      p19rotate.rotate(0, List('a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i, 'j, 'k)) shouldBe
        List('a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i, 'j, 'k)
    }

    "rotate list to itself with rotation list size" in {
      p19rotate.rotate(11, List('a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i, 'j, 'k)) shouldBe
        List('a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i, 'j, 'k)
    }

    "rotate list to itself with rotation multiple list size" in {
      p19rotate.rotate(33, List('a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i, 'j, 'k)) shouldBe
        List('a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i, 'j, 'k)
    }

    "rotate list to itself with rotation negative multiple list size" in {
      p19rotate.rotate(-33, List('a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i, 'j, 'k)) shouldBe
        List('a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i, 'j, 'k)
    }


    "rotate list with a negative rotation nr" in {
      p19rotate.rotate(-2, List('a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i, 'j, 'k)) shouldBe
        List('j, 'k, 'a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i)
    }
  }


}
