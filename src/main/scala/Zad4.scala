/*
Задача 4
Найдите количество элементов списка
length(List(1, 1, 2, 3, 5, 8))
Int = 6
 */

object Zad4 {

  def length[A](ls: List[A]): Int = ls.length

  def main (args: Array[String]) {
    print (length(List(1, 1, 2, 3, 5, 8)))
  }

}
