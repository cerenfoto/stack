package stack;

import java.util.*;

public class StackDemo {

    static void showpush(Stack st, int a) {
        st.push(new Integer(a));
        System.out.println("push(" + a + ")");
        System.out.println("stack: " + st);
    }

    static void showpop(Stack st) {
        System.out.print("pop -> ");
        Integer a = (Integer) st.pop();
        System.out.println(a);
        System.out.println("stack: " + st);
    }

    public static void main(String args[]) {
        Random rnd = new Random();
        Stack st = new Stack();
        int a;
        System.out.println("stack: " + st);
        for (int i = 0; i < 10; i++) {
            a = rnd.nextInt(1000);
            showpush(st, a);
            
        }showpop(st);
    }
}
