package Scala01.Assignment

import org.scalatest.FunSuite

/**
  * Created by knoldus on 15/7/17.
  */
class AreaTest extends FunSuite {

  val areaObject = new Area

  test("Test area of rectangle")
  {
    assert(areaObject.areaOfShape("rectangle", 5, 4, (a: Int, b: Int) => a * b) === "Area of rectangle is 20")

    assert(areaObject.areaOfShape("rectangle", 4, 6, (a: Int, b: Int) => a * b) === "Area of rectangle is 24")

  }

  test("Test area of rhombus")
  {
    assert(areaObject.areaOfShape("rhombus", 4, 5, (a: Int, b: Int) => a * b/2) === "Area of rhombus is 10")

    assert(areaObject.areaOfShape("rhombus", 6, 8, (a: Int, b: Int) => a * b/2) === "Area of rhombus is 24")

  }

  test("Test area of parallelogram")
  {
    assert(areaObject.areaOfShape("parallelogram", 6, 6, (a: Int, b: Int) => a * b) === "Area of parallelogram is 36")

    assert(areaObject.areaOfShape("parallelogram", 5, 10, (a: Int, b: Int) => a * b) === "Area of parallelogram is 50")

  }

  test("Testing area with 0 as input")
  {
    intercept[IllegalArgumentException] {
      areaObject.areaOfShape("rectangle", 0, 0, (a: Int, b: Int) => a * b)
    }

    intercept[IllegalArgumentException] {
      areaObject.areaOfShape("rhombus", 0, 0, (a: Int, b: Int) => a * b/2)
    }
    intercept[IllegalArgumentException] {
      areaObject.areaOfShape("parallelogram", 0, 0, (a: Int, b: Int) => a * b)
    }
  }

  test("Testing area of undefined shape")
  {
    assert(areaObject.areaOfShape("Triangle", 7, 8, (a: Int, b: Int) => a * b/2) === "Triangle is not a valid shape")
  }
}
