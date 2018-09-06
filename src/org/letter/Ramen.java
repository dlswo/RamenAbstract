package org.letter;

public abstract class Ramen {

    public void bolingWater() {
        System.out.println("물끓이기");

    }

    public abstract void cook();

    public void dish() {
        System.out.println("접시에 담기");
    }
}
