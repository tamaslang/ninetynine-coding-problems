package org.talangsoft.codingtests

object p19rotate {
  def rotate[T](rotation: Int,l: List[T]) :List[T]= {
    l.splitAt(if(rotation>=0) rotation else rotation+l.size).swap
      match {case (begin,end) => begin:::end}
  }
}
