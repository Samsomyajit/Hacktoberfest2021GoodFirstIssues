import java.util.Scanner;
public class Main {
    static int maxSubArraySum(int arr[]) {
        int length = arr.length;
        int max_so_far = 0, max_ending_here = 0;
 
        for (int i = 0; i < length; i++) {
            max_ending_here = max_ending_here + arr[i];
            if (max_so_far < max_ending_here)
                max_so_far = max_ending_here;
            if (max_ending_here < 0)
                max_ending_here = 0;
            System.out.println("For i = "+i);
            System.out.println("Max_ending_here = "+max_ending_here);
            System.out.println("Max_so_far = "+max_so_far);
            System.out.println();
        }
        return max_so_far;
    }
 
    public static void main(String[] arg) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0;i<n;i++){
            arr[i] = sc.nextInt();
        }
       
        System.out.println("Maximum sum is " +
                maxSubArraySum(arr));
 
 
    }
}
