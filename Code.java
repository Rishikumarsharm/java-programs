public class Code {
    public static void main(String[] args) {
        // Variables of different data types
        int num1 = 10;
        double num2 = 5.5;
        char letter = 'A';
        boolean isTrue = true;

        // One-dimensional array
        int[] oneDArray = {1, 2, 3, 4, 5};

        // Two-dimensional array
        int[][] twoDArray = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        // Arithmetic operators
        int sum = num1 + (int) num2;
        double difference = num1 - num2;
        double product = num1 * num2;
        double quotient = num1 / num2;
        int remainder = num1 % 3;

        System.out.println("Sum: " + sum);
        System.out.println("Difference: " + difference);
        System.out.println("Product: " + product);
        System.out.println("Quotient: " + quotient);
        System.out.println("Remainder: " + remainder);

        // Relational operators
        boolean isEqual = num1 == num2;
        boolean isNotEqual = num1 != num2;
        boolean isGreater = num1 > num2;
        boolean isLess = num1 < num2;
        boolean isGreaterOrEqual = num1 >= num2;
        boolean isLessOrEqual = num1 <= num2;

        System.out.println("Is Equal: " + isEqual);
        System.out.println("Is Not Equal: " + isNotEqual);
        System.out.println("Is Greater: " + isGreater);
        System.out.println("Is Less: " + isLess);
        System.out.println("Is Greater or Equal: " + isGreaterOrEqual);
        System.out.println("Is Less or Equal: " + isLessOrEqual);

        // Logical operators
        boolean andOperation = (num1 > 5) && (num2 < 10);
        boolean orOperation = (num1 < 5) || (num2 < 10);
        boolean notOperation = !isTrue;

        System.out.println("AND Operation: " + andOperation);
        System.out.println("OR Operation: " + orOperation);
        System.out.println("NOT Operation: " + notOperation);

        // Ternary operator
        String result = (num1 > num2) ? "num1 is greater" : "num2 is greater or equal";
        System.out.println("Ternary Result: " + result);

        // If-else statement
        if (num1 > num2) {
            System.out.println("num1 is greater than num2");
        } else {
            System.out.println("num2 is greater than or equal to num1");
        }

        // Switch-case statement
        switch (letter) {
            case 'A':
                System.out.println("Letter is A");
                break;
            case 'B':
                System.out.println("Letter is B");
                break;
            default:
                System.out.println("Letter is not A or B");
                break;
        }

        // For loop
        System.out.println("One-dimensional array elements:");
        for (int i = 0; i < oneDArray.length; i++) {
            System.out.println(oneDArray[i]);
        }

        // Enhanced for loop
        System.out.println("Two-dimensional array elements:");
        for (int[] row : twoDArray) {
            for (int element : row) {
                System.out.println(element);
            }
        }

        // While loop
        int counter = 0;
        System.out.println("While loop:");
        while (counter < 3) {
            System.out.println("Counter: " + counter);
            counter++;
        }

        // Do-while loop
        counter = 0;
        System.out.println("Do-while loop:");
        do {
            System.out.println("Counter: " + counter);
            counter++;
        } while (counter < 3);
    }
}
