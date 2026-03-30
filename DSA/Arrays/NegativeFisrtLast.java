import java.util.Arrays;
import java.util.Collections;


class Negative {
    public static void main(String[] args) 
    {
        int a[] = {1,-1,2,-2,3,-3,3,5,0,-1,3};
        int n = a.length;
        int []b = Arrays.copyOf(a,n);
        System.out.println(Arrays.toString(a));
        int j = 0;
        for (int i = 0; i < n; i++) 
        {
            if (a[i] < 0) 
            {
                int temp = a[i];
                a[i] = a[j];
                a[j] = temp;
                j++;
            }
        }

        System.out.println(Arrays.toString(a)); // [-3, -1, -4, 4, 4, 2, 5, 1]
        j = 0;
        for(int i=0;i<n;i++)
        {
            if (b[i]>=0)
            {
                int temp = b[i];
                b[i] =b[j];
                b[j]=temp;
                j++;
            }    
        }
        System.out.println(Arrays.toString(b));


        Integer [] c = {1,-1,2,-2,3,-3,3,5,0,-1,3};

        Arrays.sort(c);
        System.out.println("this is "+Arrays.toString(c));
        Arrays.sort(c,Collections.reverseOrder());
        System.out.println("this is "+Arrays.toString(c));
    }
}

