
/*!SECTION
 * There are three friend living on the straight line Ox in Lineland. The first friend lives at the point x1, the second friend lives at the point x2, and the third friend lives at the point x3. They plan to celebrate the New Year together, so they need to meet at one point. What is the minimum total distance they have to travel in order to meet at some point and celebrate the New Year?

It's guaranteed that the optimal answer is always integer.

Input
The first line of the input contains three distinct integers x1, x2 and x3 (1 ≤ x1, x2, x3 ≤ 100) — the coordinates of the houses of the first, the second and the third friends respectively.

Output
Print one integer — the minimum total distance the friends need to travel in order to meet together.
 */
// find avg and sum distacce from each node
import java.util.Scanner;
import java.util.Arrays;

public class NewYearMeetings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] a = { sc.nextInt(), sc.nextInt(), sc.nextInt() };
        Arrays.sort(a);
        sc.close();
        int toTravel = Math.abs(a[1] - a[0]) + Math.abs(a[2] - a[1]);
        System.out.println(toTravel);
    }
}
