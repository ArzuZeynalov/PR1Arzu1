/*
Задача 3
Найдите k-ый элемент списка
Пример:
nth(2, List(1, 1, 2, 3, 5, 8))
res0: Int = 2
 */

object Zad3 {

  def nth[A](n: Int, ls: List[A]): A =
    if (n >= 0) ls(n)
    else throw new NoSuchElementException

  def main (args: Array[String]) {
    print (nth(2, List(1, 1, 2, 3, 5, 8)))
  }
}
