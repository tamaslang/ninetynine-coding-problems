package org.talangsoft.codingtests

import org.scalatest.{ShouldMatchers, WordSpec}

class p28lsortSpec extends WordSpec with ShouldMatchers{
  "p28lsort" should {
    "short list by sublist length" in {
      val sorted = p28lsort.lsort(List(List('a, 'b, 'c), List('d, 'e), List('f, 'g, 'h), List('d, 'e), List('i, 'j, 'k, 'l), List('m, 'n), List('o)))
      sorted shouldBe List(List('o), List('d, 'e), List('d, 'e), List('m, 'n), List('a, 'b, 'c), List('f, 'g, 'h), List('i, 'j, 'k, 'l))
    }

    "short list by sublist length frequency" in {
      val sorted = p28lsort.lsortFreq(List(List('a, 'b, 'c), List('d, 'e), List('f, 'g, 'h), List('d, 'e), List('i, 'j, 'k, 'l), List('m, 'n), List('o)))
      sorted shouldBe List(List('i, 'j, 'k, 'l), List('o), List('a, 'b, 'c), List('f, 'g, 'h), List('d, 'e), List('d, 'e), List('m, 'n))
    }
  }
}
