import java.util.*;
public class Setslike {
    
    public static void main(String[] args) {

        Integer [] a = {10,20,30,10,20,50,60,30,20};

        Set<Integer> hashset = new HashSet<>(Arrays.asList(a));
        System.out.println(hashset);

        Set<Integer> b = new TreeSet<>(Arrays.asList(a));

        System.out.println(b);
    }
}


