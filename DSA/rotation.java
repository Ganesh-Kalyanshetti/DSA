import java.util.Scanner;
import java.util.Arrays;

public class rotation {

    static void oneleftRotation(int a[],int n)
    {
        int temp = a[0];
        for(int i =1;i<a.length;i++)
        {
        a[i-1] = a[i];
        }
        System.out.println();
        a[n-1] = temp;
        
        System.out.println("One left Rotation "+Arrays.toString(a));
    }
    static void onerightRotation(int a[],int n)
    {
        int temp=a[n-1];
        int i=1;
        while(i<n)
        {
            a[n-i] = a[n-i-1];
            i++;
            // n--;
        }
        a[0] =temp;
        System.out.println("Right Rotation "+Arrays.toString(a));

    }
    static void reversearray(int[] a,int i,int n)
    {
        // int n  = a.length-1;
        // int i = 0;
        while(i<n)
        {
            int temp = a[i];
            a[i] = a[n];
            a[n] = temp;
            i++;
            n--;

        }
    }
    static void leftNRotation(int[] a, int n, int d) {
        d = d % n;
        int[] temp = new int[d];
        System.out.print(d+" Left Rotation ");
        if (d > 0) {

            for (int i = 0; i < temp.length; i++) {
                temp[i] = a[i];
            }
            for (int i = d; i < n; i++) {
                a[i - d] = a[i];
            }

            // for (int i = d; i < n; i++) {
            //     a[i] = temp[i - d];
            // }
            for(int i=n-d;i<n;i++)
            {
                a[i]=temp[i-(n-d)];
            }
            
        }
        System.out.println(Arrays.toString(a));
    }
    static void rightNrotation(int a[],int n,int d)
    {
        d=d%n;
        System.out.println();
        System.out.print(d+" Right Rotation ");
        int temp[] = new int[n];
        // for(int i =0;i<n;i++)
        // {
        //     temp[(i+d)%n] = a[i];
        // }
        for(int i=d;i<temp.length;i++)
        {
            temp[i] = a[i-d];
        }
        
        for(int i=0;i<d;i++)
        {
            temp[d-i-1] = a[n-i-1];

        }
        System.out.println(Arrays.toString(temp));
    }
    static void optimisedleftNRotation(int[] a,int n,int d)
    {
        d=d%n;
        if(d==0)
        {
            System.out.println(Arrays.toString(a));
            return;
        }
        reversearray(a,0,d-1);
        reversearray(a,d,n-1);
        reversearray(a,0,n-1);
        System.out.println();
        System.out.println("Optimized "+d+" Left Rotation "+Arrays.toString(a));
    }
    static void optimisedRightNRotation(int a[],int n,int d)
    {
        d=d%n;
        reversearray(a, n-d,n-1);
        reversearray(a, 0, n-d-1);
        reversearray(a, 0,n-1 );
        System.out.println("OPtimized "+d+" Right Rotation "+Arrays.toString(a));

    }

    public static void main(String[] args) {

        int[] a = { 10, 20, 30, 40, 50 ,60 , 70};
        int [] b = Arrays.copyOf(a, a.length);
        int [] c = Arrays.copyOf(a, a.length);
        int [] e = Arrays.copyOf(a, a.length);
        int [] f = Arrays.copyOf(a, a.length);
        int [] g = Arrays.copyOf(a, a.length);

        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
        int n = a.length;
        System.out.println();
        oneleftRotation(a, n);
        onerightRotation(b,n);
        System.out.println();
        System.out.println("Enter the num of Rotation u want");
        Scanner sc = new Scanner(System.in);
        int d = sc.nextInt();

        leftNRotation(c, n, d);
        rightNrotation(e, n, d);
        optimisedleftNRotation(f,n,d);
        optimisedRightNRotation(g, n, d);        

        sc.close();
    }
}
