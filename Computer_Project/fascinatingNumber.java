import java.util.*;
class fascinatingNumber
{
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number to check for fascinating number");
        int a=sc.nextInt();
        int b=a*2;
        int c=a*3;
        String s=Integer.toString(a)+Integer.toString(b)+Integer.toString(c);
        System.out.println(s);
        boolean found=true;
            for (int i=1;i<=9;i++)
            {
                int  count=0;
               for(int j=0;j<s.length();j++)
               {
                   String d=Character.toString(s.charAt(j));
                   int p=Integer.parseInt(d);
                   if(p==i)
                   {
                    count++;   
                    }
                }
                if (count!=1)
                {
                    found=false;
                    break;
                }
               
            }
        if (found)
            System.out.println(a+" is a fascinating number");
        else
            System.out.println(a+" is not a fascinating number");
    }
}
    