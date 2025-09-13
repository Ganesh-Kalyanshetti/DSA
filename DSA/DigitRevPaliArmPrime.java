import java.util.Scanner;
import java.util.Arrays;
import java.util.ArrayList;
public class DigitRevPaliArmPrime {
  
    static int rev(int n)
    {
        // int temp = n;
        int rev=0;
        while(n>0)
        {
            int digit = n %10;
            n=n/10;
            rev = (rev*10)+digit;
        }

        return rev;
    }
    static String palindrome(int n)
    {
        int temp = n;
        int rev=0;
        while(n>0)
        {
            int digit = n %10;
            n=n/10;
            rev = (rev*10)+digit;
        }
        if(rev == temp)
            return "True";
        else 
            return "false";

    }
    static String armstrong(int n)
    {
        
        int temp = n;
        int digits = String.valueOf(n).length();
        int sum = 0;
        while(n>0)
        {
            int digit = n %10;
            sum += Math.pow(digit,digits);

            n = n/10;

        }
        System.out.println(sum);
        if(temp == sum)
            return "true";
        else
            return "false";

    }
    static boolean checkprime(int n)
    {
        if(n==1 || n==0) return false;
        if(n==2) return true; 
        if(n%2==0) return false;

        for(int i=3;i<=Math.sqrt(n);i+=2)
        {
            if(n % i == 0)
            {
                return false;
            }
        }
        return true;

    }
    static void isprime(int[] a,int[] b)
    {
        ArrayList<Integer> list1 = new ArrayList<>();

        for(int i:a)
        {
            if(checkprime(i))
            {
                list1.add(i);
            }
        }
        for(int j:b)
        {
            if(checkprime(j))
            {
                list1.add(j);
            }
        }
        System.out.println("The prime numbers are "+list1);
    }

    public static void main(String[] args) {
        
        int n;
        Scanner sc = new Scanner(System.in);
        // System.out.println("enter the Num :");
        // n = sc.nextInt();

        // System.out.println(armstrong(n));
        int [] a = {1,2,4,5,3,7,9,4,6,07,31};
        int [] b = {10,11,23,40,67,25,98,73};

        isprime(a,b);
        sc.close();

    }

}
