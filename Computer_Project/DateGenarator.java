import java.util.*;
class DateGenarator
{
    void gen()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("DATE GENERATOR");
        System.out.println("Enter a number(th day) 1-366");
        int d = sc.nextInt();
        System.out.println("Enter the Year");
        int y = sc.nextInt();
        boolean l = leapyear(y);
        if(d <1 || d>366)
            System.exit(0);
        if(l)
        {
            if(d>=1 && d<=31)
            System.out.println(d +", January,"+y);
            else if(d>=32 && d<=60)
            System.out.println(d-31 +", February,"+y);
            else if(d>=61 && d<=91)
            System.out.println(d-60 +", March,"+y);
            else if(d>=92 && d<=121)
            System.out.println(d-91 +", April,"+y);
            else if(d>=122 && d<=152)
            System.out.println(d-121 +", May,"+y);
            else if(d>=153 && d<=182)
            System.out.println(d-152 +", June,"+y);
            else if(d>=183 && d<=213)
            System.out.println(d-182 +", July,"+y);
            else if(d>=214 && d<=244)
            System.out.println(d-213 +", August,"+y);
            else if(d>=245 && d<=274)
            System.out.println(d-244 +", September,"+y);
            else if(d>=275 && d<=305)
            System.out.println(d-274 +", October,"+y);
            else if(d>=306 && d<=335)
            System.out.println(d-305 +", November,"+y);
            else if(d>=336 && d<=366)
            System.out.println(d-335 +", December,"+y);
        }
        else
        {
            if(d>=1 && d<=31)
            System.out.println(d +", January,"+y);
            else if(d>=32 && d<=59)
            System.out.println(d-31 +", February,"+y);
            else if(d>=59 && d<=90)
            System.out.println(d-58 +", March,"+y);
            else if(d>=91 && d<=120)
            System.out.println(d-90 +", April,"+y);
            else if(d>=121 && d<=151)
            System.out.println(d-120 +", May,"+y);
            else if(d>=152 && d<=181)
            System.out.println(d-151 +", June,"+y);
            else if(d>=182 && d<=212)
            System.out.println(d-181 +", July,"+y);
            else if(d>=213 && d<=243)
            System.out.println(d-212 +", August,"+y);
            else if(d>=244 && d<=273)
            System.out.println(d-243 +", September,"+y);
            else if(d>=274 && d<=304)
            System.out.println(d-273 +", October,"+y);
            else if(d>=305 && d<=334)
            System.out.println(d-304 +", November,"+y);
            else if(d>=335 && d<=365)
            System.out.println(d-334 +", December,"+y);
        }
    }
    static boolean leapyear(int a)
    {
        if(a%4==0)
        return true;
        else
        return false;
    }
    public static void main(String args[])throws Exception
    {
        DateGenarator DG = new DateGenarator();
        DG.gen();
    }
}