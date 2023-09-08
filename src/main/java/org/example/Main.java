package org.example;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Practice01 t1 = new Practice01("Ali","Gerami");
        Practice01 t2 = new Practice01(25,6541739,23);

        int sum = t2.Sum;
        System.out.println("Code = " + sum);

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter name: ");
        String name = scanner.nextLine();

        System.out.print("Enter family: ");
        String family = scanner.nextLine();

        Practice01 t3 = new Practice01(name,family);


    }
}