import java.util.*;

class Vampire {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] number = new int[4];

        System.out.println("Enter number");
        for (int i = 0; i < 4; i++) {
            number[i] = sc.nextInt();
        }

        int num = number[0] * 1000 + number[1] * 100 + number[2] * 10 + number[3];

        if (num == ((number[0] * 10 + number[1]) * (number[2] * 10 + number[3]))) {
            System.out.println("This is a Vampire Number");
        } else if (num == ((number[1] * 10 + number[0]) * (number[2] * 10 + number[3]))) {
            System.out.println("This is a Vampire Number");
        } else if (num == ((number[0] * 10 + number[1]) * (number[3] * 10 + number[2]))) {
            System.out.println("This is a Vampire Number");
        } else if (num == ((number[1] * 10 + number[0]) * (number[3] * 10 + number[2]))) {
            System.out.println("This is a Vampire Number");
        } else if (num == ((number[0] * 10 + number[2]) * (number[1] * 10 + number[3]))) {
            System.out.println("This is a Vampire Number");
        } else if (num == ((number[2] * 10 + number[0]) * (number[1] * 10 + number[3]))) {
            System.out.println("This is a Vampire Number");
        } else if (num == ((number[0] * 10 + number[2]) * (number[3] * 10 + number[1]))) {
            System.out.println("This is a Vampire Number");
        } else if (num == ((number[2] * 10 + number[0]) * (number[3] * 10 + number[1]))) {
            System.out.println("This is a Vampire Number");
        } else if (num == ((number[0] * 10 + number[3]) * (number[1] * 10 + number[2]))) {
            System.out.println("This is a Vampire Number");
        } else if (num == ((number[3] * 10 + number[0]) * (number[1] * 10 + number[2]))) {
            System.out.println("This is a Vampire Number");
        } else if (num == ((number[0] * 10 + number[3]) * (number[2] * 10 + number[1]))) {
            System.out.println("This is a Vampire Number");
        } else if (num == ((number[3] * 10 + number[0]) * (number[2] * 10 + number[1]))) {
            System.out.println("This is a Vampire Number");
        } else {
            System.out.println("No Vampire");
        }
    }
}
