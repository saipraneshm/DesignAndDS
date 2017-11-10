package com.pranesh.leetcode;

import java.util.LinkedList;
import java.util.List;
import java.util.Stack;


public class StringNormalization {
    public String normalizePath(String path){
        int i = 0;
        Stack<String> stack = new Stack<>();

        while(i < path.length()){
            if(path.charAt(i) == '/'){
                i++;
            }else{
                StringBuilder sb = new StringBuilder();
                while(i < path.length() && path.charAt(i) != '/'){
                    sb.append(path.charAt(i));
                    i++;
                }
                if(sb.toString().equals("..")){
                    if(!stack.isEmpty()){
                        stack.pop();
                    }
                }else if(sb.toString().equals(".")){

                }else{
                    stack.push(sb.toString());
                }
            }
        }

        StringBuilder result = new StringBuilder();
        LinkedList<String> straightPath = new LinkedList<>();
        while(!stack.isEmpty()){
            straightPath.addFirst(stack.pop());
        }

        if(straightPath.size()== 0){
            result.append("/");
        }else{
            for(String s : straightPath){
                result.append("/");
                result.append(s);
            }
        }

        return result.toString();
    }


    public static void main(String[] args) {
        StringNormalization s  = new StringNormalization();
        System.out.println(s.normalizePath("////"));

        List<Double> check = new LinkedList<>();

    }




}
