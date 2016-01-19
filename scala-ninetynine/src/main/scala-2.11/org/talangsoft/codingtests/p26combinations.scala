package org.talangsoft.codingtests

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