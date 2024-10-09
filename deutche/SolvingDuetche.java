package deutche;

import java.util.HashMap;

/*
 * 
 */

import java.util.Scanner;
import java.util.Map;

public class SolvingDuetche {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 29;
        int k = 3;
        int money[] = { 6, 2, 6 };
        System.out.println(solve(n, k, money));
        sc.close();
    }

    public static int solve(int n, int k, int[] money) {
        Map<Integer, Integer> moneyFreq = new HashMap<Integer, Integer>();
        for (int i = 0; i < n; i++) {
            if (moneyFreq.containsKey(money[i])) {
                int c = moneyFreq.get(money[i]);
                moneyFreq.put(money[i], c + 1);
            } else {
                moneyFreq.put(money[i], 1);
            }
        }
        int max = 0, mostrepeatedmoney = 0;
        for (Map.Entry<Integer, Integer> entry : moneyFreq.entrySet()) {
            if (entry.getValue() > max) {
                mostrepeatedmoney = entry.getKey();
                max = entry.getValue();
            }
        }

        return max;
    }
}
