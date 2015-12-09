package org.talangsoft.codingtests

import scala.annotation.tailrec

object p26combinations {

  def combinations[T](take: Int, options: List[T]) : List[List[T]] = {
    def combinationsRec(take:Int, current: List[T], options: List[T]):List[List[T]] = {
      if(take == 0) List(current)
      else if(options.size >= take){
          combinationsRec(take-1,current :+ options.head,options.tail) :::
          combinationsRec(take,current,options.tail)
      }
      else List()
    }
    combinationsRec(take,List(),options)
  }
}
//
//
//
//1 2 3 4
//
//--------
//1 2 3
//1 2 4
//2 3 4
//
//
//1 2 3 4
//if listsize >= take - taken
//do take       (1) ()
//do nottake    ( ) ()
//
//1 -> 1 2 3 4
//2 -> 2 3 4

//take: 3 combination () list: (1 2 3 4)
//take: 2 combination (1) list(2 3 4)
//      take: 2 combination (1) list(2 3 4)
//      take: 2 combination (1) list(2 3 4)
//
//1 2 3
//
//1 2 4
//
//1 2 5
//
//1 3 4
//
//1 3 5
//
//1 4 5