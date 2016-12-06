package com.jonas.domain;

import com.jonas.core.Constants;

import javax.faces.bean.ManagedBean;

/**
 * Created by Jonas Ferreira on 02/12/2016.
 */
@ManagedBean(name = "stats", eager = true)
public class Stats {

    private int health;
    private int mana;
    private int gold;
    private String name;

    public Stats() {
        this.health = Constants.STARTING_HEALTH;
        this.mana = Constants.STARTING_MANA;
        this.gold = Constants.STARTING_GOLD;
    }

    /**
     * Getters / Setters
     */

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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
