import java.util.Scanner;

public class cond {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter light color: ");
        String a = scn.next();

        if (a.equalsIgnoreCase("RED")) {
            System.out.println("STOP");
        } else if (a.equalsIgnoreCase("YELLOW")) {
            System.out.println("WAIT");
        } else if (a.equalsIgnoreCase("GREEN")) {
            System.out.println("GO");
        } else {
            System.out.println("The light is broken.");
        }
        scn.close(); // Closing the scanner
    }
}
