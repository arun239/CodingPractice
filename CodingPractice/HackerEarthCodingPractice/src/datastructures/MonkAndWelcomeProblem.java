package datastructures;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;

/**
 * Created by arun on 15/02/17.
 */
public class MonkAndWelcomeProblem {

    private  static BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
    private static PrintWriter printWriter = new PrintWriter(System.out);

    public static void main(String[] args) throws  Exception{
        int N = Integer.parseInt(bufferedReader.readLine());
        String[] inputA = bufferedReader.readLine().split(" ");
        String[] inputB = bufferedReader.readLine().split(" ");

        int A[] = new int[N];
        int B[] = new int[N];
        int C[] = new int[N];

        for(int i = 0; i < N; i++ ) {
            C[i] = Integer.parseInt(inputA[i]) + Integer.parseInt(inputB[i]);
            printWriter.print((i < N-1 ? C[i] + " " : C[i]));
        }
        printWriter.flush();
    }
}
