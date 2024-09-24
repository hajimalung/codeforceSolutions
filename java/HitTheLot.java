
/*!SECTION
 * Allen has a LOT of money. He has 𝑛
 dollars in the bank. For security reasons, he wants to withdraw it in cash (we will not disclose the reasons here). The denominations for dollar bills are 1
, 5
, 10
, 20
, 100
. What is the minimum number of bills Allen could receive after withdrawing his entire balance?

Input
The first and only line of input contains a single integer 𝑛
 (1≤𝑛≤109
).

Output
Output the minimum number of bills that Allen could receive.


 */
import java.util.Scanner;

public class HitTheLot {
    public static void main(String[] args) {
        int[] denominations = { 100, 20, 10, 5, 1 };
        int minCurr = 0;
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < denominations.length; i++) { // this is BigO(5) - as the denominations array lenght will
                                                         // never change it will be always 5
            if (n > 0 && n >= denominations[i]) {
                minCurr += (int) (n / denominations[i]);
                n = n % denominations[i];
            }
        }
        System.out.println(minCurr);
    }
}
