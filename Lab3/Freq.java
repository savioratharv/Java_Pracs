import java.util.*;

public class Freq {
    public static void main(String[] args) {
        Vector<Integer> freq = new Vector<Integer>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter length of array");
        int n = sc.nextInt();
        System.out.println("Start Entering the array");
        for(int i=0;i<n;i++){
            freq.add(sc.nextInt());
        }
        System.out.println("Enter element");
        int ele = sc.nextInt();
        int num;
        int cntr=0;
        Enumeration enu = freq.elements();
        while(enu.hasMoreElements()){
            num=(int) enu.nextElement();
            if(num==ele){
                cntr++;
            }
        }
        System.out.println("The frequency of "+ele+" is "+cntr);
    }
}
