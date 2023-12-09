import java.util.*;

class MarksOutofBounds extends Exception{
    public MarksOutofBounds(String message){
        super(message);
    }
}

public class Result {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your name");
        String name=sc.next();
        System.out.println("Enter your Seat Number");
        String seatno=sc.next();
        System.out.println("Enter Date");
        String date=sc.next();
        System.out.println("Enter your Center Number");
        String centerno=sc.next();
        System.out.println("Enter your Marks");
        Integer marks=sc.nextInt();
        try{
            if(marks<0 || marks>100){
                throw new MarksOutofBounds("Marks Out of Bounds (0-100 Only)");
            }
            System.out.println("Sucess");
        }
        catch(MarksOutofBounds e){
            System.out.println("Error Encountered: "+e.getMessage());
        }
    }
}
