package org.talangsoft.codingtests

import org.scalatest.{ShouldMatchers, WordSpec}

class p12decodeSpec extends WordSpec with ShouldMatchers {
  "decode" should {
    "decode simple runlength encoded list" in {
      p12decode.decode(List((4,'a'))) shouldBe List('a','a','a','a')
    }
  }

  "decode" should {
    "decode long runlength encoded list" in {
      p12decode.decode(List((4, 'a'), (1, 'b'), (2, 'c'), (2, 'a'), (1, 'd'), (4, 'e'))) shouldBe
        List('a', 'a', 'a', 'a', 'b', 'c', 'c', 'a', 'a', 'd', 'e', 'e', 'e', 'e')
    }
  }

}
