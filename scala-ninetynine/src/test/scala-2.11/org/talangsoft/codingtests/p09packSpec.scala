package org.talangsoft.codingtests

import org.scalatest._

class p09packSpec extends WordSpecLike with ShouldMatchers {

  "pack" should {
    "pack list of same elements" in {
      p09pack.pack(List('a', 'a', 'a', 'a')) shouldBe List(List('a','a','a','a'))
    }
  }

  "pack" should {
    "pack individually list of different elements" in {
      p09pack.pack(List('a', 'b', 'c', 'd')) shouldBe List(List('a'),List('b'),List('c'),List('d'))
    }
  }

  "pack" should {
    "pack list of many elements" in {
      p09pack.pack(List('a', 'a', 'a', 'a', 'b', 'c', 'c', 'a', 'a', 'd', 'e', 'e', 'e', 'e')) shouldBe List(List('a', 'a', 'a', 'a'), List('b'), List('c', 'c'), List('a', 'a'), List('d'), List('e', 'e', 'e', 'e'))
    }
  }

}
