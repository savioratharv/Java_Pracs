object userInputExample{
    def main(args: Array[String]): Unit={
        val a: Int = 16;
        val b: Int = 18;
        val c: Int = 20;
        if(a>b && a>c){
            print("A is greatest");
        }
        else if(b>a && b>c){
            print("B is greatest");
        }
        else{
            print("C is greatest");
        }
    }
}