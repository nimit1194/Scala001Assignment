package Scala01.Assignment

import org.scalatest.FunSuite

/**
  * Created by knoldus on 16/7/17.
  */
class DoubleListTest extends FunSuite {

  val listDouble = new DoubleList

  test("Passing list")
  {
    assert(listDouble.doubleList(List(1,2,3,4,5)) === List(2,4,6,8,10))
  }

  test("Pass empty list")
  {
    assert(listDouble.doubleList(List[Int]()) === List())
  }
}
