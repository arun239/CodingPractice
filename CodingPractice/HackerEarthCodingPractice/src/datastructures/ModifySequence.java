package datastructures;

import com.sun.org.apache.xpath.internal.operations.Bool;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;

/**
 * Created by arun on 15/02/17.
 */
public class ModifySequence {

    private  static BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
    private static PrintWriter printWriter = new PrintWriter(System.out);

    public static void main(String[] args) throws Exception{
        int N = Integer.parseInt(bufferedReader.readLine());
        String[] input = bufferedReader.readLine().split(" ");

        int[] sequence = new int[N];
        String result = "YES";
        Boolean flag = true;

        for (int i = 0; i < N; i++) {
            sequence[i] = Integer.parseInt(input[i]);
        }

        if (N > 1) {
            for (int i = 0; i < N-1; i++) {
                if (sequence[i]  > sequence[i+1]) {
                    sequence[i] -= sequence[i+1];
                    sequence[i+1] = 0;
                    flag = false;
                    result = "NO";
                    break;
                } else if (sequence[i] <= sequence[i+1]) {
                    sequence[i+1] -= sequence[i];
                    sequence[i] = 0;
                }
                /*while (sequence[i] > 0) {
                    sequence[i] -= 1;
                    sequence[i+1] -= 1;
                    if (sequence[i+1] < 0) {
                        flag = false;
                        break;
                    }
                }*/
                /*if (!flag) {
                    result = "NO";
                    break;
                }*/
            }
        }

        for (int i =0; i < N; i++) {
            if (sequence[i] != 0) {
                flag = false;
                result = "NO";
                break;
            }
        }


        if (flag) {
            result = "YES";
        }
        printWriter.println(result);
        printWriter.flush();
    }
}
