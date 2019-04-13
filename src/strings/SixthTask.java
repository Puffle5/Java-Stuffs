package strings;
import java.util.Arrays;
import java.util.Scanner;
//Task #6: Generating a Tribonacci sequence.
public class SixthTask
{
public static void main(String[] arguments)
{
Scanner scanner = new Scanner(System.in);
System.out.println("Enter number of Tribonacci elements:");
int index = Integer.parseInt(scanner.nextLine()); //Must be >= 3.
System.out.println("Enter number for checking:");
int number = Integer.parseInt(scanner.nextLine());

long[] tribonacciNumbers = new long[index];
tribonacciNumbers[0] = tribonacciNumbers[1] = 0; tribonacciNumbers[2] = 1;

for (int i = 3; i < tribonacciNumbers.length; i++)
{tribonacciNumbers[i] = tribonacciNumbers[i-1] + tribonacciNumbers[i-2] + tribonacciNumbers[i-3];}

System.out.println(Arrays.toString(tribonacciNumbers));

boolean foundIndex = false;

for (int i = 0; i < tribonacciNumbers.length; i++)
{
if (tribonacciNumbers[i] == number)
{
foundIndex = true;
System.out.println("This number belongs to the Tribonacci sequence!");
System.out.println("Its index is: "+i+".");
}}

if (foundIndex == false) {System.out.println("This number doesn't belong to the Tribonacci sequence!");}
}}