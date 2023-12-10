import java.util.*;

public class Array_sum {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of test cases");
        int test = sc.nextInt();

        for (int m = 0; m < test; m++) {
            System.out.println("Enter the array size");
            int n = sc.nextInt();
            int[] arr = new int[n];
            System.out.println("Enter array");
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }

            int[] output_arr = new int[n];
            int sum;

            for (int i = 0; i < n; i++) {
                sum = 0;
                for (int j = 0; j < n; j++) {
                    if (i == j) {
                        continue;
                    } else {
                        sum += arr[j];
                    }
                }
                output_arr[i] = sum;
            }

            for (int i = 0; i < n; i++) {
                System.out.print(output_arr[i] + " ");
            }
            System.out.println(" ");
        }
    }
}

