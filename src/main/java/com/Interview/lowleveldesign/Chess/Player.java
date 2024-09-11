package com.Interview.lowleveldesign.Chess;

public class Player {

    private String name;
    private boolean isWhite;

    public Player(String name, boolean isWhite) {
        this.name = name;
        this.isWhite = isWhite;
    }

    public String getName() {
        return name;
    }
}
