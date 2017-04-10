package com.pranesh.datastructures.graph;

/**
 * Created by sai pranesh on 10-Apr-17.
 */
public class BFSGraph {

    //number of vertices
    private int nVertices;

    //number of adjacent vertices (Adjacent Matrix)
    private int[][] adjMatrix;

    //vertex list
    private Vertex[] vertexList;

    //Max size of the list and the matrix
    private int MAX_SIZE ;

    //queue to insert and remove the items
    private Queue queue;

    private int v2;

    //Constructor to initialize the values
    BFSGraph(){
        MAX_SIZE = 20;
        queue = new Queue();
        nVertices = 0;

        vertexList = new Vertex[MAX_SIZE];
        adjMatrix = new int[MAX_SIZE][MAX_SIZE];

        for(int i = 0 ; i < MAX_SIZE ; i ++){
            for( int j = 0 ; j < MAX_SIZE ; j ++){
                adjMatrix[i][j] = 0;
            }
        }
    }


    public void addVertex(char label){
        vertexList[nVertices++] = new Vertex(label);
    }

    public void addEdge(int start , int end){
        adjMatrix[start][end] = 1;
        adjMatrix[end][start] = 1;
    }

    public int getUnvisitedAdjVertex(int v){
        for(int j = 0 ; j < MAX_SIZE ; j++){
            if(adjMatrix[v][j] == 1 && !vertexList[j].isWasVisited())
                return j;
        }
        return -1;
    }

    public void bfs(){
        vertexList[0].setWasVisited(true);
        vertexList[0].displayVertex();
        queue.insert(0);

        while( !(queue.isEmpty())){

            int v1 = queue.remove();

            while( ( v2 = getUnvisitedAdjVertex(v1)) != -1 ){
                vertexList[v2].setWasVisited(true);
                vertexList[v2].displayVertex();
                queue.insert(v2);
            }//end internal while
        }//end external while

        for(int j = 0 ; j < nVertices ; j++){
            vertexList[j].setWasVisited(false);
        }
    }
}
