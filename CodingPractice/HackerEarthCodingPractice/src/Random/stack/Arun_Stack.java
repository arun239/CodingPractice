package Random.stack;

import java.util.Stack;

/**
 * Created by arun on 14/09/18.
 */
public class Arun_Stack {

    static final int MAX = 1000;
    int top;
    int a[] = new int[MAX];

    Arun_Stack() {
        top = -1;
    }

    boolean isEmpty()
    {
        return (top < 0);
    }

    boolean push(int n) {
        if (top >= MAX-1) {
            System.out.println("Full Stack - No Push");
            return false;
        } else {
            a[++top] = n;
            return true;
        }

    }

    int pop() {
        if (top == -1) {
            System.out.println("Empty Stack - No Pop");
            return 0;
        } else {
            int removed = a[top--];
            return removed;
        }
    }

    int peek() {
        if (top == -1) {
            System.out.println("Empty Stack - No Peek Present");
            return 0;
        }

        return a[top];
    }



}

class Main
{
    public static void main(String args[])
    {
        Arun_Stack s = new Arun_Stack();
        s.push(10);
        s.push(20);
        s.push(30);
        System.out.println(s.pop() + " Popped from stack");
        if (s.peek() != 0)
            System.out.println(s.peek() + " Peek element from stack");
    }
}
