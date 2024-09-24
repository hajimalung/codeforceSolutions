
/*!SECTION
 * A Ministry for Defense sent a general to inspect the Super Secret Military Squad under the command of the Colonel SuperDuper. Having learned the news, the colonel ordered to all n squad soldiers to line up on the parade ground.

By the military charter the soldiers should stand in the order of non-increasing of their height. But as there's virtually no time to do that, the soldiers lined up in the arbitrary order. However, the general is rather short-sighted and he thinks that the soldiers lined up correctly if the first soldier in the line has the maximum height and the last soldier has the minimum height. Please note that the way other solders are positioned does not matter, including the case when there are several soldiers whose height is maximum or minimum. Only the heights of the first and the last soldier are important.

For example, the general considers the sequence of heights (4, 3, 4, 2, 1, 1) correct and the sequence (4, 3, 1, 2, 2) wrong.

Within one second the colonel can swap any two neighboring soldiers. Help him count the minimum time needed to form a line-up which the general will consider correct.

Input
The first input line contains the only integer n (2 ≤ n ≤ 100) which represents the number of soldiers in the line. The second line contains integers a1, a2, ..., an (1 ≤ ai ≤ 100) the values of the soldiers' heights in the order of soldiers' heights' increasing in the order from the beginning of the line to its end. The numbers are space-separated. Numbers a1, a2, ..., an are not necessarily different.

Output
Print the only integer — the minimum number of seconds the colonel will need to form a line-up the general will like.
 */
/*!SECTION
 * [100, 95, 100, 100, 88]
 * 
 */
import java.util.Scanner;

public class ArraivalOfGeneral {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int min = -1, max = -1, minIndex = -1, maxIndex = -1;
        int swapsNeeded = 0;
        for (int i = 0; i < n; i++) {
            int h = sc.nextInt();
            if (min == -1) {
                min = h;
                minIndex = i;
            }
            if (max == -1) {
                max = h;
                maxIndex = i;
            }
            if (min != -1 && min >= h) {
                min = h;
                minIndex = i;
            }
            if (max != -1 && max < h) {
                max = h;
                maxIndex = i;
            }
        }
        if (minIndex < maxIndex) {
            System.out.println(((n - 1) - minIndex) + (maxIndex - 1));
        } else if (minIndex > maxIndex) {
            System.out.println(maxIndex + ((n - 1) - minIndex));
        } else if (minIndex == maxIndex) {
            System.out.println(0);
        }
        sc.close();
    }
}
