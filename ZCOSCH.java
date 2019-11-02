import java.util.*;
class zco
{
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        int R=sc.nextInt();
        if(R>=1&&R<=Math.pow(10,9))
        {
            if ( R<=50)
            {
                System.out.println(100);
            }
            else if ( R>50&&R<=100)
            {
                System.out.println(50);
            }
            else
            {
                System.out.println(0);
            }
            
        
        
        }
    }
}


/*
 * All submissions for this problem are available.The ZCO Scholarship Contest has just finished, and you finish with a rank of R. You know that Rank 1 to Rank 50 will get 100% scholarship on the ZCO exam fee and Rank 51 to Rank 100 will get 50%

percentage scholarship on the ZCO exam fee. The rest do not get any scholarship.
What percentage of scholarship will you get ?
Input

    Input consist of single line of input containing one integer R

    .

Output

    Output a single line containing one integer — the percentage of scholarship you will get.

Constraints

    1≤R≤109

Example Input 1

49

Example Output 1

100

Explanation 1

Since 1≤49≤50
, answer is 100

percentage scholarship.
Example Input 2

317

Example Output 2

0

Explanation 2

Since 317>100

, you do not get any scholarship.

*/
