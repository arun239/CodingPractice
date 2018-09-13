package BasicOfImplementation;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;

/**
 * Created by arun on 02/09/18.
 */
public class PrintHackerearth {
    private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private static PrintWriter printWriter = new PrintWriter(System.out);


    public static void main(String args[] ) throws Exception {

        int N = Integer.parseInt(br.readLine());
        String input = br.readLine();
        int[] charLen = new int[26];
        int[] relevantChar = new int[7];

        for(int i = 0; i < input.length(); i++) {
            charLen[input.charAt(i) - 97]++;
        }

        relevantChar[0] = charLen[0];	//a-2
        relevantChar[1] = charLen[2];	//c-1
        relevantChar[2] = charLen[4];	//e-2
        relevantChar[3] = charLen[10];	//k-1
        relevantChar[4] = charLen[7];	//h-2
        relevantChar[5] = charLen[17];	//r-2
        relevantChar[6] = charLen[19];	//t-1

        int min1,min2,min2a,min2b, result;

        if(relevantChar[1] <= relevantChar[3] && relevantChar[1] <= relevantChar[6])
            min1 = relevantChar[1];
        else if(relevantChar[3] <= relevantChar[1] && relevantChar[3] <= relevantChar[6])
            min1 = relevantChar[3];
        else
            min1 = relevantChar[6];

        if(relevantChar[0] <= relevantChar[2])
            min2a = relevantChar[0];
        else
            min2a = relevantChar[2];

        if(relevantChar[4] <= relevantChar[5])
            min2b = relevantChar[4];
        else
            min2b = relevantChar[5];

        if(min2a <= min2b)
            min2 = min2a;
        else
            min2 = min2b;

        if(min1 <= min2/2)
            result = min1;
        else
            result = min2/2;


        printWriter.println(result);
        printWriter.flush();

    }
}

