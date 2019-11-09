import java.util.*;
class LcmGcd
{
    static int i=1;
    
    static int lcm(int a,int b)
    {
        if(a%b==0)
        return a;
     else
        return lcm(a+a/i++,b);
    }
    static int gcd(int a,int b)
    {
        if (a==0)
            return b;
        else
            return gcd(b%a,a);
    }
    public static void main(String[]args)
    {
        LcmGcd obj=new LcmGcd();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the 2 numbers to find its HCF or LCM");
        int a=sc.nextInt();
        int b=sc.nextInt();
        System.out.println("Enter 1 to find LCM or 2 to find HCF of the given numbers");
        int c=sc.nextInt();
        if(c==1)
            System.out.println("The LCM of the given numbers is: "+ lcm(a,b)); 
        else if(c==2)    
             System.out.println("The GCD of the given numbers is: "+ gcd(a,b)); 
        else 
             System.out.println("Please recheck your selection"); 
    }
}