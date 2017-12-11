package com.company;

/**
 * Created by java1 on 2017.12.11..
 */
public class Dog implements IMove, ISleep {
    @Override
    public void doSleep() {
        System.out.println("Dog is running...");
    }

    @Override
    public void doMove() {
        System.out.println("Dasasdasdasda...");


    }
}
