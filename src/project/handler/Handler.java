package project.handler;

import java.util.Scanner;

public class Handler {
    public static void handler() {

        Scanner scanner = new Scanner(System.in);

        String bet;
        String risk;
        char exit;

        do {

            System.out.print("Введіть ставку: ");
            bet = scanner.nextLine();
            exit = bet.charAt(0);

            if (exit == 'q') {

                System.out.println("Ви ввели q і вийшли з програми");

            } else  {

                System.out.print("Введіть ризик: ");
                risk = scanner.nextLine();
                exit = risk.charAt(0);

                if (exit == 'q') {

                    System.out.println("Ви ввели q і вийшли з програми");

                } else {

                    int a = Integer.parseInt(bet);
                    int b = Integer.parseInt(risk);
                    System.out.println("Ви ввели значення = " + a);
                    System.out.println("Ви ввели ризик = " + b);
                    System.out.println("==============================");

                }
            }
        } while (exit != 'q');
    }
}
