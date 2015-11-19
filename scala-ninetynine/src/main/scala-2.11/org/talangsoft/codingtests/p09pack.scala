package org.talangsoft.codingtests

object p09pack {
  def group(list:List[Any]): List[Any] = list match {
    case (list:List[Any]) :: next :: tail if list(0) != next => list::group(List(next)::tail) /* next is new group */
    case (list:List[Any]) :: next :: tail if list(0) == next => group((list:+next)::tail) /* next is same group */
    case _ => list
  }

  def pack(l: List[Any]): List[Any] = l match {
    case el::tail => group(List(el)::tail) // create first group
  }
}