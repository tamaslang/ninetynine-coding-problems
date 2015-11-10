package org.talangsoft.codingtests

object p02Penultimate {
  def penultimate[T](l: List[T]):T=  {
    if(l.size < 2) throw new NoSuchElementException
    else if(l.size == 2) l.head
    else penultimate(l.tail)
  }

}
