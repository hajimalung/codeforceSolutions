/*
 * 
 * there is M X N board
 * find howmany 2 X 1 dominos can be places without overlapping and not crossing the board 
 */
import java.util.Scanner;

public class DominoPiling {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();
        System.out.println( (int)((m * n) / 2) );
    }
    
}