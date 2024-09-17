import java.util.Scanner;
class AlternatinSum{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int results[] = new int[t];
        for(int testCase=0;testCase<t;testCase++){
            int n = sc.nextInt();
            int[] numSequence = new int[n];
            for(int num=0;num<n;num++){
                numSequence[num] = sc.nextInt();
            }
            results[testCase] = alternatingSum(numSequence);
        }
        sc.close(); 
        for (int testCaseResult : results) {
            System.out.println(testCaseResult);
        }
    }
    public static int alternatingSum(int[] nums){
        int sum = 0;

        for(int index=0;index<nums.length;index++){
            if(index%2 == 0){
                sum += nums[index];
            }else{
                sum -= nums[index];
            }
        }

        return sum;
    }
}