package strings;
import java.util.Scanner;
//Task #5: Input: index of a Fibonacci sequence. Output: corresponding number.
public class FifthTask
{
public static void main(String[] arguments)
{
Scanner scanner = new Scanner(System.in);
int index = Integer.parseInt(scanner.nextLine());
long[] fibonacciNumbers = new long[index];

fibonacciNumbers[0] = 0; fibonacciNumbers[1] = 1;
if (index > 2)
{
for (int i = 2; i < index; i++) {fibonacciNumbers[i] = fibonacciNumbers[i - 1] + fibonacciNumbers[i - 2];}
System.out.println(fibonacciNumbers[index-1]);
} else {System.out.println("Invalid index!");}}}

