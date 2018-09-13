package sorting.bubblesort;

import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.PrintWriter;

/**
 * Created by arun on 26/02/17.
 */
public class GameOfXor {
    private  static BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
    private static PrintWriter printWriter = new PrintWriter(System.out);

    public static void main(String[] args) throws Exception{
        int T = Integer.parseInt(bufferedReader.readLine().split(" ")[0]);
        int N = Integer.parseInt(bufferedReader.readLine().split(" ")[0]);

        String[] input = bufferedReader.readLine().split(" ");

        int[] array = new int[N];

        for (int i = 0; i < N; i++) {
            array[i] = Integer.parseInt(input[i]);
        }

        //find all subArrays's XOR sum


        //long[] xorSum = new long[Math.pow(2,N) - 1];
        long xorSum = 0,indivisualXorSum = 0;

        for (int i = 0; i < (1 << N); i++) {
            xorSum = xorSum ^ indivisualXorSum;
            indivisualXorSum = 0;
            System.out.print("{ ");
            for (int j = 0; j < N; j++) {
                if ((i & (1 << j)) > 0) {
                    System.out.print(array[j] + " ");
                    indivisualXorSum =  (indivisualXorSum ^ array[j]);
                }

            }
            System.out.println("} ");
        }

        System.out.println(xorSum ^ indivisualXorSum);
    }

}
