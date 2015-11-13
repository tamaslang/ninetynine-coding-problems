package org.talangsoft.codingtests

object p06palindrome {

  def isPalindrome[T](l:List[T]):Boolean = l match {
    case head :: (m :+ tail) => head == tail && isPalindrome(m)
    case _ => true
  }

}
