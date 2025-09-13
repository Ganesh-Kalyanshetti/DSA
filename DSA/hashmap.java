import java.util.HashMap;
import java.util.Scanner;
import java.util.*;
public class hashmap {
    
    public static void main(String[] args) {
        
        int n;
        System.out.println("Enter the size of array:");
        Scanner sc = new Scanner(System.in);
        
        n=sc.nextInt();
        sc.nextLine();

        int a[] =  new int[n];
        for(int i=0;i<n;i++)
        {
            a[i] = sc.nextInt();            
        }
        HashMap <Integer , Integer > series = new HashMap<>();
        int frq;
        for(int i=0;i<n;i++)
        {
            frq = series.getOrDefault(a[i], 0);
            series.put(a[i],frq+1);
        }

        System.out.println(series);
        // System.out.println(series.get(1));
        // for(int i=0;i<n;i++)
        // {
        //    System.out.println(a[i]+"--->"+series.get(a[i]));

        // }
        int maxvalue = Collections.max(series.values());
        System.out.println(maxvalue);

        System.out.println(Collections.max(series.keySet()));    
        
        
        sc.close();
    }
}

// hashmap = {}

// # Inserting values
// hashmap["name"] = "Alice"
// hashmap["age"] = 25

// # Accessing values
// print("Name:", hashmap["name"])
// print("Age:", hashmap["age"])

// # Updating value
// hashmap["age"] = 26

// # Deleting a key
// del hashmap["name"]

// print(hashmap)