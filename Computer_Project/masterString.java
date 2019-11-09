import java.util.Scanner;
import java.util.StringTokenizer;
class masterString
{
    String rev="";String cwd="";
    void palindrome(String s)
    {
        StringTokenizer st=new StringTokenizer(s);
        while(st.hasMoreTokens())
        {
            String wd=st.nextToken();
            cwd=wd;
            for (int i=wd.length()-1;i>=0;i--)
                rev+=Character.toString(wd.charAt(i));
            if(!rev.equals(wd))
            {
                for(int i=wd.length()-2;i>=0;i--)
                cwd+=wd.charAt(i);
                
            }
            System.out.print(cwd+" ");
            rev="";
        }
    }
    public static void main(String[]args)
    {
        masterString obj=new masterString();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the text to convert \n\n");
        String s=sc.nextLine();
        s=s.toUpperCase();
        System.out.println("Your input: "+s+"\n\n");
        System.out.print("Converted Text: ");
        obj.palindrome(s);
    }
}