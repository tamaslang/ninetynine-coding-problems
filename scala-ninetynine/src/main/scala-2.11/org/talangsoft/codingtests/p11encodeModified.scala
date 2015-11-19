package org.talangsoft.codingtests

object p11encodeModified {
  def encodeModified[T](l:List[T]):List[Any] = {
    if(l.isEmpty) List()
    else l.span(_ == l.head) match {
        case (packed,next) if packed.size == 1 => packed.head :: encodeModified(next)
        case (packed,next) => (packed.size, packed.head) :: encodeModified(next)
      }
  }


}
