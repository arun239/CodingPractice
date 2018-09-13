package BasicOfImplementation;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;

/**
 * Created by arun on 02/09/18.
 */
public class MagicalTree {
    private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private static PrintWriter printWriter = new PrintWriter(System.out);

    public static void main(String[] args) throws Exception {

        int N = Integer.parseInt(br.readLine());
        String expression;
        String[] expArray;
        int finalResult = 0;
        while(N-- > 0) {
            int result = 0;
            expression = br.readLine();
            expArray = expression.split("");
            for(int i = 0; i < expArray.length; i++) {
                if(i == 0) {
                    result = Integer.parseInt(expArray[0]);
                } else {
                    if(expArray[i].equals("+")) {
                        result += Integer.parseInt(expArray[i+1]);
                    } else if(expArray[i].equals("-")) {
                        result -= Integer.parseInt(expArray[i+1]);
                    }
                }
            }

            if (finalResult < result) {
                finalResult = result;
            }
        }
        System.out.println(finalResult);
    }
}
