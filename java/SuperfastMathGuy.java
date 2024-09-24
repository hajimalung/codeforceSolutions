
/*!SECTION
 * UNSOLVED
 */
import java.util.Scanner;

public class SuperfastMathGuy {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String a = sc.nextLine();
        String b = sc.nextLine();

        String binString = Integer.toBinaryString(Integer.parseInt(a, 2) ^ Integer.parseInt(b, 2));
        while (binString.length() < a.length()) {
            binString = "0" + binString;
        }
        System.out.println(binString);

        sc.close();

    }
}
