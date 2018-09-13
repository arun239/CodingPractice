package BasicOfImplementation;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;

/**
 * Created by arun on 02/09/18.
 */
public class LittleJhoolandPsychicPowers {

    private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private static PrintWriter printWriter = new PrintWriter(System.out);

    public static void main(String[] args) throws Exception {

        String input = br.readLine();
        String[] arrayString = input.split("");
        int[] number = new int[input.length()];
        String result = "Good luck!";
        int consistentCount = 0;
        for (int i = 0; i < number.length; i++) {
            number[i] = Integer.parseInt(arrayString[i]);
        }

        for (int i = 1; i < number.length; i++) {
            if (number[i] == number[i-1]) {
                consistentCount++;
            } else {
                consistentCount = 0;
            }

            if (consistentCount == 5) {
                result = "Sorry, sorry!";
                break;
            }
        }
        System.out.println(result);
    }
}
