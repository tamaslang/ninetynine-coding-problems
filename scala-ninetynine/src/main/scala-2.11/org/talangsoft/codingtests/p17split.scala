package org.talangsoft.codingtests

import scala.annotation.tailrec

object p17split {
  def split[T](position: Int, l: List[T]): (List[T],List[T]) = {
    @tailrec
    def splitRec[T](position: Int,head: List[T], tail: List[T]): (List[T],List[T]) = {
      if(position == 0) (head,tail)
      else splitRec(position-1,head:+tail.head,tail.drop(1))
    }
    splitRec(position,List(),l)
  }
}
