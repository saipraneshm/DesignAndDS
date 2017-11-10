package com.pranesh.roughWorkspace;

import java.util.LinkedList;

/**
 * Created by saip92 on 7/28/2017.
 */
public class RatInMaze {


    public static boolean isSafe(int row, int col, int n, int[][] sol){
        if(row >= 0 && row < n && col >= 0 && col < n
                && (sol[row][col] == 1)){
            return true;
        }
        return false;
    }

    public static void printMaze(int[][] maze){
        for(int i = 0; i < maze.length; i++){
            for(int j = 0 ; j < maze.length; j++){
                System.out.print(maze[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static int[] xMoves = { 1, 0, -1, 0};
    public static int[] yMoves = { 0, 1, 0, -1};

    public static LinkedList<String> solution = new LinkedList<>();

    public static boolean findRouteInMaze(int row, int col, int[][] maze){
        if(row == maze.length -1 && col == maze.length - 1 ){
            printMaze(maze);
            return true;
        }else{
            for(int i = 0; i < 4; i++){
                int x = row + xMoves[i];
                int y = col + yMoves[i];

                if(isSafe(x,y,maze.length,maze)){
                    maze[x][y] = 9;
                    if(findRouteInMaze(x,y,maze)){
                        //solution.addLast(x+","+y);
                        return true;
                    }else{
                        //solution.removeFirst();
                        maze[x][y] = 1;
                    }
                }


            }
            return false;
        }

    }

    public static void main(String[] args) {

        int[][] maze = new int[][]{{1,0,0,0},
                {1,1,0,1},
                {0,1,0,0},
                {1,1,1,1}};
        maze[0][0] = 9;
        findRouteInMaze(0,0, maze);

    }
}
