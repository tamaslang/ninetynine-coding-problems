package org.talangsoft.codingtests

object p18slice {
  def slice[T](start: Int,end: Int, l:List[T]):List[T] = l match {
    case head :: tail if(start>0) => slice(start-1, end-1,tail)
    case head :: tail if(end > 0) => head :: slice(0,end-1,tail)
    case _ => List()
  }
}
