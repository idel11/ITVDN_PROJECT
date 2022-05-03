package project.handler;

import project.dao.BetDao;
import project.dao.impl.BetDaoImpl;
import project.models.Bet;

import java.util.Scanner;

import static project.db.Storage.bets;

public class ConsoleHandler {

    private static BetDao betDao = new BetDaoImpl();

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
                    betDao.add(bet);
                   // bets.add(bet);
                    System.out.println("==============================");

                }
            }
        } while (exit != 'q');

        System.out.println(betDao.getAll());

    }
}
