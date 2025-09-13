import java.util.HashMap;
import java.util.Scanner;
public class hash {
    public static void main(String[] args) {
        
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array");
        n = sc.nextInt();
        
        HashMap<String,Integer> marks = new HashMap<>();
        sc.nextLine();
        for(int i=0;i<=n;i++)   
        {
            System.out.println("enter the "+(i+1)+"Subject");
            String text = sc.nextLine();

            System.out.println("enter the "+text+"Marks");
            int num =  sc.nextInt();
            sc.nextLine();

            marks.put(text,num);
        }
        // marks.put("Math",90) ;
        // marks.put("English",80) ;

        System.out.println(marks);

        sc.close();
    }

}
