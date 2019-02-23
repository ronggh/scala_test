// These are meant to be typed into the REPL. You can also run
// scala -Xnojline < repl-session.scala to run them all at once.

// 类和伴生对象
class Account {
  // 类中可以直接访问伴生对象
  val id = Account.newUniqueNumber()
  private var balance = 0.0
  def deposit(amount: Double) { balance += amount }
  def description = "Account " + id + " with balance " + balance
}

// 伴生对象
object Account { // The companion object
  private var lastNumber = 0
  private def newUniqueNumber() = { lastNumber += 1; lastNumber }
}


val acct1 = new Account
val acct2 = new Account
acct1.deposit(1000)
val d1 = acct1.description
val d2 = acct2.description




