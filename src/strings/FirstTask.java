package strings;
import java.util.*;
//Task #1: Finding the first word with the "biggest" letter.
public class FirstTask
{
public static void main(String[] arguments)
{
Scanner scanner = new Scanner(System.in);
String input = scanner.nextLine();
//Converting the input into a String List:
List<String> words = Arrays.asList(input.split(", "));
List<String> lowerWords = new ArrayList<>();
List<Character> letters = new ArrayList<>();

//'words' List --> Lower Case.
for (int i = 0; i < words.size(); i++)
{lowerWords.add(words.get(i).toLowerCase());}

//Filling the 'letters' List with the "biggest" letter of every word:
for (int i = 0; i < lowerWords.size(); i++)
{letters.add(convert(lowerWords.get(i)));}

//Very important:
int bestIndex = 0;
char bestChar = 'a';

for (int i = 0; i < letters.size(); i++)
{
char currentChar = letters.get(i);
if (currentChar > bestChar) {bestChar = currentChar; bestIndex = i;}
}

System.out.println(words.get(bestIndex));
}

//Method for getting the "biggest" letter of a word:
public static char convert(String word)
{
int max = 0;
int currentValue;
for (int i = 0; i < word.length(); i++)
{
currentValue = (int)word.charAt(i);
if (currentValue > max) {max = currentValue;}
}
return (char)max;
}}