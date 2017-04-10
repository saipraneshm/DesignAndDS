package com.pranesh.datastructures;

/**
 * Created by sai pranesh on 09-Apr-17.
 */

public class Main {

    public static void main(String args[]){

       /* Vertex vertex = new Vertex(3);
        vertex.inc();
        Vertex vertex2 = new Vertex(4);
        vertex2.inc();
        Vertex vertex3 = new Vertex(5);
        vertex3.inc();

        System.out.println(Vertex.test);*/

       /* Stack stack = new Stack();
        stack.push(34);
        stack.push(45);
        stack.push(23);
        stack.push(98);
        stack.push(15);
        stack.push(62);

        while(!(stack.isEmpty())){
            stack.peek();
            stack.pop();
           *//* System.out.println("Peeking done!");
            System.out.println(stack.pop());*//*
        }
*/
        DFSGraph dfsGraph = new DFSGraph();
        dfsGraph.addVertex('A');
        dfsGraph.addVertex('B');
        dfsGraph.addVertex('C');
        dfsGraph.addVertex('D');
        dfsGraph.addVertex('E');
        dfsGraph.addVertex('F');


        dfsGraph.addEdge(0,1);
        dfsGraph.addEdge(1,2);
        dfsGraph.addEdge(0,3);
        dfsGraph.addEdge(3,4);
        dfsGraph.addEdge(4,5);

        dfsGraph.dfs();
    }
}
