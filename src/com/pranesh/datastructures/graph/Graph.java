package com.pranesh.datastructures.graph;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by sai pranesh on 09-Apr-17.
 */

public class Graph {

    public static void main(String args[]){


        List<List<Integer>> test = new ArrayList<>();
        List<Integer> testList = new ArrayList<>();
        testList.add(4);
        testList.add(5);
        test.add(0,testList);
        testList.add(6);
       // test.add(0,testList);
        testList.add(7);
        testList.add(9);
        testList.add(3);


       // test.set(0,testList);
        for(List<Integer> intList : test){
            for(Integer i : intList){
                System.out.print(i);
            }
            System.out.println(" ");
        }

        LinkedList<Integer> intLi = new LinkedList<>();
        intLi.addLast(5);
        intLi.addLast(6);
        System.out.println(" ");

        for(Integer i : intLi){
            System.out.print(i);
        }

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
       /* DFSGraph dfsGraph = new DFSGraph();
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

        System.out.println("");

        BFSGraph bfsGraph = new BFSGraph();
        bfsGraph.addVertex('A');
        bfsGraph.addVertex('B');
        bfsGraph.addVertex('C');
        bfsGraph.addVertex('D');
        bfsGraph.addVertex('E');
        bfsGraph.addVertex('F');


        bfsGraph.addEdge(0,1);
        bfsGraph.addEdge(1,2);
        bfsGraph.addEdge(0,3);
        bfsGraph.addEdge(3,4);
        bfsGraph.addEdge(4,5);

        bfsGraph.bfs();

        System.out.println(" ");

        MST mst = new MST();
        mst.addVertex('A');
        mst.addVertex('B');
        mst.addVertex('C');
        mst.addVertex('D');
        mst.addVertex('E');
        mst.addVertex('F');


        mst.addEdge(0,1);
        mst.addEdge(1,2);
        mst.addEdge(0,3);
        mst.addEdge(3,4);
        mst.addEdge(4,5);

        mst.mst();

        System.out.println(" ");

        Topo theGraph = new Topo();
        theGraph.addVertex('A'); // 0
        theGraph.addVertex('B'); // 1
        theGraph.addVertex('C'); // 2
        theGraph.addVertex('D'); // 3
        theGraph.addVertex('E'); // 4
        theGraph.addVertex('F'); // 5
   
        theGraph.addVertex('G'); // 6
        theGraph.addVertex('H'); // 7
        theGraph.addEdge(0, 3); // AD
        theGraph.addEdge(0, 4); // AE
        theGraph.addEdge(1, 4); // BE
        theGraph.addEdge(2, 5); // CF
        theGraph.addEdge(3, 6); // DG
        theGraph.addEdge(4, 6); // EG
        theGraph.addEdge(5, 7); // FH
        theGraph.addEdge(6, 7); // GH
        theGraph.topo(); // do the sort*/
    }
}
