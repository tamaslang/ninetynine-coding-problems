package org.talangsoft.codingtests

import org.scalatest._

class p06palindromeSpec extends WordSpecLike with ShouldMatchers {
  "isPalindrome" should {
    "return true for list with even nr of elements" in {
      p06palindrome.isPalindrome(List(1, 2, 2, 1 )) shouldBe true
    }
  }

  "isPalindrome" should {
    "return true for list with odd nr of elements" in {
      p06palindrome.isPalindrome(List(1, 2, 3, 2, 1 )) shouldBe true
    }
  }

  "isPalindrome" should {
    "return true for empty list" in {
      p06palindrome.isPalindrome(List()) shouldBe true
    }
  }


  "isPalindrome" should {
    "return false for list differs in position 1" in {
      p06palindrome.isPalindrome(List(1, 2, 3, 2, 7 )) shouldBe false
    }
  }

  "isPalindrome" should {
    "return false for list differs in position 2" in {
      p06palindrome.isPalindrome(List(1, 2, 3, 7, 1 )) shouldBe false
    }
  }
}