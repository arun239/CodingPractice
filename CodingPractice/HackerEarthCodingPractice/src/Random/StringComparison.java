package Random;

/**
 * Created by arun on 02/09/18.
 */
public class StringComparison {

    public static void main(String[] args) {
        String s1 = "java";
        String s2 = "java";
        String s3 = "JAVA";
        String s4;

        s2.toUpperCase();
        System.out.println(s2);
        s3.toUpperCase();
        s4 = s2;

        boolean b1 = s1==s2;
        boolean b2 = s1==s3;
        boolean b3 = s2==s4;

        System.out.println(b1);
        System.out.println(" " + b2);
        System.out.println(" " + b3);


        System.out.println(s1.equals(s2));
        System.out.println(s1.equals(s3));
        System.out.println(s2.equals(s4));
    }
}
