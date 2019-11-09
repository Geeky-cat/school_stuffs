import java.util.Scanner;
import java.util.StringTokenizer;
class wordPotential
{
    void find(String s)
    {
        StringTokenizer st=new StringTokenizer(s);
        while(st.hasMoreTokens())
        {
            String wd=st.nextToken();
            int val=0;
            for (int i=0;i<wd.length();i++)
            {
                val+=(int)wd.charAt(i);
            }
            System.out.println(wd+": "+val);
        
        }
    }
    public static void main(String[]args)
    {
        System.out.println("Enter the text to calculate its word potential");
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        wordPotential obj=new wordPotential();
        obj.find(s);
    }
}