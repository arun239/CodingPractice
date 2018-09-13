package datastructures;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Stack;

/*
8
1 -1 2 3 4 -4 -3 -2
*/

/**
 * Created by arun on 11/02/17.
 */
public class LittleMonkandBalancedParentheses {

    private  static BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
    private static PrintWriter printWriter = new PrintWriter(System.out);

    public static void main(String[] args) throws Exception{
        int N = Integer.parseInt(bufferedReader.readLine());
        String[] input = bufferedReader.readLine().split(" ");

        int a[] = new int[N];
        Stack<Integer> stack = new Stack<Integer>();
        int output = 0,result = 0;

        for (int i = 0; i < N; i++) {
            a[i] = Integer.parseInt(input[i]);
            if (a[i] > 0) {
                stack.push(a[i]);
            } else if (a[i] < 0 && !stack.empty() && Math.abs(a[i]) == Math.abs(stack.peek())) {
                //output = output + stack.size();
                stack.pop();
                output +=2;
            } else  if (a[i] < 0 && !stack.empty() && Math.abs(a[i]) != Math.abs(stack.peek())) {
                stack.clear();
                //result = output;
                //output = 0;
            }


            if (output > result) {
                result = output;
            }

            if (stack.size() == 0) {
                //result = output;
                output = 0;
            }

        }
        printWriter.println(result);
        printWriter.flush();
    }
}
