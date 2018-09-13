package sorting.bubblesort;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;

/**
 * Created by arun on 25/02/17.
 */
public class TheBestPlayer {

    private  static BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
    private static PrintWriter printWriter = new PrintWriter(System.out);

    public static void main(String[] args) throws Exception {
        String[] input = bufferedReader.readLine().split(" ");
        int N = Integer.parseInt(input[0]);
        int T = Integer.parseInt(input[1]);
        String[] fanDetails;
        String [] fanNames = new String[N];
        int[] fanQuotient = new int[N];

        for (int i = 0; i < N; i++){
            fanDetails = bufferedReader.readLine().split(" ");
            fanNames[i] = fanDetails[0];
            fanQuotient[i] = Integer.parseInt(fanDetails[1]);
        }

        for (int i = 0; i < N - 1; i++) {
            for (int j = 0; j < N - i - 1; j++) {
                int temp;
                String tempStr;
                if (fanQuotient[i] > fanQuotient[i+1]) {
                    temp = fanQuotient[i];
                    fanQuotient[i] = fanQuotient[i+1];
                    fanQuotient[i+1] = temp;

                    tempStr = fanNames[i];
                    fanNames[i] = fanNames[i+1];
                    fanNames[i+1] = tempStr;
                }
            }
        }

        
    }
}
