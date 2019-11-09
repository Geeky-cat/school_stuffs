import java.util.Scanner;
class dec2bin
{
    int convert(int n)
    {
        if (n==0)
        {
            return 0;
        }
        else 
        {
            return n%2+10*convert(n/2);
        }
    
    }
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number to convert");
        int p=sc.nextInt();
        dec2bin obj=new dec2bin();
        System.out.println("Result: "+obj.convert(p));
    }
}