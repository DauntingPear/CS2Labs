import java.util.ArrayList;
import java.util.Scanner;

public class LabProgram {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int input = scan.nextInt();

        System.out.println(input);
    }

    public static void doSomething(AnotherClass foo) {
        Scanner scan = new Scanner(System.in);
        int input = scan.nextInt();

        System.out.println(input);
    }
}

class AnotherClass {
    public void doSomething() {
        LabProgram.doSomething(this);
    }
}
