package org.talangsoft.codingtests

import org.scalatest._

class p10encodeSpec extends WordSpecLike with ShouldMatchers {
  "encode" should {
    "encode a list" in {
      p10encode.encode(List('a','a','a','a','b','c','c','a','a','d','e','e','e','e')) shouldBe List((4,'a'), (1,'b'), (2,'c'), (2,'a'), (1,'d'), (4,'e'))
    }
  }

  "encode" should {
    "encode a simple list" in {
      p10encode.encode(List('a','a','a','a')) shouldBe List((4,'a'))
    }
  }

  "encode" should {
    "encode a one element list" in {
      p10encode.encode(List('a')) shouldBe List((1,'a'))
    }
  }

  "encode" should {
    "encode a list with 2 diff element" in {
      p10encode.encode(List('a','b')) shouldBe List((1,'a'),(1,'b'))
    }
  }
}
