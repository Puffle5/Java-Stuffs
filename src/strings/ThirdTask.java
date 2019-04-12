package strings;

import java.util.Scanner;
//Task #3: Calculation of the index sums (odd/even) of a word.
public class ThirdTask
{
    public static void main(String[] arguments)
    {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine().toLowerCase();
        int evenSum = calculateEvenSum(input);
        int oddSum = calculateOddSum(input);
        if (evenSum > oddSum)
        {System.out.println("Even Sum ("+evenSum+") > Odd Sum ("+oddSum+").");}
        else if (oddSum > evenSum)
        {System.out.println("Odd Sum ("+oddSum+") > Even Sum ("+evenSum+").");}
        else {System.out.println("Even Sum ("+evenSum+") and Odd Sum ("+oddSum+") are equal.");}


    }

    public static int calculateEvenSum(String word)
    {
        int sum = 0;
        for (int i = 0; i < word.length(); i++ )
        {if (i%2 == 0) {sum+=word.charAt(i);}}
        return sum;
    }

    public static int calculateOddSum(String word)
    {
     int sum = 0;
     for (int i = 0; i < word.length(); i++)
     {if (i%2 != 0) {sum+=word.charAt(i);}}

     return sum;
    }
}
