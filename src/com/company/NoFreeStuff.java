package com.company;

public class NoFreeStuff extends Exception{

    private final int index;
    public NoFreeStuff(int ind) {
        super("No free stuff here!");
        this.index = ind;
    }
    public int getIndex() {
        return index;
    }

}
