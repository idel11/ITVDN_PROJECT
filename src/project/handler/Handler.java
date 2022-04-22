package project.handler;

import java.util.Scanner;

public class Handler {
    public static void handler(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Введіть число: ");
        int a = sc.nextInt();
        System.out.println("Ми ввели a = " + a);
        sc.close();
    }
}
