package org.talangsoft.codingtests

object p05reverse {

  def reverse[T](l:List[T] ):List[T] =  l match {
    case head :: (m :+ tail) => tail :: (reverse(m) :+ head)
    case el => el
  }

}
