package Scala01.Assignment

import org.scalatest.FunSuite


class SumOfFactorialTest extends FunSuite {

  val sumOfFact = new SumOfFactorial


  test("Testing sumOfFactorial")
  {
    assert(sumOfFact.result(5) === 3)

    assert(sumOfFact.result(6) === 9)

    intercept[IllegalArgumentException] {
      sumOfFact.result(-3)
    }
  }
}
