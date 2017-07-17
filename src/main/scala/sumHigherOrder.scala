package Scala01.Assignment

/**
  * Created by knoldus on 17/7/17.
  */
class sumHigherOrder {

    def sum(f:(Int,Int)=>Int, a:Int, b:Int):Int = {
      f(a,b)
    }
   println(sum((a:Int, b:Int)=>a*a + b*b, 5,4))


}
