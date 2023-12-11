object HelloWorld{
    def main(args: Array[String]): Unit = {
        var num: Int = scala.io.StdIn.readInt()
        if(divisibleBy3(num) && divisibleBy7(num)){
            println("Number divisible by both 3 and 7")
        }
        else if(divisibleBy3(num)){
            println("Number divisible by 3")
        }
        else if(divisibleBy7(num)){
            println("Number divisible by 7")
        }
        else{
            println("Number divisible by None")
        }
    }
    
    def divisibleBy3(num: Int): Boolean = {
        if(num%3==0){
            return true
        }
        else{
            return false
        }
    }
    
    def divisibleBy7(num: Int): Boolean = {
        if(num%7==0){
            return true
        }
        else{
            return false
        }
    }
}