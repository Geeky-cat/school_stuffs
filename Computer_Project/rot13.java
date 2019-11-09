import java.util.*;
class rot13
{
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Sentence to convert");
        String s=sc.nextLine();
        String z="";
        for(int i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);
            char cas=s.charAt(i);
            ch=Character.toUpperCase(ch);
            if(ch>=65&&ch<=77)
            {
                char c=(char)(ch+13);
                if(Character.isLowerCase(cas))
                    c=Character.toLowerCase(c);
                z+=c;
            }
            else if(ch>77&&ch<=90)
                {
                    int a=(int)90-ch;
                    int b=13-a;
                    char c=(char)(64+b);
                    if(Character.isLowerCase(cas))
                        c=Character.toLowerCase(c);
                    z+=c;
                }
            else
                z+=ch;
        }
        System.out.println(z);
    }
}