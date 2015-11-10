package org.talangsoft.codingtests

import scala.annotation.tailrec

object p03nthElementInList {
//  scala> nth(2, List(1, 1, 2, 3, 5, 8))
//  res0: Int = 2
  @tailrec
  def nth[T](n:Int, l: List[T]): T = {
    if (l.size < n+1) throw new NoSuchElementException
    else if(n == 0) l.head
    else nth(n-1, l.tail)
  }
}
