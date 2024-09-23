/*!SECTION
 * Dr. Bruce Banner hates his enemies (like others don't). As we all know, he can barely talk when he turns into the incredible Hulk. That's why he asked you to help him to express his feelings.

Hulk likes the Inception so much, and like that his feelings are complicated. They have n layers. The first layer is hate, second one is love, third one is hate and so on...

For example if n = 1, then his feeling is "I hate it" or if n = 2 it's "I hate that I love it", and if n = 3 it's "I hate that I love that I hate it" and so on.

Please help Dr. Banner.

Input
The only line of the input contains a single integer n (1 ≤ n ≤ 100) — the number of layers of love and hate.

Output
Print Dr.Banner's feeling in one line.
 */

import java.util.Scanner;

public class Hulk {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String hulksFeeling = "";
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            hulksFeeling += hulksFeeling.length() == 0 ? "" : " ";
            if (i % 2 == 0) {
                hulksFeeling += "I love that";
            } else {
                hulksFeeling += "I hate that";
            }
        }
        System.out.println(hulksFeeling.substring(0, hulksFeeling.lastIndexOf(" ")) + " it");
        sc.close();
    }
}
