import java.util.Scanner;
class matrixRot
{
    static void rotate(int N,int m[][])
    {  
        for (int i=0;i<N/2;i++)
        {
            for (int j=i;j<N-i-1;j++)
            {
                int temp=m[i][j];
                m[i][j]=m[j][N-1-i];
                m[j][N-1-i]=m[N-1-i][N-1-j];  
                m[N-1-i][N-1-j]=m[N-1-j][i];
                m[N-1-j][i]=temp;
            }
        }
    }  
    static void display(int N,int m[][])
    {
        for(int i=0;i<N;i++)
        {
            for(int j=0;j<N;j++)
            System.out.print(m[i][j]+"\t");
            System.out.print("\n");
        }
        System.out.print("\n");
    }
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of row or coloumn:");
        int N=sc.nextInt();
        int m[][]=new int[N][N];
        System.out.println("Enter the elements:");
        for(int i=0;i<N;i++)
        {
            for(int j=0;j<N;j++)
            m[i][j]=sc.nextInt();
        }
        System.out.println();
        System.out.println("Original Matrix:");
        display(N,m);
        System.out.println();
        System.out.println("Rotated Matrix:");
        rotate(N,m);
        display(N,m);
    }
}