/*!SECTION
 * number of moves you need to do in order to make 𝑎
 divisible by 𝑏
. It is possible, that you have to make 0
 moves, as 𝑎
 is already divisible by 𝑏
. You have to answer 𝑡
 independent test cases.

Input
The first line of the input contains one integer 𝑡
 (1≤𝑡≤104
) — the number of test cases. Then 𝑡
 test cases follow.

The only line of the test case contains two integers 𝑎
 and 𝑏
 (1≤𝑎,𝑏≤109
).

Output
For each test case print the answer — the minimum number of moves you need to do in order to make 𝑎
 divisible by 𝑏
.
 */

import java.util.Scanner;

public class Divisibility {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int rem = a % b;
            if (rem == 0)
                System.out.println(0);
            else
                System.out.println(b - rem);
        }
    }
}
