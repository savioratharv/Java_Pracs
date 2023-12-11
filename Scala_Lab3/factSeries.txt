object HelloWorld{
    def main(args: Array[String]): Unit = {
        var a: Double = 2
        var n: Double = 5
        var sum: Double = series(a,n)
        
        println(s"Answer is $sum")
    }
    
    def series(a: Double, n: Double): Double = {
        if(n<=1){
            return a
        }
        else{
            return math.pow(a,n)/fact(n) + series(a,n-1)
        }
    }
    
    def fact(n: Double): Double = {
        if(n<=1){
            return 1
        }
        else{
            return n * fact(n-1)
        }
    }
    
}