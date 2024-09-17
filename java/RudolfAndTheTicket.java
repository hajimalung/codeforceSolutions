/*Rudolf is going to visit Bernard, and he decided to take the metro to get to him. The ticket can be purchased at a machine that accepts exactly two coins, the sum of which does not exceed 𝑘
.

Rudolf has two pockets with coins. In the left pocket, there are 𝑛
 coins with denominations 𝑏1,𝑏2,…,𝑏𝑛
. In the right pocket, there are 𝑚
 coins with denominations 𝑐1,𝑐2,…,𝑐𝑚
. He wants to choose exactly one coin from the left pocket and exactly one coin from the right pocket (two coins in total).

Help Rudolf determine how many ways there are to select indices 𝑓
 and 𝑠
 such that 𝑏𝑓+𝑐𝑠≤𝑘
.

Input
The first line contains an integer 𝑡
 (1≤𝑡≤100
) — the number of test cases. Then follows the description of each test case.

The first line of each test case contains three natural numbers 𝑛
, 𝑚
, and 𝑘
 (1≤𝑛,𝑚≤100,1≤𝑘≤2000
) — the number of coins in the left and right pockets, and the maximum sum of two coins for the ticket payment at the counter, respectively.

The second line of each test case contains 𝑛
 integers 𝑏𝑖
 (1≤𝑏𝑖≤1000
) — the denominations of coins in the left pocket.

The third line of each test case contains 𝑚
 integers 𝑐𝑖
 (1≤𝑐𝑖≤1000
) — the denominations of coins in the right pocket.

Output
For each testcase, output a single integer — the number of ways Rudolf can select two coins, taking one from each pocket, so that the sum of the coins does not exceed 𝑘
. */

import java.util.Scanner;

public class RudolfAndTheTicket {
 public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int t = sc.nextInt();
    int results[] = new int[t];
    for(int i=0;i<t;i++){
        int n=sc.nextInt(),m=sc.nextInt(),k=sc.nextInt();
        int MaxkMinusns = -1;
        int noOfPositiveKMinusNs = 0;
        for(int j=0;j<n;j++){
            int leftPocketCoinValue = sc.nextInt();
            int diff = k - leftPocketCoinValue;
            if(diff>0){
                noOfPositiveKMinusNs++;
                if(diff>MaxkMinusns){
                    MaxkMinusns = diff;
                }
            }
        }
        int noOfPossibleRightPocketCoins = 0;
        for(int a=0;a<m;a++){
            int rightpocketCoinValue = sc.nextInt();
            if(rightpocketCoinValue <= MaxkMinusns ){
                noOfPossibleRightPocketCoins++;
            }
        }

        results[i] = noOfPositiveKMinusNs * noOfPossibleRightPocketCoins;
        
    }
    for (int answer : results) {
        System.out.println(answer);
    }
 }   
}


/* GPT solution

import java.util.Scanner;

public class CoinPairSelector {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int t = scanner.nextInt();  // Number of test cases

        while (t-- > 0) {
            int n = scanner.nextInt();  // Number of coins in the left pocket
            int m = scanner.nextInt();  // Number of coins in the right pocket
            int k = scanner.nextInt();  // Maximum allowed sum

            int[] leftPocket = new int[n];
            int[] rightPocket = new int[m];

            // Read denominations in the left pocket
            for (int i = 0; i < n; i++) {
                leftPocket[i] = scanner.nextInt();
            }

            // Read denominations in the right pocket
            for (int i = 0; i < m; i++) {
                rightPocket[i] = scanner.nextInt();
            }

            // Calculate the number of valid pairs
            int validPairsCount = 0;
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    if (leftPocket[i] + rightPocket[j] <= k) {
                        validPairsCount++;
                    }
                }
            }

            // Output the result for the current test case
            System.out.println(validPairsCount);
        }

        scanner.close();
    }
}


 * 
 */