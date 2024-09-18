/*
 * You are playing your favorite rhythm game, osu!mania. The layout of your beatmap consists of 𝑛
 rows and 4
 columns. Because notes at the bottom are closer, you will process the bottommost row first and the topmost row last. Each row will contain exactly one note, represented as a '#'.

For each note 1,2,…,𝑛
, in the order of processing, output the column in which the note appears.

Input
The first line contains 𝑡
 (1≤𝑡≤100
) — the number of test cases.

For each test case, the first line contains 𝑛
 (1≤𝑛≤500
) — the number of rows of the beatmap.

The following 𝑛
 lines contain 4
 characters. The 𝑖
-th line represents the 𝑖
-th row of the beatmap from the top. It is guaranteed that the characters are either '.' or '#', and exactly one of the characters is '#'.

It is guaranteed that the sum of 𝑛
 over all test cases does not exceed 500
.

Output
For each test case, output 𝑛
 integers on a new line, the column that the 𝑖
-th note appears in for all 𝑖
 from 1
 to 𝑛
example input : 4

3
4
#...
.#..
..#.
...#
2
.#..
.#..
1
...#

output :
4 3 2 1 
2 2 
4 
 */

import java.util.Scanner;

public class OsuMania {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int t = sc.nextInt();
    String[] results = new String[t];
    for (int i = 0; i < t; i++) {
        int n = sc.nextInt();
        sc.nextLine();
        String resultOfTestcase = "";
        for (int j = 0; j < n; j++) {
            String notesInColumn = sc.nextLine();
            int indexOfHash = notesInColumn.indexOf('#');
            resultOfTestcase += " "+(indexOfHash+1);
        }
        results[i] = resultOfTestcase;
    }
    for (String result : results) {
        System.out.println(new StringBuffer(result).reverse());
    }
  }  
}
