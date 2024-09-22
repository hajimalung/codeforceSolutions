
/*!SECTION
 * George has recently entered the BSUCP (Berland State University for Cool Programmers). George has a friend Alex who has also entered the university. Now they are moving into a dormitory.

George and Alex want to live in the same room. The dormitory has n rooms in total. At the moment the i-th room has pi people living in it and the room can accommodate qi people in total (pi ≤ qi). Your task is to count how many rooms has free place for both George and Alex.

Input
The first line contains a single integer n (1 ≤ n ≤ 100) — the number of rooms.

The i-th of the next n lines contains two integers pi and qi (0 ≤ pi ≤ qi ≤ 100) — the number of people who already live in the i-th room and the room's capacity.

Output
Print a single integer — the number of rooms where George and Alex can move in.
 */
import java.util.Scanner;

public class GeorgeAndAccombadation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int possibleRoomsCount = 0;
        for (int i = 0; i < n; i++) {
            int pi = sc.nextInt();
            int qi = sc.nextInt();
            if ((qi - pi) >= 2) {
                possibleRoomsCount++;
            }
        }
        System.out.println(possibleRoomsCount);
    }
}
