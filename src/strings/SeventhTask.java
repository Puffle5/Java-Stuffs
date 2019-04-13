package strings;
import java.util.Scanner;
//Task #7: Checking whether a string is a palindrome.
public class SeventhTask
{
public static void main(String[] arguments)
{
Scanner scanner = new Scanner(System.in);
String original, reverse = "";
System.out.println("Enter string:");
original = scanner.nextLine();
int length = original.length();

for (int i = length - 1; i >= 0; i--) {reverse+=original.charAt(i);}
if (original.equals(reverse))
{System.out.println("This string is a palindrome.");}
else {System.out.println("This string isn't a palindrome.");}
}}