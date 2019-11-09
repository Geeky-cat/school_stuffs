import java.util.*;
class sumOfMatrix
{
    public static void main(String[]args)
    {
        int ld=0,rd=0,ot=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of rows or columns");
        int n=sc.nextInt();
        int a[][]=new int[n][n];
        System.out.println("Enter the array elements");
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
                a[i][j]=sc.nextInt();
        }
        System.out.println("\nInput matrix: \n");
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
                System.out.print(a[i][j]+"  ");
            System.out.println();
        }
        for(int i=0;i<n;i++)
            ld+=a[i][i];
        int k=n-1;
        for(int i=0;i<n;i++)
        {
            rd+=a[i][k];
            k--;
        }
        for(int i=0;i<n;i++)
            ot+=a[0][i];
        for(int i=0;i<n;i++)
            ot+=a[n-1][i];   
        for(int i=1;i<n-1;i++)
            ot+=a[i][0]+a[i][n-1];  
        System.out.println("\nOutput: \n");
        System.out.println("Sum of numbers in left diagonal: "+ld);
        System.out.println("Sum of numbers in right diagonal: "+rd);
        System.out.println("Sum of boundary elements: "+ot);
    }
}