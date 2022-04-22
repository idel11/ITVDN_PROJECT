package project.handler;

import java.io.IOException;
import java.util.Scanner;

public class Handler {
    public static void handler() {

        Scanner scanner = new Scanner(System.in);
        String insertedDigit = "";
        char exit = ' ';
        do {
            System.out.print("Введіть число: ");
            insertedDigit = scanner.nextLine().toString();
            exit = insertedDigit.charAt(0);
            if (exit == 'q') {
                System.out.println("Ви ввели q і вийшли з програми");
            } else  {
                int a = Integer.parseInt(String.valueOf(insertedDigit));
                System.out.println("Ми ввели a = " + a);
            }
        } while (exit != 'q');
    }
}
