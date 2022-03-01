val p = List(1,2,3,4,5,6,7,8)
val (a,b) = p.span(k=>k==7)
a.mkString
b.mkString