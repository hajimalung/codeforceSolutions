
/*!SECTION
 *  f(n) = -1+2-3+4.....+((-1)^n * n)
 *  find function value for given n
 */
import java.util.Scanner;
import java.math.BigInteger;

public class CalculatingFunction {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BigInteger n = new BigInteger(sc.nextLine());
        if (n.mod(new BigInteger("2")).equals(new BigInteger("0"))) {
            System.out.println(n.divide(new BigInteger("2")));
        } else {
            System.out
                    .println(new BigInteger("0").subtract(((n.add(new BigInteger("1")).divide(new BigInteger("2"))))));
        }
        sc.close();
    }
}
