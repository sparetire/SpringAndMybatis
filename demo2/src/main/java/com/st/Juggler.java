package com.st;

/**
 * Created by lusir on 16-1-1.
 */
public class Juggler implements Performer {
    private int Bags = 3;

    public Juggler() {
    }

    public Juggler(int beanBags) {
        this.Bags = beanBags;
    }

    public int getBeanBags() {
        return Bags;
    }

    public void setBeanBags(int beanBags) {
        this.Bags = beanBags;
    }

    @Override
    public void perform() throws PerformanceException {
        System.out.println("JUGGING " + Bags + " BEANBAGS");
    }

    public void sayHello() {
        System.out.println("Hello everyone!");
    }

    public void sayGoodBye() {
        System.out.println("GoodBye!");
    }
}
