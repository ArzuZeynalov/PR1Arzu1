/*

Преобразуйте многомерный список в одномерный

 */
object Zad7 {

  def flatten(ls: List[Any]): List[Any] = ls flatMap {
    case ms: List[_] => flatten(ms)
    case e => List(e)
  }

  def main (args: Array[String]) {
    print (flatten(List(List(1, 1), 2, List(3, List(5, 8)))))
  }

}
