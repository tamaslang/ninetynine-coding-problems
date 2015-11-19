package org.talangsoft.codingtests

import org.scalatest._

class p11encodeModifiedSpec extends WordSpecLike with ShouldMatchers {
  "encode" should {
    "encode a list" in {
      p11encodeModified.encodeModified(List('a','a','a','a','b','c','c','a','a','d','e','e','e','e')) shouldBe List((4,'a'), 'b', (2,'c'), (2,'a'), 'd', (4,'e'))
    }
  }

  "encode" should {
    "encode a simple list" in {
      p11encodeModified.encodeModified(List('a','a','a','a')) shouldBe List((4,'a'))
    }
  }

  "encode" should {
    "encode a one element list" in {
      p11encodeModified.encodeModified(List('a')) shouldBe List('a')
    }
  }

  "encode" should {
    "encode a list with 2 diff element" in {
      p11encodeModified.encodeModified(List('a','b')) shouldBe List('a','b')
    }
  }
}
