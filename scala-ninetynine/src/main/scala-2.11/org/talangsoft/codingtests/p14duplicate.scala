package org.talangsoft.codingtests

object p14duplicate {
  def duplicate[T](l:List[T]):List[T] = l match {
    case head :: tail => List(head,head) ::: duplicate(tail)
    case _ => List()
  }
}
