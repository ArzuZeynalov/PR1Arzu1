/*
Задача 1
Найдите последний элемент списка
Пример:
last(List(1, 1, 2, 3, 5, 6))
Int = 6
 */

object Zad1 {

  def lastBuiltin[A](ls: List[A]): A = ls.last

  def main (args: Array[String]) {
    print (lastBuiltin(List(1,1,2,3,5,6)))
  }

}
