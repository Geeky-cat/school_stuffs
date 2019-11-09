import java.util.*;
class Permutations
{
    static void permutations(String cad, String rem)
    {
        if (rem.length() == 0) {
            System.out.println(cad);
        }
        for (int i = 0; i < rem.length(); i++)
        {
            String newcad = cad + rem.charAt(i);
            String newrem = rem.substring(0, i)+rem.substring(i + 1);
            permutations(newcad, newrem);
        }
    }
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the word to print all its pemutation");
        String s=sc.nextLine();
        System.out.println("Output: ");
        permutations("", s);
    }
}