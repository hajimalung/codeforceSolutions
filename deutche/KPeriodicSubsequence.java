package deutche;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class KPeriodicSubsequence {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // System.out.print("Enter the value of k: ");
        int k = scanner.nextInt();

        // System.out.print("Enter the string: ");
        String input = scanner.nextLine();

        Set<String> subsequences = new HashSet<>();

        // Generate all subsequences
        generateSubsequences(input, "", 0, subsequences);

        // Display the results
        // System.out.println("Distinct " + k + "-th periodic subsequences:");
        int countKth = 0;
        for (String subsequence : subsequences) {
            // For k = 1, we display all subsequences
            // You can modify this section for k > 1 as needed
            if (subsequence.length() % k == 0 || subsequence.isEmpty()) {
                // System.out.println(subsequence);
                countKth++;
            }
        }

        // System.out.println("Total distinct " + k + "-th periodic subsequences: " +
        // subsequences.size());
        System.out.println(countKth);

        scanner.close();
    }

    // Helper method to generate subsequences
    private static void generateSubsequences(String input, String current, int index, Set<String> subsequences) {
        // Add the current subsequence to the set
        subsequences.add(current);

        // Generate all subsequences by including the next character
        for (int i = index; i < input.length(); i++) {
            generateSubsequences(input, current + input.charAt(i), i + 1, subsequences);
        }
    }
}
