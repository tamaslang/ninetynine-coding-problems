package org.talangsoft.codingtests

import org.scalatest._

class p08compressSpec extends WordSpecLike with ShouldMatchers  {
  "compress" should {
    "compress list" in {
      p08compress.compress(List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e)) shouldBe List('a, 'b, 'c, 'a, 'd, 'e)
    }
  }

  "compress" should {
    "not compress uncompressable list" in {
      p08compress.compress(List('a','b','c','d')) shouldBe List('a', 'b', 'c', 'd')
    }
  }
}
