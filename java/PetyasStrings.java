/*
 * Little Petya loves presents. His mum bought him two strings of the same size for his birthday. The strings consist of uppercase and lowercase Latin letters. Now Petya wants to compare those two strings lexicographically. The letters' case does not matter, that is an uppercase letter is considered equivalent to the corresponding lowercase letter. Help Petya perform the comparison.

Input
Each of the first two lines contains a bought string. The strings' lengths range from 1 to 100 inclusive. It is guaranteed that the strings are of the same length and also consist of uppercase and lowercase Latin letters.

Output
If the first string is less than the second one, print "-1". If the second string is less than the first one, print "1". If the strings are equal, print "0". Note that the letters' case is not taken into consideration when the strings are compared.
 */

import java.util.Scanner;

public class PetyasStrings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String present1 = sc.nextLine().toLowerCase();
        String present2 = sc.nextLine().toLowerCase();
        for (int i = 0; i < present1.length(); i++) {
            int ch1 = present1.codePointAt(i);
            int ch2 = present2.codePointAt(i);
            if(ch1>ch2){
                System.out.println(1);
                return;
            }else if(ch2>ch1){
                System.out.println(-1);
                return;
            }else continue;
        }
        System.out.println(0);
    }
}
