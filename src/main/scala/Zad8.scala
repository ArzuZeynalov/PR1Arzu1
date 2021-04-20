/*
Замените серии одинаковых элементов списка на одиночный
элемент
*/

object Zad8 {

  def compress[A](ls: List[A]): List[A] = ls match {
    case Nil       => Nil
    case h :: tail => h :: compress(tail.dropWhile(_ == h))
  }

  def main (args: Array[String]) {
    print (compress(List('a', 'a', 'a', 'a', 'b', 'c', 'c', 'a', 'a', 'd', 'e', 'e', 'e', 'e')))

  }

}
