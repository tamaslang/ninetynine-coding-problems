package org.talangsoft.codingtests

import org.scalatest._

class fizzBuzzSpec  extends WordSpecLike with ShouldMatchers {

  "fizzbuzz with basix conversion" should {
    "should fizz n buzz" in {
      fizzbuzz.fizzBuzz(20, fizzbuzz.convertNr) shouldBe Vector("1", "2", "fizz", "4", "buzz", "fizz", "7", "8", "fizz", "buzz", "11", "fizz", "13", "14", "fizzbuzz", "16", "17", "fizz", "19", "buzz")
    }
  }

  "fizzbuzz with remainder match conversion" should {
    "should fizz n buzz" in {
      fizzbuzz.fizzBuzz(20,fizzbuzz.convertNrWithRemainderMatch) shouldBe Vector("1", "2", "fizz", "4", "buzz", "fizz", "7", "8", "fizz", "buzz", "11", "fizz", "13", "14", "fizzbuzz", "16", "17", "fizz", "19", "buzz")
    }
  }
}
