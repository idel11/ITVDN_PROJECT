package project;

import project.handler.ConsoleHandler;

import static project.db.Storage.bets;

public class Main {
    public static void main(String[] args) {
        ConsoleHandler.handler();
        System.out.println(bets);
    }
}
