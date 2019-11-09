import java.util.Scanner;
class evilNumber
{
    static int a=0;static int c=0;
    public static void main(String[]args)
    {
        System.out.println("Enter the number to check for EVIL Number ");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        while(n>0)
        {
            a=n%2;
            if (a==1)
            c++;
            n/=2;
            
        }
        if (c%2==0)
        System.out.println("The input is an Evil Number");
        else
        System.out.println("The input is not an Evil Numebr");
    }
    
    }