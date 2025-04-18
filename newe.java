import java.util.*;

public class newe {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter a string");
        String st = sc.next();
        char[] charArray = st.toCharArray(); // Convert String to char array
        int str = charArray.length;
        int j;

        for (int i = 0; i < str; i++) { // Corrected loop condition
            if (charArray[i] == 'a' || charArray[i] == 'e' || charArray[i] == 'i' || charArray[i] == 'o'
                    || charArray[i] == 'u') {
              j =   charArray[i];
              charArray[i]= charArray[i + 1];
              charArray[i+1] = j;
            }
            str--;
        }

        for (int i = 0; i < str; i++) {
            System.out.print(charArray[i]); // Print without newline for continuous output
        }
        System.out.println(); // Add a newline at the end

        sc.close();
    }
}