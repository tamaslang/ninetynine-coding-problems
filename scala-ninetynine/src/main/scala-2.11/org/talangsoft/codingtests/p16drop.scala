package org.talangsoft.codingtests

object p16drop {
  def drop[T](n: Int, l:List[T]):List[T]= {
    l.splitAt(n-1) match {
      case (begin,head::end) => begin ::: drop(n,end);
      case (begin, Nil) => l
    }
  }
}
