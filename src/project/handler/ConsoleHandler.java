package project.handler;

import project.models.Bet;

import java.util.Scanner;

import static project.db.Storage.bets;

public class ConsoleHandler {

    public static void handler() {

        Scanner scanner = new Scanner(System.in);

        String value;
        String risk;
        char exit;

        do {

            System.out.print("Введіть ставку: ");
            value = scanner.nextLine();
            exit = value.charAt(0);

            if (exit == 'q') {

                System.out.println("Ви ввели q і вийшли з програми");

            } else {

                System.out.print("Введіть ризик: ");
                risk = scanner.nextLine();
                exit = risk.charAt(0);

                if (exit == 'q') {

                    System.out.println("Ви ввели q і вийшли з програми");

                } else {



                    int valueInt = Integer.parseInt(value);
                    double riskDouble = Double.parseDouble(risk);
                    Bet bet = new Bet(valueInt, riskDouble);
                    System.out.println(bet.toString());
                    bets.add(bet);



                    System.out.println("Ви ввели ставку = " + valueInt);
                    System.out.println("Ви ввели ризик = " + riskDouble);
                    System.out.println(bets);
                    System.out.println("==============================");

                }
            }
        } while (exit != 'q');
    }
}
