package com.pranesh.datastructures.graph;

/**
 * Created by sai pranesh on 10-Apr-17.
 *
 * Minimum spanning tree usgin DFS
 */
public class MST {
    //number of current vertices
    private int nVertices;
    //a list of vertices
    private Vertex verticesList[];
    //adjacency matrix to keep track of adjacent vertices
    private int[][] adjMatrix;
    //maximum size for the list of vertices
    private int MAX_SIZE;
    //Stack to keep track of the vertices
    private Stack stack;


    public MST(){
        stack = new Stack();
        MAX_SIZE= 20;
        verticesList = new Vertex[MAX_SIZE];
        adjMatrix = new int[MAX_SIZE][MAX_SIZE];
        nVertices = 0;

        for(int i = 0 ; i < MAX_SIZE; i++){
            for(int j = 0 ; j < MAX_SIZE; j++){
                adjMatrix[i][j] = 0;
            }
        }
    }

    public void addEdge(int start, int end){
        adjMatrix[start][end] = 1;
        adjMatrix[end][start] = 1;
    }

    public void addVertex(char label){
        verticesList[nVertices++] = new Vertex(label);
    }

    public int getUniAdjVertex(int v){

        for(int j = 0 ; j < MAX_SIZE ; j++){
            if(adjMatrix[v][j] == 1 && !(verticesList[j].isWasVisited())){
                return j;
            }
        }
        return -1;
    }

    public void mst(){
        verticesList[0].setWasVisited(true);
       // verticesList[0].displayVertex();
        stack.push(0);

        while(!(stack.isEmpty())){
            int currentVertex = stack.peek();
            int v = getUniAdjVertex(currentVertex);

            if( v == -1){
                stack.pop();
            }else{
                verticesList[v].setWasVisited(true);
                verticesList[currentVertex].displayVertex();
                verticesList[v].displayVertex();
                System.out.print(" ");
                stack.push(v);
            }//end else
        }//end while

        for(int j = 0 ; j < nVertices; j++)
            verticesList[j].setWasVisited(false);
    }
}
