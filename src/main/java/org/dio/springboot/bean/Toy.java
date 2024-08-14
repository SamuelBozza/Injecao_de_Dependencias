package org.dio.springboot.bean;

public class Toy {
    private String name;
    private int pieces;

    public Toy(String name, int pieces) {
        this.name = name;
        this.pieces = pieces;
    }

    public String getName() {
        return name;
    }

    public int getPieces() {
        return pieces;
    }

}
