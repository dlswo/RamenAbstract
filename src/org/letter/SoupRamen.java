package org.letter;

import java.sql.SQLOutput;

public class SoupRamen extends Ramen {

    @Override
    public void cook() {
        System.out.println("물이 끓으면 면과 스프를 넣고 4분 30초를 기다리슈.");
    }
}
