/*!SECTION
 * There are two sisters Alice and Betty. You have 𝑛
 candies. You want to distribute these 𝑛
 candies between two sisters in such a way that:

Alice will get 𝑎
 (𝑎>0
) candies;
Betty will get 𝑏
 (𝑏>0
) candies;
each sister will get some integer number of candies;
Alice will get a greater amount of candies than Betty (i.e. 𝑎>𝑏
);
all the candies will be given to one of two sisters (i.e. 𝑎+𝑏=𝑛
).
Your task is to calculate the number of ways to distribute exactly 𝑛
 candies between sisters in a way described above. Candies are indistinguishable.

Formally, find the number of ways to represent 𝑛
 as the sum of 𝑛=𝑎+𝑏
, where 𝑎
 and 𝑏
 are positive integers and 𝑎>𝑏
.

You have to answer 𝑡
 independent test cases.

Input
The first line of the input contains one integer 𝑡
 (1≤𝑡≤104
) — the number of test cases. Then 𝑡
 test cases follow.

The only line of a test case contains one integer 𝑛
 (1≤𝑛≤2⋅109
) — the number of candies you have.

Output
For each test case, print the answer — the number of ways to distribute exactly 𝑛
 candies between two sisters in a way described in the problem statement. If there is no way to satisfy all the conditions, print 0
.


 */

import java.util.Scanner;

public class CandySisters {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int test = sc.nextInt();
            System.out.println(waysToSolve(test));
        }
    }

    private static int waysToSolve(int n) {
        return (n - 1) / 2;
    }
}
