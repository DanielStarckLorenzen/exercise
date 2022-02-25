package demo;

import java.util.Scanner;

public class Main {

    Scanner in = new Scanner(System.in);

    void greet() {
        System.out.print("Enter name: ");
        String name = in.nextLine();
        System.out.println("Hello " + name);
    }

    public static void main(String[] args) {
        System.out.println("It works!");

        new Main().greet();

    }
}
