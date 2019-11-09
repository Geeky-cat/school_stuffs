import java.util.Scanner;
class circularPrime
{
    boolean ifPrime(int s)
    {
        int fl=0;
        for(int i=1;i<s;i++)
        {
            if (s%i==0)
               fl++;
        }
        if (fl==1)
            return true;
        else
            return false;
    }
    public static void main(String[]args)
    {
        circularPrime obj=new circularPrime();
        System.out.println("Enter the number to check for Circular Prime");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        String str=Integer.toString(n);
        int length=str.length();
        String conv="";
        int flag=0;
        for(int i=1;i<=length;i++)
        {
            for (int j=1;j<(length-1);j++)
                conv+=str.charAt(j);
            conv+=str.charAt(0);
            if(!obj.ifPrime(Integer.parseInt(conv)))
            {
             flag++;   
            }
            str=conv;
            conv="";
        }        
        if(flag==0)
            System.out.println("The input number is a Circular Prime");
        else
            System.out.println("The input number is not a Circular Prime");    
        }
}