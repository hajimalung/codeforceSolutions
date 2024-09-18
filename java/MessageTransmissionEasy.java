/*
At the Berland State University, the local network between servers does not always operate without errors. When transmitting two identical messages consecutively, an error may occur, resulting in the two messages merging into one. In this merging, the end of the first message coincides with the beginning of the second. Of course, the merging can only occur at identical characters. The length of the merging must be a positive number less than the length of the message text.

For example, when transmitting two messages "abrakadabra" consecutively, it is possible that it will be transmitted with the described type of error, resulting in a message like "abrakadabrabrakadabra" or "abrakadabrakadabra' (in the first case, the merging occurred at one character, and in the second case, at four).

Given the received message t, determine if it is possible that this is the result of an error of the described type in the operation of the local network, and if so, determine a possible value of s.

A situation where two messages completely overlap each other should not be considered an error. For example, if the received message is "abcd", it should be considered that there is no error in it. Similarly, simply appending one message after another is not a sign of an error. For instance, if the received message is "abcabc", it should also be considered that there is no error in it.

Input
The input consists of a single non-empty string t, consisting of lowercase letters of the Latin alphabet. The length of the string t does not exceed 100 characters.

Output
If the message t cannot contain an error, output "NO" (without quotes) in a single line of output.

Otherwise, in the first line, output "YES" (without quotes), and in the next line, output the string s — a possible message that could have led to the error. If there are multiple possible answers, any of them is acceptable

I/P : abrakadabrabrakadabra
O/P : YES
abrakadabra


acacacaca
YES
acaca

abcabc
NO


 * 
 */

import java.util.Scanner;

public class MessageTransmissionEasy {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String erroredMessage = sc.nextLine();
        int overlapedLength  = erroredMessage.length();
        int startpoint = overlapedLength%2==0 ? ((overlapedLength/2) - 1) : (overlapedLength/2);
        for(int i= startpoint;i>0;i--){
            String overLappedString = erroredMessage.substring(i);
            String prefString = erroredMessage.substring(0,i);
            if(overLappedString.startsWith(prefString)){
                System.out.println("YES");
                System.out.println(overLappedString);
                return;
            }
        }
        System.out.println("NO");
    }
}
