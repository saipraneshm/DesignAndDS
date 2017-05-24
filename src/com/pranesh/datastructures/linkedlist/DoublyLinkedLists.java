package com.pranesh.datastructures.linkedlist;

/**
 * Created by sai pranesh on 5/23/2017.
 */
public class DoublyLinkedLists {

    private Link first;
    private Link last;

    DoublyLinkedLists(){
        first = null;
        last = null;
    }

    public boolean isEmpty(){
        return first == null;
    }

   public void insertFirst(int key){
        Link newLink = new Link(key);
        if(isEmpty()){
            last = newLink;
        }else{
            first.previous = newLink;
        }
        newLink.next = first;
        first = newLink;
   }

   public void insertLast(int key){
       Link newLink = new Link(key);
       if( isEmpty()){
           first = newLink;
       }else{
           last.next = newLink;
           newLink.previous = last;
       }
       last = newLink;
   }

   public boolean insertAfter(int key, int value){
       Link current = first;
       while( current.data != key){
           if(current.next == null) return false;
           current = current.next;
       }
       Link newLink = new Link(value);
       if(current == last){
           newLink.next = null;
           last = newLink;
       }else{
           newLink.next = current.next;
           current.next.previous = newLink;
       }
       newLink.previous = current;
       current.next = newLink;
       return true;
   }


   public Link deleteFirst(){
        Link temp = first;
        if(first.next == null){
            last = null;
        }else{
            first.next.previous = null;
        }
        first = first.next;
        return temp;
   }

   public Link deleteLast(){
       Link temp= last;
       if(last.previous == null){
           first = null;
       }else{
           last.previous.next = null;
       }
       last = last.previous;
       return temp;
   }


   //check this implementation later on
   public Link deleteKey(int key){
       Link current = first;
       while( current.data != key){
           if( current.next == null) return null;
           current = current.next;
       }
       if(current == first){
           first = current.next;
       }else{
           current.previous.next =  current.next;
       }

       if(current == last){
           last = current.previous;
       }else{
           current.next.previous = current.previous;
       }
       return current;
   }

    public void displayForward(){
       Link current = first;

        System.out.println("-------- Displaying list from forward --------");
       while(current != null){
           current.displayLink();
           current = current.next;
       }

    }

    public void displayBackward(){
        Link current = last;

        System.out.println("-------- Displaying list from Backward -------");
        while(current != null){
            current.displayLink();
            current = current.previous;
        }

    }

    public void displayFromBothEnds(){
        displayForward();
        displayBackward();
    }
}
