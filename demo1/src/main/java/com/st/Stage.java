package com.st;

/**
 * Created by lusir on 16-1-2.
 */
public class Stage {
    public Stage() {
    }

    public void open() {
        System.out.println("Welcome!");
    }

    private static class StageSingletonHolder {
        static Stage instance = new Stage();
    }

    public static Stage getInstance() {
        return StageSingletonHolder.instance;
    }
}
