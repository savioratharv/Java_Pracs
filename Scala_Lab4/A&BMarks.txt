abstract class Marks{
    def getPercentage(): Double
}

class A(m1: Double, m2: Double, m3: Double) extends Marks{
    override def getPercentage(): Double = {
        return (m1+m2+m3)/300
    }
}

class B(m1: Double, m2: Double, m3: Double, m4: Double) extends Marks{
    override def getPercentage(): Double = {
        return (m1+m2+m3+m4)/400
    }
}

object HelloWorld{
    def main(args: Array[String]): Unit = {
        val A = new A(10.0,20.0,30.0)
        println(A.getPercentage())
        val B = new B(10.0,20.0,30.0,40.0)
        println(B.getPercentage())
    }
}