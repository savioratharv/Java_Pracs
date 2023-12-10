import java.util.*;

public class Shopping_List {
    public static void main(String[] args) {
        Vector<String> Shopping_List = new Vector<String>();
        Scanner sc = new Scanner(System.in);
        int exit=0;
        while(exit==0){
            System.out.println("Enter your choice 0.Exit 1.Add Element at Last, 2. Add Element at Index, 3. Remove Last Element, 4. Remove Element from an index, 5. Show list");
            int choice = sc.nextInt();
            switch(choice){
                case 0: exit=1;
                break;
                case 1: System.out.println("Enter element to add");
                String ele = sc.next();
                Shopping_List.add(ele);
                break;
                case 2: System.out.println("Enter element to add");
                String ele1 = sc.next();
                System.out.println("Enter index where you want to add it");
                int index = sc.nextInt();
                Shopping_List.add(index, ele1);
                break;
                case 3: Shopping_List.remove(Shopping_List.size()-1);
                break;
                case 4: System.out.println("Enter index you want to remove element from");
                int index1=sc.nextInt();
                Shopping_List.remove(index1);
                break;
                case 5: Enumeration enu = Shopping_List.elements();
                while(enu.hasMoreElements()){
                    System.out.println(enu.nextElement());
                }
                break;
                default: System.out.println("Invalid Choice, try again");
                break;
            }
        }
    }
}
