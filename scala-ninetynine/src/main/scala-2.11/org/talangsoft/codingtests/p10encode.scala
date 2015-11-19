package org.talangsoft.codingtests

object p10encode {
  def encode[T](l:List[T]):List[Any] = {
    if(l.isEmpty) List()
    else {
      val (packed, next) = l.span(_ == l.head)
      (packed.size, packed.head) :: encode(next)
    }
  }


}
