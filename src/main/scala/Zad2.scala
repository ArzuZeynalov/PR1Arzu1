/*
Задача 2
Найдите предпоследний элемент списка
Пример:
penultimate(List(1, 1, 2, 3, 5, 8))
Int = 5
 */

object Zad2 {

  def penultimate[A](ls: List[A]): A =
    if (ls.isEmpty) throw new NoSuchElementException
    else ls.init.last

  def main (args: Array[String]) {
    print (penultimate(List(1, 1, 2, 3, 5, 8)))
  }

}
