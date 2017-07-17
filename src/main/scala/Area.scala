package Scala01.Assignment

/**
  * Created by knoldus on 15/7/17.
  */
class Area {

  def areaOfShape(shape: String, first: Int, second: Int, f: (Int, Int) => Int): String = {

    require(first>0 && second>0)

    shape match {
      case "rectangle" => {
        val x = f(first, second)
        s"Area of rectangle is $x"
      }

      case "rhombus" => {
        val x = f(first, second)
        s"Area of rhombus is $x"
      }

      case "parallelogram" => {
        val x = f(first, second)
        s"Area of parallelogram is $x"
      }
      case _ => s"$shape is not a valid shape"
    }
  }
}
