package org.talangsoft.codingtests

object p12decode {
  def decode[T](l: List[(Int,T)]) : List[T] = {
    if (l.size == 0) List()
    else List.fill(l.head._1)(l.head._2) ::: decode(l.tail)
  }
}
