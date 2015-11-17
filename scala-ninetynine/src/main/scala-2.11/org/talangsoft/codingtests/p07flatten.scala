package org.talangsoft.codingtests


object p07flatten {

  def flatten(listToFlat : List[Any]) : List[Any] = listToFlat flatMap {
    case list: List[Any] => flatten(list)
    case el => List(el)
  }

}
