package org.talangsoft.codingtests

import scala.annotation.tailrec


object p04LengthOfList {

  def length[T](l: List[T]):Int = {
    @tailrec
    def count(c:Int, l:List[T]): Integer = l match {
      case h :: Nil => c+1
      case h :: t => count(c+1, t)
      case _ => 0
    }
    count(0, l)
  }

 }
