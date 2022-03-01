package sorting

object InsertionSort {

  def sort(arr:Array[Int]):Array[Int]= {
  val sorted:Array[Int] = Array()

    def insert(num: Int,sortedArray: Array[Int]):Array[Int]={
      val (lessThan,greaterThan) = sortedArray.partition(_<num)
     lessThan :+ num concat greaterThan
    }

    def sortHelper(unsortedArray:Array[Int], sortedArray:Array[Int]):Array[Int]={
unsortedArray match {
  case Array()=> sortedArray
  case _ =>
    val refInt:Int = unsortedArray.head
   val newSortedArray = insert(refInt,sortedArray)
    sortHelper(unsortedArray.tail ,newSortedArray)

}
    }

    sortHelper(arr,sorted)
  }
}