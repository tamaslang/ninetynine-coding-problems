package org.talangsoft.codingtests

object p08compress {
  def compress[T](l:List[T]):List[T] = l match  {
    case (current:T) :: (next:T) :: tail if current == next  => compress(next :: tail)
    case unique :: tail => List(unique):::compress(tail)
    case Nil => List()
  }
}
