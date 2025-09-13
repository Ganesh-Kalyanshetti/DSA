import java.util.Arrays;
import java.util.Scanner;

public class Zerotoend {
    
    static void addzerotoend(int[] a,int n)
    {
        int temp[] = new int[n];
        int k=0;
        for(int i=0;i<n;i++)
        {
           if(a[i]!=0)
           { 
            temp[k++]= a[i];
           }
        } 
        System.out.println("With big O(n) space complexsity"+Arrays.toString(temp));

    }
    static void addzerotoend2(int[] a,int n)
    {
        int l=-1;
        for(int i=0;i<n;i++)
        {
            if(a[i]==0)
            {
                // l=i;
            
            }
            if(a[i]!=0)
            {
                a[++l] = a[i];
            }
        }
        System.out.println("Without big O(n) space complexity"+Arrays.toString(a));
    }
    public static void main(String[] args) {
    
        Scanner sc = new Scanner(System.in);
        int[] a = new int[] {1,2,0,4,5,0,0,2,3,1};
        int[] b = Arrays.copyOf(a, a.length);
        addzerotoend(a,a.length);
        addzerotoend2(b,a.length);
        sc.close();
    }
}
