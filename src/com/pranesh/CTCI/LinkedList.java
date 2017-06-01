package com.pranesh.CTCI;

import com.pranesh.datastructures.linkedlist.SimpleLinkedList;

/**
 * Created by sai pranesh on 5/24/2017.
 */
public class LinkedList {
    public static void main(String[] args) {
       /* SimpleLinkedList simpleLinkedList = new SimpleLinkedList();

        simpleLinkedList.addFirst(34);
        simpleLinkedList.addFirst(92);
        simpleLinkedList.addFirst(10);
        simpleLinkedList.addFirst(46);
        simpleLinkedList.addFirst(56);
        simpleLinkedList.addFirst(89);
        simpleLinkedList.addFirst(46);
        simpleLinkedList.addFirst(789);
        simpleLinkedList.addFirst(19);
        simpleLinkedList.addFirst(29);
        simpleLinkedList.addFirst(10);
        simpleLinkedList.addFirst(57);
        simpleLinkedList.addFirst(89);

        simpleLinkedList.displayAllNodes();

        //simpleLinkedList.removeDups2();

        //System.out.println("\n ------ Displaying lists after removing duplicates ------");

        System.out.println("\n Attempting to delete middle node using my code -> " +
                simpleLinkedList.getNthNode(4));
        simpleLinkedList.deleteMiddleNodeCCIT(simpleLinkedList.getNthNode(4));
        simpleLinkedList.displayAllNodes();*/

        SimpleLinkedList partitionList = new SimpleLinkedList();
        partitionList.addFirst(5);
        partitionList.addFirst(10);
        partitionList.addFirst(12);
        partitionList.addFirst(2);
        partitionList.addFirst(1);
        partitionList.addFirst(3);
        partitionList.addFirst(7);
        partitionList.addFirst(20);

        partitionList.displayAllNodes();

        System.out.println(" ");

      //  partitionList
      //         .displayFromNode(partitionList.insertNthNode(partitionList.getHead(),45,2));

       // partitionList
       //         .displayFromNode(partitionList.deleteNthNode(partitionList.getHead(),0));

       // partitionList
      //           .displayFromNode(partitionList.reverseNode(partitionList.getHead()));

        //partitionList.reversePrint(partitionList.getHead());


        SimpleLinkedList compareAList = new SimpleLinkedList();
        SimpleLinkedList compareBList = new SimpleLinkedList();

        compareAList.addFirst(2);
        compareAList.addFirst(10);
        compareAList.addFirst(12);
        compareAList.addFirst(2);
        compareAList.addFirst(1);
        compareAList.addFirst(3);
        compareAList.addFirst(7);
        compareAList.addFirst(21);

        /*compareBList.addFirst(5);
        compareBList.addFirst(10);
        compareBList.addFirst(12);
        compareBList.addFirst(2);
        compareBList.addFirst(1);
        compareBList.addFirst(3);
        compareBList.addFirst(7);
        compareBList.addFirst(21);*/

        compareBList.addFirst(92);
        compareBList.addFirst(32);
        compareBList.addFirst(19);
        compareBList.addFirst(49);
        compareBList.addFirst(55);
        compareBList.addFirst(62);
        compareBList.addFirst(78);
        compareBList.addFirst(3);

       /* int i =partitionList
                .CompareLists(compareAList.getHead(),
                        compareBList.getHead());
        System.out.println(i + " comparision result");*/

        partitionList
                   .displayFromNode(partitionList.mergeLists(compareAList.getHead(),
                compareBList.getHead()));
    }
}
