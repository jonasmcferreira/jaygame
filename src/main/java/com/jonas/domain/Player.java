package com.jonas.domain;

import com.jonas.core.Constants;
import com.jonas.core.Direction;
import com.jonas.generator.Maze;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;



/**
 * Created by Jonas Ferreira on 06/12/2016.
 */
@ManagedBean(name = "player")
@SessionScoped
public class Player {

    private static final Logger log = LogManager.getLogger(Player.class);

    private String name;

    private int health;
    private int mana;
    private int gold;
    private int level;

    private int xCoordinate;
    private int yCoordinate;

    private Maze maze;

    private int[][] visited;

    public Player() {
        log.debug("Called Player constructor");

        this.health = Constants.STARTING_HEALTH;
        this.mana  = Constants.STARTING_MANA;
        this.gold = Constants.STARTING_GOLD;
        this.level = 1;
        this.xCoordinate = Constants.STARTING_X_COORDINATE;
        this.yCoordinate = Constants.STARTING_Y_COORDINATE;
        this.maze = new Maze(this.level);
    }



    public String move(Direction d){
        log.debug("Called method move:[d:"+d+"]");

        if(maze.canIMove(xCoordinate,yCoordinate,d)){
            switch (d) {
                case N:
                    yCoordinate--;
                    break;
                case E:
                    xCoordinate++;
                    break;
                case S:
                    yCoordinate++;
                    break;
                case W:
                    xCoordinate--;
                    break;
                default: log.warn("unknown [direction:"+d+"]");
                    break;
            }
        }

        log.info("New coordinate [xCoordinate:"+xCoordinate+"][yCoordinate:"+yCoordinate+"]");

        if(xCoordinate == level+3 && yCoordinate == level+3){
            return "levelUp";
        } else {
            return "quest";
        }


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
