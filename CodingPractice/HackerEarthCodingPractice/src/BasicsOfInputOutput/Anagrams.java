package BasicsOfInputOutput;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;

/**
 * Created by arun on 02/09/18.
 */
public class Anagrams {
    private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private static PrintWriter printWriter = new PrintWriter(System.out);


    public static void main(String args[] ) throws Exception {

        int t = Integer.parseInt(br.readLine());
        String a,b;
        int[] p,q;
        int result;

        while(t-- > 0) {
            a = br.readLine();
            b = br.readLine();
            p = new int[128];
            q = new int[128];
            result = 0;

            for(int i = 0; i < a.length(); i++) {

                p[a.charAt(i)]++;

            }

            for(int i = 0; i < b.length(); i++) {
                q[b.charAt(i)]++;
            }

            for(int i = 0; i < 127; i++) {
                result = result + Math.abs(p[i] - q[i]);
            }

            printWriter.println(result);

        }
        printWriter.flush();

    }
}

