import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int r1;
        int r2;
        int r3;
        int result;

        System.out.print("Программа позволяте узнать вместе ли 2 летающие тарелки в поле Джона ");

        Scanner scanner = new Scanner(System.in);

        r1 = scanner.nextInt();
        r2 = scanner.nextInt();
        r3 = scanner.nextInt();

        if (r1 >= r2 + r3)
            System.out.println("Yes");
        else
            System.out.println("No");


    }
}