package com.pranesh.hackerrank;

import com.pranesh.RoughWorkspace;

/**
 * Created by saip92 on 7/2/2017.
 */
public class BracketBalance {

     static class Stack{

        class Node{
            char data;
            Node next;
            Node(char data){
                this.data = data;
            }
        }

        Node top;

        public char peek(){
            return top.data;
        }

        public boolean isEmpty(){
            return (top == null);
        }

        public void push(char c){
            Node newNode = new Node(c);
            newNode.next = top;
            top = newNode;
        }

        public char pop(){
            if(isEmpty()) return '0';
            char temp = top.data;
            top = top.next;
            return temp;
        }
    }

    public static boolean isBalanced(String expression) {
        return checkStack(expression);
    }

    public static boolean checkStack(String expression){
        int index = 0;
        Stack charStack = new Stack();
        while(index < expression.length()){
            char current = expression.charAt(index);
            switch(current){
                case '{':
                case '(':
                case '[': charStack.push(current);
                          break;
                case '}':
                case ')':
                case ']': if(!charStack.isEmpty()){
                    char ch = charStack.pop();
                    if( (current == '}' && ch != '{' ) ||
                            (current == ')' && ch != '(' ) ||
                            (current == ']' && ch != '[' )){
                        return false;
                    }
                }else{
                    return false;
                }
                    break;
                }
            index++;
        }
        return charStack.isEmpty();
    }


    public static void main(String[] args) {
        String expression = "{[()]}";
        String expression2 = "{[(])}";
        String expression3 = "{{[[(())]]}}";

        System.out.println(isBalanced(expression));
        System.out.println(isBalanced(expression2));
        System.out.println(isBalanced(expression3));
    }


}
