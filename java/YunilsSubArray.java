/*
 * this solution is unverified
 */
import java.util.Scanner;
public class YunilsSubArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numOfTestcases = sc.nextInt();

        for(int testCaseNumber = 0; testCaseNumber < numOfTestcases; testCaseNumber++ ){

            int arrayLength = sc.nextInt(),
            subArrayLength = sc.nextInt(), 
            queriesLength = sc.nextInt();

            int[] yunilsArray = new int[arrayLength];
            for (int i = 0; i < yunilsArray.length; i++) {
                yunilsArray[i] = sc.nextInt();
            }

            int[] queries = new int[queriesLength * 2];
            for (int i = 0; i < queries.length; i++) {
                queries[i] = sc.nextInt();
            }

            int[] queryResults = solveYunilsSequence(yunilsArray, subArrayLength, queries);
            for (int queryResult : queryResults) {
                System.out.println(queryResult);
            }
        }

        sc.close();

    }
    public static int[] solveYunilsSequence(int[] yunilsArray,int subArrayLength,int[] queries){
        int[] queryResults = new int[ queries.length / 2 ];

        for (int i = 0; i < queryResults.length; i+=2) {
            
            int startIndex = queries[i] - 1;
            int endIndex = queries[i+1] - 1;
            int diff = yunilsArray[startIndex+1] - yunilsArray[startIndex];

            int queryResult = 0;
            for(var j=startIndex+1;j<=endIndex;j++){
                if(yunilsArray[j]-yunilsArray[j-1] != diff){
                    queryResult++;
                    yunilsArray[j] = yunilsArray[j-1] + diff;
                }
            }
            queryResults[i] = queryResult;
        }

        return queryResults;
    }
}
