import java.util.*;
class zcoprep
{
     boolean ish(int H[],int N)
    {
        int flag=0;
        for (int i=0;i<N;i++)
        {
            if(!(1<=H[i]&&H[i]<=50))
            {
                flag=1;
            }    
        }
        if (flag==1)
            return false;
            else 
            return true;
        
    }
     void prog(int T)
    {
        String sel="";int count=0;
        Scanner sc=new Scanner(System.in);
        int M=0,N=0,S=0;
        //getting the input here then
        //T=sc.nextInt();
        String s=sc.nextLine();
        StringTokenizer st=new StringTokenizer(s);
        N=Integer.parseInt(st.nextToken());
        M=Integer.parseInt(st.nextToken());
        S=Integer.parseInt(st.nextToken());
        int H[]=new int[N];
        String s1=sc.nextLine();
        StringTokenizer st1=new StringTokenizer(s1);
        for(int i=0;i<N;i++)
        {
            H[i]=Integer.parseInt(st1.nextToken());
            
        } 
        if (1<=T&&T<=10&&1<=N&&N<=Math.pow(10,5)&&1<=M&&M<=Math.pow(10,5)&&1<=S&&S<=16&&ish(H,N))
        {
            
          
                for (int j=0;j<N;j++)
                {
                    //System.out.println(H[j]);
                    if(H[j]<=S&&count<=M)
                    {
                        count++;
                        sel+=Integer.toString(H[j])+" ";
                    }
                    
                }
                for (int i=0;i<N;i++)
                {
                     if(H[i]>S&&count<=M&&(H[i]/2)<=S)
                    {
                         count+=1;                        
                         //sel+=Integer.toString(H[i])+" ";
                    }
                
                }
  
        }
        
        System.out.println(count);
    }
    public static void main(String[]args)
    {
        zcoprep obj=new zcoprep();
        Scanner sc=new Scanner(System.in);
        int T=sc.nextInt();
        for(int i=1;i<=T;i++)
            obj.prog(T);
        
    }
    
}

