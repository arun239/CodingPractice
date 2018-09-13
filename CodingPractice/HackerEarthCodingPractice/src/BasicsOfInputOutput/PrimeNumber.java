package BasicsOfInputOutput;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;

/**
 * Created by arun on 19/03/18.
 */
public class PrimeNumber {

    private  static BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
    private static PrintWriter printWriter = new PrintWriter(System.out);

    public static void main(String[] args) throws Exception{
        String[] input = bufferedReader.readLine().split(" ");
        int N = Integer.parseInt(input[0]);
        int[] nonPrime = new int[N];
        int k=0;

        for (int i=2; i<=N; i++) {
            nonPrime[k++] = i;
        }

    }
}
