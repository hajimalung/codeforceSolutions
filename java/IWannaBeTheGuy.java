/*!SECTION
 * There is a game called "I Wanna Be the Guy", consisting of n levels. Little X and his friend Little Y are addicted to the game. Each of them wants to pass the whole game.

Little X can pass only p levels of the game. And Little Y can pass only q levels of the game. You are given the indices of levels Little X can pass and the indices of levels Little Y can pass. Will Little X and Little Y pass the whole game, if they cooperate each other?

Input
The first line contains a single integer n (1 ≤  n ≤ 100).

The next line contains an integer p (0 ≤ p ≤ n) at first, then follows p distinct integers a1, a2, ..., ap (1 ≤ ai ≤ n). These integers denote the indices of levels Little X can pass. The next line contains the levels Little Y can pass in the same format. It's assumed that levels are numbered from 1 to n.

Output
If they can pass all the levels, print "I become the guy.". If it's impossible, print "Oh, my keyboard!" (without the quotes).
 */

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class IWannaBeTheGuy {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int p = sc.nextInt();
        Set<Integer> levels = new HashSet<Integer>();
        for (int i = 0; i < p; i++) {
            levels.add(sc.nextInt());
        }
        int q = sc.nextInt();
        for (int i = 0; i < q; i++) {
            levels.add(sc.nextInt());
        }
        if (levels.size() == n)
            System.out.println("I become the guy.");
        else
            System.out.println("Oh, my keyboard!");
    }
}
