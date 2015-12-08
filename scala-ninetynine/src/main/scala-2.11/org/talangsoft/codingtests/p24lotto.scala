package org.talangsoft.codingtests

import scala.util.Random

object p24lotto {
  def lotto(take:Int, intervalEnd:Int):List[Int] = {
    randomSelect(take,1 to intervalEnd toList)
  }

  def randomSelect[T](times: Int, l: List[T]): List[T] = {
    if(times > 0) removeAt(Random.nextInt(l.size), l) match { case (list,el) => List(el):::randomSelect(times-1,list)}
    else List()
  }

  def removeAt[T](pos:Int, l: List[T]): (List[T],T) = {
    l.splitAt(pos) match {case (begin,end) => (begin:::end.tail,end.head)}
  }
}
