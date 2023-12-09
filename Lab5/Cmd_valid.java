public class Cmd_valid {
    public static void main(String[] args) {
        int teger;
        int len_valid=0;
        int len_invalid=0;
        for(String arg:args){
            try{
                teger=Integer.parseInt(arg);
                len_valid++;
            }
            catch(NumberFormatException e){
                len_invalid++;
            }  
        }
        System.out.println("Number of Valid arguments:"+len_valid);
        System.out.println("Number of Invalid arguments:"+len_invalid);
    }
}
