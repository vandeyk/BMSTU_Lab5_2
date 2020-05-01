package com.company;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws NoFreeStuff {

	    // write your code here
        Scanner scan = new Scanner(System.in);

        char c1, c2;
        String s = scan.nextLine();
        String cs = scan.nextLine();
        c1 = cs.charAt(0);
        c2 = cs.charAt(1);
        int p = 0;
        try { //Обработка стандартного исключения
            p = scan.nextInt();
        } catch (InputMismatchException e1) {
            System.out.println("Wrong input!");
        }
        if (p == 0) throw new NoFreeStuff(1); //Свое исключение без обработки
        Model me_phone = new Model(s, c1, c2, p);
        me_phone.Info();
        me_phone.Ring();
        System.out.println("Let's decrease the price!");
        int k = scan.nextInt();
        try {
            me_phone.Discount(k); //Метод понижения цены выбрасывает исключение NoFreeStuff
        } catch (NoFreeStuff e2) { //его и обрабатываем
            System.out.println("Hey, buster, no free stuff here!");
        }
        me_phone.Info();

    }
}
