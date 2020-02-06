import java.util.*;
class numb
{
    String t;
    String num[]={"ZERO","ONE","TWO","THREE","FOUR","FIVE","SIX","SEVEN","EIGHT","NINE"};
        String num1[]={"T","ELEV","TWE","THIR","FOUR","FIF","SIX","SEVEN","EIGH","NINE"};
    String display(int n1)
    {  
        String s=Integer.toString(n1);
        int k=s.length();
        if(k==1)
        {
            t=num[n1];
        }
        else if(k==2)
        {
            if(s.charAt(0)=='1')
            {
                if(s.charAt(1)=='0')
                    t=num1[0]+"EN";
                if(s.charAt(1)=='1')
                {
                    t=num1[1]+"EN";
                    return t;
                }
                if(s.charAt(1)=='2')
                
                    t=num1[2]+"ELEVE";
                else
                {
                    int a=Integer.parseInt(Character.toString(s.charAt(1)));
                    t=num1[a]+"TEEN";
                }
            }
            else
            {
                int k2=Integer.parseInt(Character.toString(s.charAt(0)));
                int k3=Integer.parseInt(Character.toString(s.charAt(1)));
                if(k2==2)
                {
                    t=num1[k2]+"NTY"+" "+num[k3];
                }
                else
                {
                 t=num1[k2]+"TY"+" "+num[k3];
            }
                t=t.replace("ZERO","");
                System.out.println(t);
            }
        }
        return t;
    }
    void ans()
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int fi=0;
        String nums=Integer.toString(n);
        if(nums.length()<3)
        {
            System.out.println(n);
        }
        else
        {
            fi=Integer.parseInt(Character.toString(nums.charAt(0)));
            int second=Integer.parseInt(nums.substring(1));
            String t1=num[fi]+" HUNDRED AND "+display(second);
            t1=t1.replace("ZERO","");
            int g=t1.length()-4;
            if(t1.substring(g).equals("AND "))
                t1=t1.replace("AND","");
            System.out.println(t1);
        }
    }
}
