import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
// import java.util.stream.Collectors;

public class UnionInter {
    static void Union(Integer[] a,Integer [] b)
    {
        Set<Integer> unionset = new HashSet<>();
        
        for(int i:a)
        {
            unionset.add(i);
        }
        for(int i:b)
        {
            unionset.add(i);
        }
        List<Integer> result = new ArrayList<>(unionset);
        Collections.sort(result);

        System.out.println("Union of a and b list are "+result);

    }
    static void Inter(Integer[] a,Integer[] b)
    {
        Set<Integer> intersection = new HashSet<>();
            
            //converting normal int array to Intstream with help of Arrays.stream() 
            //and convert them to Integer with boxed with boxed()
            //and collecters to collect into set with collect(Collectors.toSet()) which will remove duplicates values

        // Set<Integer> setA =  Arrays.stream(a).boxed().collect(Collectors.toSet());

        // List<Integer> lst = new ArrayList<>(Arrays.asList(a)); 
        
            // becz of duplicate elements i used Set
        Set<Integer> lst = new HashSet<>(Arrays.asList(a));

        // Set<Integer> lst = Set.of(a); not work becz it cant unpack a
        // List<Integer> list = List.of(1, 2, 3);  works
        // Set<Integer> set = Set.of(1, 2, 3);   works


        for(int i:b)
        {
            if(lst.contains(i))
            {
                intersection.add(i);
            }
        }
       System.out.println("Intersection of a and b list are "+intersection);
    }
    public static void main(String[] args) {
        
        Integer [] a={1,10,3,3,3,3,3,2,35,4,7,9,43,5,7};
        Integer [] b={2,3,10,203,403,2,2,4,6,23,3,7,43};

        // Union(a,b);
        Inter(a,b);
    }
}
