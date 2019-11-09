import java.util.*;
class Denomination
{
    int amt;
    Denomination()
    {
        amt=0;
    }
    int get()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the amount:");
        amt=sc.nextInt();
        String s=""+amt;
        int l=s.length();
        return l;
    }
    void check()
    {
        int l=get();
        if(l>5)
             System.out.println("INVALID AMOUNT");            
        else
            calprint();
    }
    void calprint()
    {
        int n=amt, rev=0,total=0,totaln=0,div;
        String word[]={"ZERO","ONE","TWO","THREE","FOUR","FIVE","SIX","SEVEN","EIGHT","NINE"};
        int notes[]={1000,500,100,50,20,10,5,2,1};
        while(n>0)
        {
            rev=(rev*10)+(n%10);
            n/=10;
        }
        while(rev>0)
        {
             System.out.print(word[rev%10]+" ");
             rev/=10;
        }
        System.out.println();
        System.out.println("DENOMINATION:");
        for(int i=0;i<9;i++)
        {
            div=amt/notes[i];
            amt%=notes[i];
            if(div>0)
            {
                System.out.println(notes[i]+"\tX\t"+div+"\t=\t"+(notes[i]*div));
                total+=notes[i]*div;
                totaln+=div;
            }
        }
        System.out.println("TOTAL="+total);
        System.out.println("TOTAL NUMBER OF NOTES:"+totaln);
    }
    public static void main(String args[])
    {
        Denomination denom = new Denomination();
        denom.check();
    }
}