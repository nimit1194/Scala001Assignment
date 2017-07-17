package Scala01.Assignment


import org.scalatest.FunSuite


class BankAccountTest extends FunSuite {

  val bank = new BankAccount("NIMIT", 12345678)

  test("Crediting 1000 rupees")
  {
    val afterCredit = bank credit 1000
    assert(afterCredit.balance === 1000)
  }

  test("Debiting amount less than that present in account")
  {
    val afterCredit = bank credit 2000
    val afterDebit = afterCredit debit 1000
    assert(afterDebit.balance === 1000)
  }

  test("Debiting amount more than that present in account")
  {
    val afterDebit = bank debit 1000
    assert(afterDebit.balance === 0)
  }


}
