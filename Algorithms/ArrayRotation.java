import java.util.Arrays;
import java.util.Scanner;
public class ArrayRotationProgram 
{
    private static void leftRotate(int[] inputArray, int n) 
    {
        System.out.println("Input Array Before Rotation :");
        System.out.println(Arrays.toString(inputArray));
        int temp;
        for (int i = 0; i < n; i++)
        {
            temp = inputArray[0];
            for (int j = 0; j < inputArray.length-1; j++) 
            {
                inputArray[j] = inputArray[j+1];
            }
            inputArray[inputArray.length - 1] = temp;
        }
        System.out.println("Input Array After Left Rotation By "+n+" Positions :");
        System.out.println(Arrays.toString(inputArray));
    } 
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] inputArray = new int[n];
        for(int i = 0;i<n;i++){
            inputArray[i] = sc.nextInt();
        }
        int t = sc.nextInt();
        leftRotate(inputArray,t);
    }
}
