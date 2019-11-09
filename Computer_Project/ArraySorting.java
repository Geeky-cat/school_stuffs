import java.util.*;
class ArraySorting
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows");
        int m =sc.nextInt();
        System.out.println("Enter the number of coloumns");
        int n =sc.nextInt();
        int A[][]=new int[m][n];
        int B[][]=new int[m][n];
        System.out.println("Enter the elements");
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                A[i][j]=sc.nextInt();
            }
        }
         for(int i=0;i<m;i++)//Making dupliacte matrix to sort by coulmn
        {
            for(int j=0;j<n;j++)
            {
                B[i][j]=A[i][j];
            }
        }
        System.out.println("\n");
        System.out.println("ORIGINAL MATRIX :");
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            System.out.print(A[i][j]+"\t");
            System.out.println();
        }
        System.out.println();
        for (int i = 0; i < m; i++) 
        {
            for (int j = 0; j < n; j++) 
            { 
                for (int k = 0; k <m-j-1; k++) 
                { 
                    if (A[i][k] > A[i][k+1]) 
                    { 
                        int t = A[i][k]; 
                        A[i][k] = A[i][k + 1]; 
                        A[i][k + 1] = t; 
                    } 
                } 
            } 
        }
        System.out.println("SORTED BY ROW :");
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
                System.out.print(A[i][j]+"\t");
            System.out.println();    
        }
        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                for(int k = 0; k < m - 1 - j; k++){ 
                    if(B[k][i] > B[k + 1][i]){
                        int temp = B[k][i];
                        B[k][i] = B[k + 1][i];
                        B[k + 1][i] = temp;
                    }
                }
            }
        }
        System.out.println("\nSORTED BY COLUMN\n");
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
                System.out.print(B[i][j]+"\t");
            System.out.println();    
        }
    }
}    