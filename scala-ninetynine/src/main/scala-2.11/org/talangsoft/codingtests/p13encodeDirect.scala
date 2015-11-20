package org.talangsoft.codingtests

object p13encodeDirect {
  def encodeDirect[T](l:List[T]):List[(Int,T)] = {
    if(l.size == 0) List()
    else l span(_ == l.head) match {
      case (packed,next) => List((packed.size,packed(0))):::encodeDirect(next)}
    }
}
