import java.io.*;
import java.time.Duration;
import java.time.Instant;

public class LIS {
    static int lis(int arr[],int n)
    {
          int lis[] = new int[n];
          int i,j,max = 0;
 
           for ( i = 0; i < n; i++ )
              lis[i] = 1;
 
          
           for ( i = 1; i < n; i++ )
              for ( j = 0; j < i; j++ )
                         if ( arr[i] > arr[j] &&
                                  lis[i] < lis[j] + 1)
                    lis[i] = lis[j] + 1;

           for ( i = 0; i < n; i++ )
              if ( max < lis[i] )
                 max = lis[i];
 
            return max;
    }

    static int CeilIndex(int A[], int l, int r, int key)
    {
        while (r - l > 1) {
            int m = l + (r - l) / 2;
            if (A[m] >= key)
                r = m;
            else
                l = m;
        }
  
        return r;
    }
    static int lisOptimised(int[] A,int n){
        int[] tailTable = new int[n];
        int len; 
  
        tailTable[0] = A[0];
        len = 1;
        for (int i = 1; i < n; i++) {
            if (A[i] < tailTable[0])
              
                tailTable[0] = A[i];
  
            else if (A[i] > tailTable[len - 1])
       
                tailTable[len++] = A[i];
  
            else
              
                tailTable[CeilIndex(tailTable, -1, len - 1, A[i])] = A[i];
        }
  
        return len;
    }

    public static void main(String[] args) throws IOException {

        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        String[] str=br.readLine().trim().split(" ");
        
        int[] arr=new int[str.length];
        for(int i=0;i<arr.length;i++){
            arr[i]=Integer.parseInt(str[i]);
        }

        Instant t1 = Instant.now();
        // O(n^2); also answe for longest bitonic subsequence
        System.out.print(lis(arr,arr.length)+"  ");

        Instant t2 = Instant.now();
        Duration timeElapsed = Duration.between(t1, t2);
        
        
        System.out.println(timeElapsed.toNanos() +" ns");
       
        // O( nlong(n) )
        Instant t3 = Instant.now();  

        System.out.print(lisOptimised(arr,arr.length)+" ");
        
        Instant t4 = Instant.now();
        Duration timeElapsed1 = Duration.between(t3, t4);

        System.out.println(timeElapsed1.toNanos() +" ns");
      
    }
}
