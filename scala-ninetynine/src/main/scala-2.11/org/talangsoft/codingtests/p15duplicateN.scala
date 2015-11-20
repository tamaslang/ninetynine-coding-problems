package org.talangsoft.codingtests

object p15duplicateN {
  def duplicateN[T](n:Int, l:List[T]):List[T] = l match {
    case head :: tail => List.fill(n)(head) ::: duplicateN(n,tail)
    case _ => List()
  }
}
