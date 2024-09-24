
/*!SECTION
 * One dragon. Two dragon. Three dragon», — the princess was counting. She had trouble falling asleep, and she got bored of counting lambs when she was nine.

However, just counting dragons was boring as well, so she entertained herself at best she could. Tonight she imagined that all dragons were here to steal her, and she was fighting them off. Every k-th dragon got punched in the face with a frying pan. Every l-th dragon got his tail shut into the balcony door. Every m-th dragon got his paws trampled with sharp heels. Finally, she threatened every n-th dragon to call her mom, and he withdrew in panic.

How many imaginary dragons suffered moral or physical damage tonight, if the princess counted a total of d dragons?

Input
Input data contains integer numbers k, l, m, n and d, each number in a separate line (1 ≤ k, l, m, n ≤ 10, 1 ≤ d ≤ 105).

Output
Output the number of damaged dragons.
 */
import java.util.HashSet;
import java.util.Scanner;

public class DamagedDragons {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read inputs for damage intervals and total dragons
        int punchInterval = scanner.nextInt();
        int tailInterval = scanner.nextInt();
        int pawInterval = scanner.nextInt();
        int threatInterval = scanner.nextInt();
        int totalDragons = scanner.nextInt();

        // Use a set to hold the unique damaged dragons
        HashSet<Integer> damagedDragons = new HashSet<>();

        // Check each dragon from 1 to totalDragons
        for (int dragonNumber = 1; dragonNumber <= totalDragons; dragonNumber++) {
            if (dragonNumber % punchInterval == 0 ||
                    dragonNumber % tailInterval == 0 ||
                    dragonNumber % pawInterval == 0 ||
                    dragonNumber % threatInterval == 0) {
                damagedDragons.add(dragonNumber);
            }
        }

        // Output the number of unique damaged dragons
        System.out.println(damagedDragons.size());

        scanner.close();
    }
}
