package org.talangsoft.codingtests

import scala.annotation.tailrec

object p01LastElementInList {

  @tailrec
  def last[T](l: List[T]): T = {
      print(s"SIZE: l.size");
      if (l.size==0) throw new NoSuchElementException
      else if (l.size==1) l.head
      else last(l.tail)
  }
}
