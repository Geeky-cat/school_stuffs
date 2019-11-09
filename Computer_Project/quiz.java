import java.util.*;
class quiz
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int A[]=new int[5];
        int c=0;
        System.out.println("Here are your questions! \n");
        System.out.println("1.Who invented Compact Disc? \n1)John Hammond     2) Ed Brown");
        System.out.println("3) James T Russel     4)Frans Rosen\n");
        System.out.println("2.Which day is celebrated as world Computer Literacy Day? \n1) October 24     2)July 14");
        System.out.println("3) December 2     4)February 31 \n");
        System.out.println("3.Who invented Java? \n1)Travis Normandy     2)Eduardo Vela");
        System.out.println("3)Elon Musk   4)James A Gosling\n");
        System.out.println("4.'Do no evil' is tag line of ...... \n1)Google     2)Yahoo");
        System.out.println("3)Microsoft     4) Facebook\n");
        System.out.println("5. Orkut.com is now owned by ...... \n1)Facebook     2)Google");
        System.out.println("3) Twitter     4)Snapchat\n");
        System.out.println("Enter your options:");
        for(int i=0;i<5;i++)
        A[i]=sc.nextInt();
        int K[]={3,3,4,1,2};
        for(int i=0;i<5;i++)
        {
            if(A[i]==K[i])
            c++;
        }
        int r=12000;
        for(int i=0;i<c;i++)
        r*=2;
        System.out.println("You got "+c+" out of 5 answers correct");
        if(c>0)
        System.out.println("You win "+r+" Ruppees!");
    }
}