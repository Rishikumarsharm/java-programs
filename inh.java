import java.util.*;
public class inh {
    public static void main(String[] args) {
        int vl1 = 5;
        int vl2 = 6;
        calc c1 = new calc(vl1, vl2); // Corrected 'cl' to 'c1'
        int vl3 = c1.sum();
        System.out.println("Sum of two values is: " + vl3);
        int vl4 = c1.sub();
        System.out.println("Subtraction of two values is: " + vl4);
    }
}

class calc {
    int a;
    int b;

    calc(int a, int b) {
        this.a = a;
        this.b = b;
    }

    int sum() {
        return a + b; // Removed 'this.a = c;'
    }

    int sub() {
        return a - b;
    }
}
