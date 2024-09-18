/*
 * You are given a string 𝑠
 consisting of lowercase English letters.

Rearrange the characters of 𝑠
 to form a new string 𝑟
 that is not equal to 𝑠
, or report that it's impossible.

Input
The first line contains a single integer 𝑡
 (1≤𝑡≤1000
) — the number of test cases.

The only line of each test case contains a string 𝑠
 of length at most 10
 consisting of lowercase English letters.

Output
For each test case, if no such string 𝑟
 exists as described in the statement, output "NO" (without quotes).

Otherwise, output "YES" (without quotes). Then, output one line — the string 𝑟
, consisting of letters of string 𝑠
.

You can output "YES" and "NO" in any case (for example, strings "yEs", "yes", and "Yes" will be recognized as a positive response).

If multiple answers are possible, you can output any of them.
 */

import java.util.Scanner;

public class DifferentString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t =sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < t; i++) {
            String str = sc.nextLine();
            String newString  = str.substring(1)+str.charAt(0);
            if(!str.equals(newString)){
                System.out.println("YES");
                System.out.println(newString);
            }else{
                System.out.println("NO");
            }
        }
    }
}
