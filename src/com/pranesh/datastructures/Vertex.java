package com.pranesh.datastructures;

/**
 * Created by sai pranesh on 09-Apr-17.
 */
public class Vertex {

    private char label;
    private boolean wasVisited;

    Vertex(char label){
        this.label = label;
        wasVisited = false;
    }

    public char getLabel() {
        return label;
    }

    public void setLabel(char label) {
        this.label = label;
    }

    public boolean isWasVisited() {
        return wasVisited;
    }

    public void setWasVisited(boolean wasVisited) {
        this.wasVisited = wasVisited;
    }

    public void displayVertex(){
        System.out.print(label);
    }
}
