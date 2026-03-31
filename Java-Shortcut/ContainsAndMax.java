//Primitive Datatype of int
import java.util.Arrays;

int[] b = {4, 5, 2, 7};

if (Arrays.stream(b).anyMatch(x -> x == a[i])) {
    System.out.println("Present");
}
  
*******************************************************
// Non-Primitive Datatype of int
import java.util.Arrays;

Integer[] b = {4, 5, 2, 7};

boolean exists = Arrays.asList(b).contains(a[i]);

*******************************************************

String[] b = {"cat", "dog", "fish"};

if (Arrays.asList(b).contains("dog")) {
    System.out.println("Present");
}

*******************************************************
// Primitive Datatype of int
import java.util.Arrays;

class Main {
    public static void main(String[] args) {
        int a[] = {1, 2, 5, 3, 3, 5};

        int maxi = Arrays.stream(a).max().getAsInt();
        long count = Arrays.stream(a).filter(x -> x == maxi).count();

        System.out.println(count);
    }
}

**********************************************************
// Non-Primitive Datatype of int
import java.util.*;

class Main {
    public static void main(String[] args) {
        Integer[] a = {1, 2, 5, 3, 3, 5};

        int maxi = Collections.max(Arrays.asList(a));
        int count = Collections.frequency(Arrays.asList(a), maxi);

        System.out.println(count);
    }
}
