import java.util.*;
public class switch1 {
    public static void main(String[] args)
    {   //Days
        Scanner scn=new Scanner(System.in);
        System.out.println("enter a number");
        int a = scn.nextInt();
        switch (a) {
            case 1:
                System.out.println("SUNDAY: "+a);
                break;
            case 2:
                System.out.println("MONDAY: " + a);
                break;
            case 3:
                System.out.println("TUESDAY: " + a);
                break;
            case 4:
                System.out.println("WEDNESDAY: " + a);
                break;
            case 5:
                System.out.println("THURSDAY: " + a);
                break;
            case 6:
                System.out.println("FRIDAY: " + a);
                break;
            case 7:
                System.out.println("SATURDAY: " + a);
                break;
            default:
                System.out.println("NOT A DAY: " + a);
        }
    }
}
