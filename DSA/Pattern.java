import java.util.Scanner;

class Pattern {

    public static void Patterns(int n) {
        for (int i = 0; i <= n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println("");
        }
    }
    public static void Patterns2(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println("");
        }
    }
    public static void Patterns3(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = n; j >= i; j--) {
                System.out.print("* ");
            }
            System.out.println("");
        }
    }
    public static void Patterns4(int n) {
        for (int i = n; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println("");
        }
    }
    public static void Patterns5(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= (n - i); j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= (2 * i - 1); j++) {
                System.out.print("*");
            }
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            System.out.println("");
        }
    }
    public static void Patterns6(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 0; j < i - 1; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j <= (2 * (n - i)); j++) {
                System.out.print("*");
            }
            for (int j = 0; j < i - 1; j++) {
                System.out.print(" ");
            }
            System.out.println("");
        }
    }
    public static void Patterns7(int n) {
        for (int i = 1; i <= ((2 * n) - 1); i++) {
            int star = i;
            if (i > n) {
                star = 2 * n - i;
            }
            for (int j = 1; j <= star; j++) {
                System.out.print("*");
            }

            System.out.println("");

        }
    }
    public static void Patterns8(int n) {
        for (int i = 1; i <= n; i++) {
            int k = 1;
            for (int j = 1; j <= i; j++) {
                System.out.print(k + " ");
                k = 1 - k;
            }
            System.out.println("");
        }
    }
    public static void Patterns9(int n) {

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            int space = 2 * (n - i);
            for (int k = 1; k <= space; k++) {
                System.out.print(" ");
            }
            for (int j = i; j >= 1; j--) {
                System.out.print(j);
            }
            System.out.println("");
        }
    }
    public static void Patterns10(int n) {
        int k = 1;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(k + " ");
                k++;
            }
            System.out.println("");
        }
    }
    public static void Patterns11(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 0; j < i; j++) {
                char ch = 'A';
                System.out.print((char) (ch + j));
            }
            System.out.println(" ");
        }
    }
    public static void Patterns12(int n) {
        for (int i = n; i >= 0; i--) {
            for (int j = 0; j < i; j++) {
                char ch = 'A';
                System.out.print((char) (ch + j));
            }
            System.err.println("");
        }
     }
    public static void Patterns13(int n)
    {
        char ch='A';
        for(int i=0;i<=n;i++)
        {
            for(int j=0;j<=i;j++)
            {
                System.out.print((char)(ch+i));
            }
            System.out.println("");
            // print("hello")
            // ch=ord('A')
            // n=5
            // for i in range(0,n):
            // for j in range (ch,ch+i+1):
            // print(chr(j),end="")
            // print() 
        }
    }
    public static void Patterns14(int n)
    {
        char ch='A';
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n-i-1;j++)
            {
                System.out.print(" ");
            }
            // int breakpoint = (2*i+1)/2;
            for(int k=0;k<=i;k++)
            {
                    System.out.print((char)(ch+k));
                    // if(k<=breakpoint)
                    //  {
                    //     ch++;
                    // }
                    // else{
                    //     ch--;
                    // }
            }
            for(int j=i-1;j>=0;j--)
            {
                System.out.print((char)(ch+j));
            }
            for(int j=0;j<n-i-1;j++)
            {
                System.out.print(" ");
            }
            System.out.println("");
        }
        // print("hello")
        // ch=ord('A')
        // n=5
        // for i in range(0,n):
        //     for j in range(0,n-i-1):
        // print(" ",end="")
        //     for k in range(ch,ch+i+1):
        // print(chr(k),end="")
        //     for l in range(ch+i-1,ch-1,-1):
        //         print(chr(l),end="")
        //     # print(chr(ch))
        //     print()

        // for i in range(0,n):
        //     for j in range(0,n-i-1):
        //         print(" ",end="")
        //     for k in range(0,i+1):
        //         print(chr(ch+k),end="")
        //     for l in range(i-1,-1,-1):
        //         print(chr(ch+l),end="")
        //     print()

    }
    public static void Patterns15(int n)
    {   
        char ch='A';
        for(int i=0;i<=n+1;i++)
        {
            for(int j=n-i+1;j<=n;j++)
            {
                System.out.print((char)(ch+(j)));
            }
            System.out.println("");
        }

    }
    public static void Patterns16(int n)
    {
        for(int i=1;i<=n;i++)
        {
            for (int j=n;j>=i;j--)
            {
                System.out.print("*");
            }

            for(int k=1;k<i;k++)
            {
                System.out.print("  ");
            }
            for(int l=n;l>=0+i;l--)
            {
                System.out.print("*");
            }
            System.out.println("");
        }
        for(int i=0;i<n;i++)
        {
            for(int j=1;j<=i+1;j++)
            {
                System.out.print("*");
            }
            for(int k=0;k<(n-i-1);k++)
            {
                System.out.print("  ");
            }
            for(int l=1;l<=i+1;l++)
            {
                System.out.print("*");
            }
            System.out.println("");

        }
    }
    public static void Patterns17(int n)
    {
        for (int i=0;i<=n;i++)
        {
            for(int j=0;j<=n-i;j++)
            {
                System.out.print("*");
            }
            for(int k=0;k<i;k++)
            {
                System.out.print("  ");
            }
            // for
            for(int l=0;l<=n-i;l++)
            {
                System.out.print("*");

            }
            System.out.println("");
        }
        int spaces = 2*n-2;
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=i+1;j++)
            {
                System.out.print("*");
            }
            for(int k=0;k<spaces;k++)
            {
                System.out.print(" ");
            }
            for(int l=1;l<=i+1;l++)
            {
                System.out.print("*");
            }
            spaces-=2;
            System.err.println();
        }
    }
    public static void Patterns18(int n)
    {
        int space = 2*n-2;
        for(int i=1;i<=(2*n-1);i++)
        {
            int star = i;
            if(i>n)
            {
                star = 2*n-i;
            }
            for(int j=1;j<=star;j++)
            {
                System.out.print("*");
            }
            for(int k=1;k<=space;k++)
            {
                System.out.print(" ");
            }
            for(int j=1;j<=star;j++)
            {
                System.out.print("*");
            }
            System.out.println("");
            if(i<n)
            space-=2;
            else
            space+=2;
        }

    }
    public static void Patterns19(int n)
    {
        int star,space;
        for(int i=1;i<=n;i++)
        {

            // if(i==1 || i==n) ? star=n,space=0 : star=1,space=n-2;
            star = (i==1 || i==n)? n: 1;
            space = (i==1 || i==n)? 0: n-2;

            for(int j=1;j<=star;j++)
            {
                System.out.print("*");
            }
            for(int k=1;k<=space;k++)
            {
                System.out.print(" ");
            }

            System.out.println((i==1||i==n)?"":"*");

        }
    }
    public static void Patterns20(int n)
    {
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                if( i ==0 || j==0 || i==n-1 || j==n-1)
                System.out.print("*");
                else
                System.out.print(" ");
            }
            System.out.println("");
        }
    }
    public static void Patterns21(int n)
    {
        int size = 2*n-1;
        for(int i=0;i<size;i++)
        {
            for(int j=0;j<size;j++)
            {
                if(i==0 || j==0 || j== size -1|| i == size -1)
                {
                    System.out.print(n);
                }
                else{
                    int num = 0;
                            if (i >= n) num = size - 1 - i;
                            if (j < num) num = j;
                            if (j >= size - num) num = size - 1 - j;

                            System.out.print(n - num);
                }
            }
            System.out.println("");
        }
    }
    public static void Patterns22(int n)
    {
         for(int i=0;i<(2*n)-1;i++)
        {
            for(int j=0;j<(2*n)-1;j++)
            {
                int top = i;
                int left = j;
                int right = (2*n -2) -j;
                int down = (2*n -2) -i;

                System.out.print(n- Math.min(Math.min(top,left),Math.min(right,down)));
            }
            System.out.println("");
        }
    }
    
    
    
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Size :");
        int n = sc.nextInt();

        Patterns3(n);

        sc.close();
    }
}