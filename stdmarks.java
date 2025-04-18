import java.util.*;

class student {
    Scanner scn=new Scanner(System.in);
    int RegNo,Total=0,subjects;
    String name;
    int marks[];

    {
        System.out.println("Enter registation No. : ");
        RegNo=scn.nextInt();
        System.out.println("enter student name: ");
        name=scn.next();
        getDimarks();
    }
    public void getDimarks() {
        marks = new int[3];
        System.out.println("Enter marks of Hindi: ");
        marks[0] = scn.nextInt();
        System.out.println("Enter marks of English: ");
        marks[1] = scn.nextInt();
        System.out.println("Enter marks of Maths: ");
        marks[2] = scn.nextInt();
        for (int i = 0; i < 3; i++) {
            Total += marks[i];
        }
        System.out.println("Total marks of students " + name + ": " + Total);
    }
}

public class stdmarks
{
    public static void main(String args[]){
        student s[] = new student[5];
        for(int i =0;i<5;i++){
            s[i] = new student();
        }


    }
}