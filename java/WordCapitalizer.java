/*
 * Capitalization is writing a word with its first letter as a capital letter. Your task is to capitalize the given word.

Note, that during capitalization all the letters except the first one remains unchanged.

Input
A single line contains a non-empty word. This word consists of lowercase and uppercase English letters. The length of the word will not exceed 103.

Output
Output the given word after capitalization.
 */

import java.util.Scanner;

public class WordCapitalizer {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String word = sc.nextLine();
        sc.close();
        char firstChar = word.charAt(0);
        int smallA = (int)'a';
        int capitaA = (int)'A';
        int capitaZ = (int)'Z';
        if( (capitaA <= (int)firstChar) && ((int)firstChar <= capitaZ) ){
            //already first letter is capital
        }else{
            int diff = (int)firstChar - smallA;
            char capitalizedFirstChar = (char)(capitaA + diff);
            // word.replace(firstChar, capitalizedFirstChar);
            word = word.replaceFirst(""+firstChar, ""+capitalizedFirstChar);
        }
        System.out.println(word);
    }
    
}
