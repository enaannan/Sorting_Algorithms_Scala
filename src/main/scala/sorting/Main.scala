package sorting

object Main extends App {
  val p = SelectionSort.sort(Array(4,3,2,1))
  println(p.mkString)
}
