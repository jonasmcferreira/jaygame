package com.jonas.core;

/**************************************************
 * Created by Jonas Ferreira on 08/12/2016.
 * Enumeration that holds the possible directions
 *************************************************/
public enum Direction {

    N(1, 0, -1), S(2, 0, 1), E(4, 1, 0), W(8, -1, 0);
    public final int bit;
    public final int dx;
    public final int dy;
    public Direction opposite;

    // use the static initializer to resolve forward references
    static {
        N.opposite = S;
        S.opposite = N;
        E.opposite = W;
        W.opposite = E;
    }

    private Direction(int bit, int dx, int dy) {
        this.bit = bit;
        this.dx = dx;
        this.dy = dy;
    }
};
