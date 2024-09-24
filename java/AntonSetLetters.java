
/*!SECTION
 * Recently, Anton has found a set. The set consists of small English letters. Anton carefully wrote out all the letters from the set in one line, separated by a comma. He also added an opening curved bracket at the beginning of the line and a closing curved bracket at the end of the line.

Unfortunately, from time to time Anton would forget writing some letter and write it again. He asks you to count the total number of distinct letters in his set.

Input
The first and the single line contains the set of letters. The length of the line doesn't exceed 1000. It is guaranteed that the line starts from an opening curved bracket and ends with a closing curved bracket. Between them, small English letters are listed, separated by a comma. Each comma is followed by a space.

Output
Print a single number — the number of distinct letters in Anton's set.
 */

/*!SECTION
 * UNSOLVED
 */
import java.util.Scanner;
import java.util.Set;
import java.util.HashSet;

public class AntonSetLetters {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String antonsString = sc.nextLine();
        antonsString = antonsString.replace("{", "").replace("}", "");
        if (antonsString != "") {
            String[] chars = antonsString.split(", ");
            Set<String> charSet = new HashSet<String>();
            for (int i = 0; i < chars.length; i++) {
                charSet.add(chars[i]);
            }
            System.out.println(charSet.size());
        } else
            System.out.println(0);
    }
}
