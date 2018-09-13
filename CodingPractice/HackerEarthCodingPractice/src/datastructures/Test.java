package datastructures;

/**
 * Created by arun on 06/12/17.
 */
public class Test {

    public static void main(String[] args) {
        int x, y = 9;

        x = 10;
        if((x-- !=9 || (x--) == 8) && (y++) < x)
            System.out.println(y);
        else
            System.out.println(x);
    }
}
