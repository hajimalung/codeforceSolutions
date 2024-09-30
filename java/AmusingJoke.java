/*!SECTION
 * So, the New Year holidays are over. Santa Claus and his colleagues can take a rest and have guests at last. When two "New Year and Christmas Men" meet, thear assistants cut out of cardboard the letters from the guest's name and the host's name in honor of this event. Then the hung the letters above the main entrance. One night, when everyone went to bed, someone took all the letters of our characters' names. Then he may have shuffled the letters and put them in one pile in front of the door.

The next morning it was impossible to find the culprit who had made the disorder. But everybody wondered whether it is possible to restore the names of the host and his guests from the letters lying at the door? That is, we need to verify that there are no extra letters, and that nobody will need to cut more letters.

Help the "New Year and Christmas Men" and their friends to cope with this problem. You are given both inscriptions that hung over the front door the previous night, and a pile of letters that were found at the front door next morning.

Input
The input file consists of three lines: the first line contains the guest's name, the second line contains the name of the residence host and the third line contains letters in a pile that were found at the door in the morning. All lines are not empty and contain only uppercase Latin letters. The length of each line does not exceed 100.

Output
Print "YES" without the quotes, if the letters in the pile could be permuted to make the names of the "New Year and Christmas Men". Otherwise, print "NO" without the quotes.


 */

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class AmusingJoke {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String guestName = sc.nextLine();
        Map<Character, Integer> guestFreq = new HashMap<>();
        countFrequencyOfLetters(guestName, guestFreq);

        String hostName = sc.nextLine();
        Map<Character, Integer> hostFreq = new HashMap<>();
        countFrequencyOfLetters(hostName, hostFreq);

        mergeMapsTo(guestFreq, hostFreq);

        String lettersPile = sc.nextLine();
        Map<Character, Integer> pileFreq = new HashMap<>();
        countFrequencyOfLetters(lettersPile, pileFreq);

        sc.close();

        String output = pileFreq.equals(hostFreq) ? "YES" : "NO";

        System.out.println(output);

    }

    private static void mergeMapsTo(Map<Character, Integer> fromMap, Map<Character, Integer> toMap) {
        for (Map.Entry<Character, Integer> set : fromMap.entrySet()) {
            if (toMap.containsKey(set.getKey())) {
                toMap.put(set.getKey(), toMap.get(set.getKey()) + set.getValue());
            } else {
                toMap.put(set.getKey(), set.getValue());
            }
        }
    }

    private static void countFrequencyOfLetters(String stringToCOunt, Map<Character, Integer> toMapCount) {
        int gNmaeLength = stringToCOunt.length();
        for (int i = 0; i < gNmaeLength; i++) {
            char lett = stringToCOunt.charAt(i);
            if (toMapCount.containsKey(lett)) {
                int c = toMapCount.get(lett);
                toMapCount.put(lett, c + 1);
            } else {
                toMapCount.put(lett, 1);
            }
        }
    }
}
