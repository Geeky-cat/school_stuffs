import java.util.*;
class FibonacciCalc
{
  static int fibonacciRecursion(int n)
  {
    if(n == 0)
        return 0;
    if(n == 1 || n == 2)
        return 1;
    return fibonacciRecursion(n-2) + fibonacciRecursion(n-1);
   }
   public static void main(String args[]) 
  {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the limit of the Fibonacci Series");
    int n=sc.nextInt();
    System.out.print("First "+n+" Fibonacci numbers are: ");
    for(int i = 0; i < n; i++)
    	System.out.print(fibonacciRecursion(i) +" ");
   }
 }