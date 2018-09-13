package BasicsOfInputOutput;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;

/**
 * Created by arun on 25/08/18.
 */
public class Factorial {

    private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private static PrintWriter printWriter = new PrintWriter(System.out);

    public static void main(String[] args) throws Exception{


        String[] input = br.readLine().split(" ");                // Reading input from STDIN
        int N = Integer.parseInt(input[0]);

        int result = 1;

        while (N > 1) {
            result = result * N;
            N--;
        }

        printWriter.println(result);
        printWriter.flush();
    }
}
