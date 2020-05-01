package com.company;

import java.util.InputMismatchException;

public class Model extends SiemensMob{

    private String model_name;
    private char chip1, chip2;
    private int memory;
    @Override
    public void Info() {
        System.out.println(company + ' ' + model_name);
        System.out.println("_____");
        System.out.print("| ");
        System.out.print(chip1);
        System.out.println(" |");
        System.out.println("| | |");
        System.out.print("| ");
        System.out.print(chip2);
        System.out.println(" |");
        System.out.println("--X--");
        System.out.print("Price: ");
        System.out.println(price);
    }

    public Model(String s, char c1, char c2, int p) {
        model_name = s;
        chip1 = c1;
        chip2 = c2;
        price = p;
    }

    public void Discount(int k) throws NoFreeStuff {
        int p = price - k;
        if (p >= 0) {
            price = p;
        } else {
            throw new NoFreeStuff(1);
        }
    }

}
