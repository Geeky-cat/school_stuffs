import java.util.*;
class wordSearch
{
    public static void main(String[]args)
    {
        System.out.println("Enter the sentence");
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        System.out.println("Enter the word to search");
        String search=sc.nextLine();
        int init=0;
        int flag=0;
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)==' ')
            {
               String wd=s.substring(init,i);
               init=i+1;
               if(wd.equalsIgnoreCase(search))
               {
                   System.out.println("Search element found!");
                   flag=1;
                   break;
                }
            }
        }
        if(flag==0)
            System.out.println("Search element not found");       
    }
}