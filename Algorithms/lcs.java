import java.util.*;   
import java.io.*;   
import java.util.Scanner;  
  
public class LCSExample2 {  
    
    public static int getLengthOfLCS(char[] str1, char[] str2, int p, int q)  
    {  
        if (p == 0 || q == 0)  
            return 0;  
          
        if (str1[p - 1] == str2[q - 1])  
            return 1 + getLengthOfLCS(str1, str2, p - 1, q - 1);  
        else  
            return maxValue(getLengthOfLCS(str1, str2, p, q - 1), getLengthOfLCS(str1, str2, p - 1, q));  
    }  
    
    static int maxValue(int length1, int length2)  
    {  
        if (length1 > length2)  
            return length1;  
        else  
            return length2;  
    }  
      
    public static void main(String[] args)  
    {  
        String string1, string2;            
        Scanner sc = new Scanner(System.in);   
        System.out.print("Enter first sequence: ");  
        string1 = sc.nextLine();         
        System.out.print("Enter second sequence: ");  
        string2 = sc.nextLine();            
        char[] str1 = string1.toCharArray();  
        char[] str2 = string2.toCharArray();            
        int p = string1.length();  
        int q = string2.length();  
    
        System.out.println("Length of the Longest Common Subsequence is: "+ getLengthOfLCS(str1, str2, p, q));  
    }  
}  
