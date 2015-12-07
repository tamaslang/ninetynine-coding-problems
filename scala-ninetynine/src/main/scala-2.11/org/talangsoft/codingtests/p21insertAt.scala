package org.talangsoft.codingtests

object p21insertAt {
  def insertAt[T](el: T, pos:Int, l: List[T]) = {
    l.splitAt(pos) match {case (begin,end) => (begin:+el):::end }
  }
}
