import java.util.Scanner;
import java.util.StringTokenizer;
class wordSort
{
    public static void main(String[]args)
    {
        int ct=1;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the sentence");
        String s=sc.nextLine();
        s=s.toUpperCase();
        
        System.out.println("\nYour Output: ");        
        for(int i=0;i<s.length();i++)
            {
                if(s.charAt(i)==' ')
                    ct++;
            }
        String arr[]=new String[ct];
        StringTokenizer st=new StringTokenizer(s);
        for(int i=0; st.hasMoreTokens(); i++)
        {
            arr[i]=st.nextToken();
        }
        for(int i=0; i<arr.length;i++)
        {
            for(int j=0;j<arr.length;j++)
            {
                if((arr[i].charAt(0))<(arr[j].charAt(0)))
                {
                    String temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        for(int i=0;i<arr.length;i++)
            System.out.print(arr[i].toLowerCase()+" ");
    }
}