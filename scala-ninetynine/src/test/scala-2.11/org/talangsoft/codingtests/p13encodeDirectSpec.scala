package org.talangsoft.codingtests

import org.scalatest.{ShouldMatchers, WordSpec}

class p13encodeDirectSpec extends WordSpec with ShouldMatchers {

  "encodeDirect" should {
    "encode simple list" in {
      p13encodeDirect.encodeDirect(List('a','a','a','a')) shouldBe List((4,'a'))
    }
  }

  "encodeDirect" should {
    "encode complex list" in {
      p13encodeDirect.encodeDirect(List('a','a','a','a','b','c','c','a','a','d','e','e','e','e')) shouldBe List((4,'a'), (1,'b'), (2,'c'), (2,'a'), (1,'d'), (4,'e'))
    }
  }
}
