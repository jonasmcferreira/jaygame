package com.jonas.domain;

import com.jonas.core.Constants;

import javax.faces.bean.ManagedBean;

/**
 * Created by Jonas Ferreira on 06/12/2016.
 */
@ManagedBean(name = "player", eager = true)
public class Player {

    private String name;

    private int health;
    private int mana;
    private int gold;
    private int level;

    private int xCoordinate;
    private int yCoordinate;


    public Player(String name) {

        this.name = name;
        this.health = Constants.STARTING_HEALTH;
        this.mana  = Constants.STARTING_MANA;
        this.gold = Constants.STARTING_GOLD;
        this.level = 1;
        this.xCoordinate = 0;
        this.yCoordinate = 0;

    }



    /********************
     * Getters / Setters
     ********************/


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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getMana() {
        return mana;
    }

    public void setMana(int mana) {
        this.mana = mana;
    }

    public int getGold() {
        return gold;
    }

    public void setGold(int gold) {
        this.gold = gold;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }
}
