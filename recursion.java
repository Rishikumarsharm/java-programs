class factorial {
    int fact(int n) {
        int result;
        if (n == 1) {
            return 1;
        }
        result = fact(n - 1) * n;
        return result;
    }

    int factI(int n) {
        int t, result;
        result = 1;
        for (t = 1; t <= n; t++) {
            result *= t;
        }
        return result;
    }
}
public class recursion
{
    public static void main(String[] args)
    {
      factorial f = new factorial();
        System.out.println("Factorial using "+" recursion method");
        System.out.println("Factorial of 3 is: "+f.fact(3));
        System.out.println("Factorial of 4 is: "+f.fact(4));
        System.out.println("Factorial of 5 is: "+f.fact(5));
        System.out.println("Factorial using "+" iterative");
        System.out.println("Factorial of 3 is: "+f.factI(3));
        System.out.println("Factorial of 4 is: "+f.factI(4));
        System.out.println("Factorial of 5 is: "+f.factI(5));
    }
}
