import java.util.*;

class Students {
    int reg;
    String name;
    int[] marks = new int[3];
    int total;

    public Students(int reg, String name, int[] marks) {
        this.reg = reg;
        this.name = name;
        this.marks = marks;
        this.total = cal();
    }

    private int cal() {
        return marks[0] + marks[1] + marks[2];
    }

    public void display() {
        System.out.println("Reg No: " + reg);
        System.out.println("Name: " + name);
        System.out.println("Marks: " + Arrays.toString(marks));
        System.out.println("Total marks: " + total);
        System.out.println(); // For better readability
    }
}

