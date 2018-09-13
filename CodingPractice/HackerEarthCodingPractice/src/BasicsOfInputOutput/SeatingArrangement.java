package BasicsOfInputOutput;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;

/**
 * Created by arun on 25/08/18.
 */
public class SeatingArrangement {
    private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private static PrintWriter printWriter = new PrintWriter(System.out);

    public static void main(String[] args) throws Exception{

        int T = Integer.parseInt(br.readLine());
        int N, temp, multiplier, oppoSeat = 0;
        int temp2,temp3;
        String seatType = "";

        while(T-- > 0) {
            N = Integer.parseInt(br.readLine());

            temp = 13 - (N % 12);

            multiplier = (N / 12) * 12;

            if(temp == 13) {
                temp = 1;
                multiplier = multiplier - 12;
            }



            oppoSeat = temp + multiplier;

            temp2= oppoSeat/12;
            temp3 = oppoSeat - temp2 * 12;

            if(temp3 == 1 || temp3 == 12 || temp3 == 0 || temp3 == 6 || temp3 == 7) {
                seatType = "WS";
            } else if(temp3 == 2 || temp3 == 11 || temp3 == 5 || temp3 == 8) {
                seatType = "MS";
            } else if(temp3 == 3 || temp3 == 10 || temp3 == 4 || temp3 == 9) {
                seatType = "AS";
            }

            printWriter.print(oppoSeat);
            printWriter.print(" ");
            printWriter.println(seatType);
        }



        printWriter.flush();
    }
}
