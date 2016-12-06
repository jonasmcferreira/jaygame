package com.jonas.domain;

/**
 * Created by Jonas Ferreira on 06/12/2016.
 */
public class Player {

    private Stats stats;
    private int xCoordinate;
    private int yCoordinate;

    /**
     * Getters / Setters
     */


    public Stats getStats() {
        return stats;
    }

    public void setStats(Stats stats) {
        this.stats = stats;
    }

    public int getxCoordinate() {
        return xCoordinate;
    }

    public void setxCoordinate(int xCoordinate) {
        this.xCoordinate = xCoordinate;
    }

    public int getyCoordinate() {
        return yCoordinate;
    }

    public void setyCoordinate(int yCoordinate) {
        this.yCoordinate = yCoordinate;
    }
}
