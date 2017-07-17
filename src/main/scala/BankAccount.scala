package Scala01.Assignment

class BankAccount(val name: String, val id: Int, val balance:Int)
{
  def this(name: String, id: Int) = this(name, id, 0)

  require(!name.isEmpty && id != 0)

  def credit(amt: Int): BankAccount = {
    new BankAccount(this.name, this.id, this.balance + amt)
  }

  def debit(amt: Int): BankAccount = {
    if(amt>this.balance){
      this
    }
    else {
      new BankAccount(this.name, this.id, this.balance - amt)
    }}

  override def toString: String = s"Hi $name! Balance for you Account ID $id is $balance"

}
