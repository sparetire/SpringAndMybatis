package com.st;

/**
 * Created by lusir on 16-1-2.
 */
public class Sonnet29 implements Poem {
    private String content = "Hello World!";

    public Sonnet29() {
    }

    @Override
    public void recite() {
        System.out.println(content);
    }
}
