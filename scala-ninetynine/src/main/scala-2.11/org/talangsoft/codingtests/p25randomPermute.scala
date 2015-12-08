package org.talangsoft.codingtests

import scala.util.Random

/**
 **[P25](p25.scala) (*) Generate a random permutation of the elements of a list.**
Hint: Use the solution of problem [P23](#p23). Example:
scala> randomPermute(List('a, 'b, 'c, 'd, 'e, 'f))
res0: List[Symbol] = List('b, 'a, 'd, 'c, 'e, 'f)
 */
object p25randomPermute {
  def randomPermute[T](l:List[T]) = randomSelect(l.size,l)

  def randomSelect[T](times: Int, l: List[T]): List[T] = {
    if(times > 0) removeAt(Random.nextInt(l.size), l) match { case (list,el) => List(el):::randomSelect(times-1,list)}
    else List()
  }

  def removeAt[T](pos:Int, l: List[T]): (List[T],T) = {
    l.splitAt(pos) match {case (begin,end) => (begin:::end.tail,end.head)}
  }
}
