package strings;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
//Task #2: Find the word with the biggest "sum" of its letters.
public class SecondTask
{
public static void main(String[] arguments)
{
Scanner scanner = new Scanner(System.in);
String input = scanner.nextLine();
List<String> words = Arrays.asList(input.split(", "));
List<String> lowerWords = new ArrayList<>();

for (int i = 0; i < words.size(); i++) {lowerWords.add(words.get(i).toLowerCase());}

int max = 0;
int index = 0;

for (int i = 0; i < lowerWords.size(); i++)
{
int currentMax = calculateSumOfLetters(lowerWords.get(i));

if (currentMax > max) {max = currentMax; index = i;}
}

System.out.println(words.get(index));
}

public static int calculateSumOfLetters(String word)
{
int sum = 0;
for (int i = 0; i < word.length(); i++) {int value = (int)word.charAt(i); sum+=value;}
return sum;
}}
