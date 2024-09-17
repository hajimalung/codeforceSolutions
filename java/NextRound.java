/*
 * "Contestant who earns a score equal to or greater than the k-th place finisher's score will advance to the next round, as long as the contestant earns a positive score..." — an excerpt from contest rules.

A total of n participants took part in the contest (n ≥ k), and you already know their scores. Calculate how many participants will advance to the next round.

Input
The first line of the input contains two integers n and k (1 ≤ k ≤ n ≤ 50) separated by a single space.

The second line contains n space-separated integers a1, a2, ..., an (0 ≤ ai ≤ 100), where ai is the score earned by the participant who got the i-th place. The given sequence is non-increasing (that is, for all i from 1 to n - 1 the following condition is fulfilled: ai ≥ ai + 1).

Output
Output the number of participants who advance to the next round.
 */

import java.util.Scanner;

public class NextRound {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read n and k
        int n = scanner.nextInt();
        int k = scanner.nextInt();

        // Read scores
        int[] scores = new int[n];
        for (int i = 0; i < n; i++) {
            scores[i] = scanner.nextInt();
        }

        // Close the scanner
        scanner.close();

        // Calculate the number of participants advancing
        int result = countAdvancingParticipants(n, k, scores);
        System.out.println(result);
    }

    public static int countAdvancingParticipants(int n, int k, int[] scores) {
        // The score of the k-th participant (1-based index, so use k-1)
        int thresholdScore = scores[k - 1];

        // Count the number of participants who will advance
        int count = 0;
        for (int score : scores) {
            if (score >= thresholdScore && score > 0) {
                count++;
            }
        }

        return count;
    }
}
