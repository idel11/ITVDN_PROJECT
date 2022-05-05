package project.handler;

import project.dao.BetDao;
import project.dao.impl.BetDaoImpl;
import project.models.Bet;
import java.util.Scanner;

public class ConsoleHandler {

    public static BetDao betDao = new BetDaoImpl();

    public static void handler() {

        try (Scanner scanner = new Scanner(System.in)) {

            char exit;

            do {
                System.out.print("Введіть value та risk для вашої ставки: ");
                String betCons = scanner.nextLine();
                exit = betCons.charAt(0);
                String[] s = betCons.split(" ");

                if (exit == 'q') {

                    System.out.println("Ви ввели q і вийшли з програми");

                } else {
                    int valueInt = Integer.parseInt(s[0]);
                    double riskDouble = Double.parseDouble(s[1]);
                    Bet bet = new Bet(valueInt, riskDouble);
                    betDao.add(bet);
                    System.out.println("===================================");
                }

            } while (exit != 'q');

        }

        catch (NumberFormatException e) {
            System.out.println("Ви ввели НЕКОРРЕКТІ дані і програма вийшла по такій помилці: " + e);
        }

        catch (ArrayIndexOutOfBoundsException e1) {
            System.out.println("Ви ввели НЕПОВНІ дані і програма вийшла по такій помилці: " + e1);
        }

    }

}
