package strings;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
/* Task #4:
1) Finding the odd word with the smallest letter sum.
2) Finding the even word with the biggest letter sum.
*/

public class FourthTask
{
public static void main(String[] arguments)
{
Scanner scanner = new Scanner(System.in);
String input = scanner.nextLine();

List<String> words = Arrays.asList(input.split(", "));
List<String> lowerWords = new ArrayList<>();
List<String> evenWords = new ArrayList<>();
List<String> oddWords = new ArrayList<>();

for (int i = 0; i < words.size(); i ++) {lowerWords.add(words.get(i).toLowerCase());}

for (int i = 0; i < lowerWords.size(); i++)
{
if (i%2 == 0) {evenWords.add(lowerWords.get(i));}
else {oddWords.add(lowerWords.get(i));}
}

int max = Integer.MIN_VALUE, min = Integer.MAX_VALUE;
int evenIndex = 0, oddIndex = 0;

for (int i = 0; i < evenWords.size(); i++)
{if (calculateSum(evenWords.get(i)) > max) {max = calculateSum(evenWords.get(i)); evenIndex = i;}}

for (int i = 0; i < oddWords.size(); i++)
{
if (calculateSum(oddWords.get(i)) < min)
{min = calculateSum(oddWords.get(i)); oddIndex = i;}
}

System.out.println(oddWords.get(oddIndex)+", "+evenWords.get(evenIndex));
}

public static int calculateSum(String word)
{
int sum = 0;
for (int i = 0; i < word.length(); i++) {sum+=(int)word.charAt(i);}
return sum;
}}