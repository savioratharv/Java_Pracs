abstract class Bank{
    def getBalance(): Double
}

class BankA extends Bank{
    override def getBalance(): Double = 100
}

class BankB extends Bank{
    override def getBalance(): Double = 150
}

class BankC extends Bank{
    override def getBalance(): Double = 200
}

object HelloWorld{
    def main(args: Array[String]): Unit = {
        val a = new BankA()
        val b = new BankB()
        val c = new BankC()
        
        println(a.getBalance())
        println(b.getBalance())
        println(c.getBalance())
        
    }
}