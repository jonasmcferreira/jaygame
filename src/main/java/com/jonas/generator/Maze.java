package com.jonas.generator;


import com.jonas.core.Direction;

import java.util.Arrays;
import java.util.Collections;

/**
 * Created by Jonas Ferreira on 06/12/2016.
 */
public class Maze {

    private static int x;
    private static int y;
    private final int[][] maze;

    public Maze(int i){
        System.out.println("Created Maze");
        this.x = i+3;
        this.y = i+3;
        maze = new int[this.x][this.y];
        generateMaze(0,0);
    }

    private void generateMaze(int cx, int cy) {
        Direction[] dirs = Direction.values();
        Collections.shuffle(Arrays.asList(dirs));
        for(Direction dir : dirs){
            int nx = cx + dir.dx;
            int ny = cy + dir.dy;
            if (between(nx, x) && between(ny, y) && (maze[nx][ny] == 0)) {
                maze[cx][cy] |= dir.bit;
                maze[nx][ny] |= dir.opposite.bit;
                generateMaze(nx, ny);
            }
        }
    }

    /**************************************************
     * Private functions
     *************************************************/
    private static boolean between(int v, int upper) {
        return (v >= 0) && (v < upper);
    }

    public boolean canIMove(int x, int y, Direction direction){
        System.out.println("Called method canIMove:[x:"+x+"][y:"+y+"][d:"+direction+"]");

        boolean canMove = false;

        if( x >= maze.length  || y >= maze[0].length){
            System.out.println("coordinates [x: "+x+"][y:"+y+"] are outside the maze");
            return false;
        }

        int cell = maze[x][y];

        if(direction == Direction.N && (cell & 1) != 0) canMove = true;
        if(direction == Direction.S && (cell & 2) != 0) canMove = true;
        if(direction == Direction.E && (cell & 4) != 0) canMove = true;
        if(direction == Direction.W && (cell & 8) != 0) canMove = true;

        return canMove;
    }

    public void display() {

        System.out.println(Arrays.deepToString(maze).replace(", [","\n"));

        for (int i = 0; i < y; i++) {
            // draw the north edge
            for (int j = 0; j < x; j++) {
                System.out.print((maze[j][i] & 1) == 0 ? "+---" : "+   ");
            }
            System.out.println("+");
            // draw the west edge
            for (int j = 0; j < x; j++) {
                System.out.print((maze[j][i] & 8) == 0 ? "|   " : "    ");
            }
            System.out.println("|");
        }
        // draw the bottom line
        for (int j = 0; j < x; j++) {
            System.out.print("+---");
        }
        System.out.println("+");


    }


}
