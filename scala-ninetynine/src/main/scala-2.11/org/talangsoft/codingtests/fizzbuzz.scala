package org.talangsoft.codingtests

object fizzbuzz {

  def fizzBuzz(n: Int, converterFunc: (Int) => String) = 1 to n map converterFunc

  def convertNr(x: Int): String  = x match {
    case x if x % 15 == 0 => "fizzbuzz"
    case x if x % 5 == 0 => "buzz"
    case x if x % 3 == 0 => "fizz"
    case x => x.toString
  }

  def convertNrWithRemainderMatch(n:Int):String = (n%3,n%5) match {
    case (0,0) => "fizzbuzz"
    case (0,_) => "fizz"
    case (_,0) => "buzz"
    case _ => n.toString
  }



}
