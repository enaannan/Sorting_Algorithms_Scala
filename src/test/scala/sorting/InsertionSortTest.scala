package sorting

import junit.framework.TestCase
import org.junit.Assert.assertEquals

class InsertionSortTest  extends TestCase{

  def testEmptyArray():Unit={
    val sorted = InsertionSort.sort(Array())
    assert(sorted.isEmpty)
  }

  def testSortedCorrectly():Unit={

    val unsortedArray = Array(9,8,7,6,5,4,3,2,1)
    val sorted = InsertionSort.sort(unsortedArray)
    val expected = "1,2,3,4,5,6,7,8,9"
    assertEquals(
      expected,
      sorted.mkString(","))
  }

  def testSortedCorrectly2():Unit={

    val unsortedArray = Array(100,22,3000,4,0,785,46,6757,88,99)
    val sorted = InsertionSort.sort(unsortedArray)
    val expected = "0,4,22,46,88,99,100,785,3000,6757"
    assertEquals(
      expected,
      sorted.mkString(","))
  }
}
