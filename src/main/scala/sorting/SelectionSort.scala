package sorting

import scala.annotation.tailrec

/* Simple sorting algorithm
collection is always divided into sorted and unsorted
search for smallest element in unsorted part of the collection
place at rightmost part of sorted collection
stop when unsorted collection is empty
complexity is 0(n^2)
 */

object SelectionSort {

    def min(arr:Array[Int]):(Int,Int)={
      var min:Int = arr(0)
      var index = 0

      for(i<- arr.indices){
        if(arr(i) < min) {
          min = arr(i)
        index = i
        }
      }
      (index,min)
    }

  def sort(arr:Array[Int]):Array[Int]= {

    @tailrec
    def sortHelper(sorted: Array[Int], unsorted: Array[Int],sortPosition:Int): Array[Int] = {
      unsorted match {
        case Array() => sorted
        case _ =>
          val (index, minNumber) = min(unsorted)
            sorted(sortPosition) = minNumber
          val (a, b) = unsorted.splitAt(index )
          val newUnsorted = if (b.length > 1) a ++ b.tail
          else a
          sortHelper(sorted, newUnsorted,sortPosition+1)

      }
    }

    val sorted = Array.fill(arr.length)(0)
    sortHelper(sorted, arr,0)
  }
}
