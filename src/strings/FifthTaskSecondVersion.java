package strings;
import java.util.Scanner;
//Task #5: Input: number. Output: corresponding index.
public class FifthTaskSecondVersion
{
public static void main(String[] arguments)
{
Scanner scanner = new Scanner(System.in);
int number = Integer.parseInt(scanner.nextLine());

if (fibonacciNumber(number)) {System.out.println(findIndex(number) + 1);}
else {System.out.println("Not a Fibonacci number!");}
}

public static boolean perfectSquare(int x)
{int number = (int)Math.sqrt(x); return (number*number == x);}

public static boolean fibonacciNumber(int x)
{return perfectSquare(5*x*x + 4) || perfectSquare(5*x*x - 4);}

public static int findIndex(int number)
{
if (number < 2) {return number;}
int a = 0, b = 1, c = 1;
int result = 1;
while (c < number) {c = a + b; result++; a = b; b = c;}
return result;
}}
