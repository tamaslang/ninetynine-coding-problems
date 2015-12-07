package org.talangsoft.codingtests

object p20removeAt {
  def removeAt[T](pos:Int, l: List[T]): (List[T],T) = {
    l.splitAt(pos) match {case (begin,end) => (begin:::end.tail,end.head)}
  }
}
