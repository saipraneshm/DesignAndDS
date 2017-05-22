package com.pranesh.datastructures.graph;

/**
 * Created by sai pranesh on 10-Apr-17.
 */
public class Topo {
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

    //Sorted array that will print the topological array
    private char[] sortedArray;

    public Topo(){
        stack = new Stack();
        MAX_SIZE= 20;
        sortedArray = new char[MAX_SIZE];
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
    }

    public void addVertex(char label){
        verticesList[nVertices++] = new Vertex(label);
    }

    public void deleteVertex(int delVertex){

        if(delVertex != nVertices - 1){// not the last the vertex
            //deleting the vertex from the vertex list
            for(int j = delVertex ; j < nVertices - 1 ; j ++){
                verticesList[j] = verticesList[j+1];
            }

            //deleting the row from the adjacency matrix
            for(int row = delVertex; row < nVertices- 1; row++ ){
                moveRowUp(row,nVertices);
            }


            for(int col = delVertex; col < nVertices- 1; col++ ){
                moveColumnLeft(col,nVertices-1);
            }
        }
        nVertices--;
    }

    public void moveRowUp(int row, int length){
        for( int col = 0; col < length ; col++){
            adjMatrix[row][col] = adjMatrix[row+1][col];
        }
    }

    public void moveColumnLeft(int column, int length){
        for( int row = 0; row < length ; row++){
            adjMatrix[row][column] = adjMatrix[row][column+1];
        }
    }

    public int noSuccessor(){
        boolean isEdge;
        for( int row = 0 ; row < nVertices ; row ++){
            isEdge = false;
            for( int col = 0 ; col < nVertices ; col++){
                if(adjMatrix[row][col] > 0){
                    isEdge = true;
                    break;
                }
            }
            if(!isEdge){
                return row;
            }
        }
        return -1;
    }


    void topo(){

        int original_vertices = nVertices;
        while(nVertices > 0){
            int currentVertex = noSuccessor();
            if(currentVertex == -1){
                System.out.println("ERROR: the graph has cycles");
                return;
            }

            sortedArray[nVertices-1] = verticesList[currentVertex].getLabel();
            deleteVertex(currentVertex);
        }

        for(int j = 0; j < original_vertices; j++){
            System.out.print(sortedArray[j]);
        }
        System.out.println(" ");
    }
}
