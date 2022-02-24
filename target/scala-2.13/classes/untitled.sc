def swap(arr:Array[Int],source:Int,target:Int):Array[Int]= {
  val temp = arr(target)
  arr(target) = arr(source)
  arr(source) = temp
  arr
}
val p = swap(Array(1,2,3,4,5),1,4) // expect Array(1,5,3,4,2)
print("sds")

val(a,b)= ("asdasda","nnnnnn")