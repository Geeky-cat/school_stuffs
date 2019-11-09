import java.util.Scanner;
class swapSort
{
    public static void main(String[]args)
    {
        System.out.println("Enter the text to SwapSort");
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        int length=s.length();
        char arr[]=new char[length];
        String s2="";
        for (int i=0;i<length;i++)
        {
            arr[i]=s.charAt(i);
        }
        String s1=Character.toString(arr[length-1]);
        for (int i=1;i<(length-1);i++)
        {
            s1+=arr[i];
        }
        s1+=arr[0];
        for(int i=0;i<length;i++)
        {
            for (int j=i;j<length-1;j++)
            {
                if (arr[i]>arr[j+1])
                {
                    char t=arr[j+1];
                    arr[j+1]=arr[i];
                    arr[i]=t;
                }
            }
        }
        for(int i=0;i<length;i++)
            s2+=arr[i];
        System.out.println("Original Word: "+s);
        System.out.println("Swapped Word: "+s1);
        System.out.println("Sorted Word: "+s2);

    }
    }