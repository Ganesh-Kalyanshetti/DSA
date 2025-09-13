import java.util.*;
public class Sort {

    static void selection(int a[],int n)
    {
        for(int i=0;i<=n-2;i++)
        {
            int min=i;
            for(int j=i;j<=n-1;j++)
            {
                if(a[j]< a[min])
                {
                    min=j;
                }
            }
            int temp = a[min];
            a[min] = a[i];
            a[i] = temp;

        }
    
    }
    static void bubble(int a[],int n)
    {
        for(int i=n;i>0;i--)
        {
            for(int j=0;j<i-1;j++)
            {
                if(a[j]>a[j+1])
                {
                    int temp = a[j];
                    a[j] = a[j+1];
                    a[j+1] = temp;
                }
            }
        }
    }
    static void insertion(int a[],int n)
    {
        for(int i=0;i<=n;i++)
        {
            for(int j=0;j<i;j++)
            {
                while(j>0 && a[j]<a[j-1])
                {
                    int temp = a[j-1];
                    a[j-1]=a[j];
                    a[j] = temp;
                    j--;
                }
            }
        }
    }
    static void merge(int a[],int low,int mid,int high)
    {
        int left = low;
        int right = mid+1;
        int k=0;
        int[] temp =new int[high-low+1]; 

        while(left<=mid && right <=high)
        {
            if(a[left]<=a[right])
            {
                temp[k++] = a[left++];
            }
            else
            {
                temp[k++] = a[right++];
            }

        }

        while(left<=mid)
        {
            temp[k++] = a[left++];
        }
        while(right<=high)
        {
            temp[k++]=a[right++];
        }

        for(int i=0;i<temp.length;i++)
        {
            a[low+i] = temp[i];
        }
    }
    static void mergesort(int a[],int low,int high)
    {
        if(low >=high)
        {
            return;
        }
        int mid = (low + high)/2;
        mergesort(a, low, mid);
        mergesort(a, mid+1, high);
        merge(a,low,mid,high);
        
    }
    static int Pquick(int a[],int low,int high)
    {
        int pivot = a[low];
        int i = low;
        int j = high;
        while(i<j)
        {

            while ( a[i] <= pivot && i<=high-1)
            {
                i++;
            }
            while(a[j]>pivot && j>=low-1)
            {
                j--;
            }
            if(i<j)
            {
                int temp=a[i];
                a[i]=a[j];
                a[j]=temp;
            }
        
        }
        int temp =a[low];
        a[low]=a[j];
        a[j]=temp;
        return j;

    }
    static void quicksort(int a[],int low,int high)
    {
        if(low<high)
        {
            int pivot = Pquick(a,low,high);
            quicksort(a, low, pivot-1);
            quicksort(a, pivot+1, high);
        }

    }
    static void secondlargest(int a[],int n)
    {
        int largest=a[0];
        int slargest=0;
        for(int i=0;i<n;i++)
        {
            if(a[i]>largest)
            {
                slargest=largest;
                largest =a[i];
            }
            else if(a[i]<largest && a[i]>slargest){
                slargest =a[i];
            }
        }
        System.out.println("Largest is "+largest);
        System.out.println("Seconde lagest is "+slargest);

        return;
    }
    static void secondsmallest(int a[],int n)
    {
        int smallest =a[0];
        int ssmallest = 0;
        for(int i=0;i<n;i++)
        {
            if(a[i]<smallest)
            {
                ssmallest=smallest;
                smallest = a[i];
            }
            else if(a[i]>smallest && a[i]<ssmallest)
            {
                ssmallest =a[i];
            }   
        }
        System.out.println("Smallest is "+smallest);
        System.out.println("Smallest is "+ssmallest);
        
    }
    static boolean issorted(int a[],int n)
    {
        for(int i=0;i<n-1;i++)
        {
            if(a[i+1]<a[i])
            {
                return false;
            }
            // if(a[i]<a[i+1])
            // {
            //     // return false;
            // }
            // else{
            //     return false;
            // }

        }
        return true;
    }
    static int[] duplicate(int a[],int n)
    {
        int[] temp = new int [n];
        int k=0;
        for(int i=0;i<n;i++)
        {
            boolean found = false;
           for(int j=0;j<k;j++)
           {
                if(temp[j]==a[i])
                {
                    found = true;
                    break;
                }
           
            }
            if(!found)
            {
                temp[k++]= a[i];
            }
        }
        return temp;
    }
    static int[] duplicate2(int a[],int n)
    {
        Set<Integer> temp = new LinkedHashSet<>();
        // Set<Integer> temp = new HashSet<>();
        for(int i:a)
        {
            temp.add(i);
        }
        int [] result = new int[temp.size()];
        int j=0;
        for(int k:temp)
        {
            result[j++]=k;
        }
        return result;
    }
    static int[] duplicate3(int[] a,int n) {
        if (a.length == 0) return a;

        Arrays.sort(a); 
        int k = 0; 

        for (int i = 1; i < a.length; i++) {
            if (a[i] != a[k]) { 
                k++;
                a[k] = a[i];
            }
        }

        return Arrays.copyOfRange(a, 0, k + 1);
    }
    
    public static void main(String[] args) {
        
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Size of Array");
        n = sc.nextInt();
        int a[] = new int[n]; 
        for(int i=0;i<n;i++)
        {
            a[i] = sc.nextInt();
        }
        
        // selection(a,n);
        // bubble(a,n);
        // insertion(a, n);
        // mergesort(a,0,n-1);
        // quicksort(a,0,n-1);

        // System.out.println("Sorted");
        //  for(int i=0;i<n;i++)
        // {
        //     System.out.println(a[i]);
        // }

        // secondlargest(a,n);
        // secondsmallest(a, n);
        // System.out.println(issorted(a, n));

        // int[] result = duplicate(a, n);
        // int [] result = duplicate2(a, n);
        // System.out.println("hello");
        // for(int i=0;i<result.length;i++)
        // {
        //     System.out.println(result[i]);
        // }
        
        int [] result = duplicate3(a,n);
        System.out.println(Arrays.toString(result));
        sc.close();

    }
    
}