package org.talangsoft.codingtests

object p01LastElementInList {

    def last[T](l: List[T]): T = {
      if (l.size==0) throw new NoSuchElementException
      else if (l.size==1) l.head
      else l(l.size-1)
    }
}
