package com.pranesh;

import com.sun.jndi.toolkit.url.Uri;
import org.json.JSONArray;
import org.json.JSONObject;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URI;
import java.net.URL;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by sai pranesh on 5/22/2017.
 */
public class RoughWorkspace {


    public static String getUrlString(String urlSpec) throws IOException{

        URL url = new URL(urlSpec);
        HttpURLConnection connection = (HttpURLConnection) url.openConnection();

        try{

            ByteArrayOutputStream out = new ByteArrayOutputStream();
            InputStream inputStream = connection.getInputStream();

            if(connection.getResponseCode() != HttpURLConnection.HTTP_OK){
                throw new IOException(connection.getResponseMessage()
                        + ": with " + urlSpec);
            }

            int bytesRead = 0;
            byte[] buffer = new byte[1024];
            while((bytesRead = inputStream.read(buffer))> 0){
                out.write(buffer, 0 , bytesRead);
            }
            out.close();
            return new String(out.toByteArray());
        }finally {
            connection.disconnect();
        }

    }


    public static String getUrlWithQuery(String query) throws IOException {
        URI uri = URI.create("http://restcountries.eu/rest/v1/name/" + query);
        return getUrlString(uri.toString());
    }


    static int getCountries(String str, int p){
        return getCountOfCountries(str,p);
    }


    static int getCountOfCountries(String str, int p){
        int noOfCountries = 0;
        try {
          //  System.out.println(getUrlWithQuery("un"));
            String jsonResult = getUrlWithQuery(str);
            JSONArray jsonArray = new JSONArray(jsonResult);
            for(int i =0; i < jsonArray.length(); i++){
                int threshold = (int)jsonArray.getJSONObject(i).get("population");
                if(threshold > p){
                    noOfCountries++;
                }
            }
            System.out.println(jsonArray.getJSONObject(0).get("name"));
        } catch (IOException e) {
            e.printStackTrace();
        }
        return noOfCountries;
    }

    public static void main(String[] args) {


        String line = "This order -3 was placed for QT3000! OK?";
        String pattern = "\\d";

        // Create a Pattern object
        Pattern r = Pattern.compile(pattern);

        // Now create matcher object.
        Matcher m = r.matcher(line);
        if (m.find( )) {
            System.out.println(m.start() + " start value");
         //   System.out.println("Found value: " + m.group(0) );
        //    System.out.println("Found value: " + m.group(1) );
         //   System.out.println("Found value: " + m.group(2) );
        }else {
            System.out.println("NO MATCH");
        }




        HashMap<Integer, String> hashMap = new HashMap<>();

        URI uri = URI.create("http://restcountries.eu/rest/v1/name/");

        System.out.println(getCountOfCountries("un",100090) + " number of countries");


        Hashtable<Integer, Integer> hashTable = new Hashtable<>();

        JSONObject jsonObject = new JSONObject("{ 'name' : 'pranesh', 'age' : '25'}");

        System.out.println(jsonObject.get("name"));

        Stack testStack = new Stack();

        testStack.push('a');
        testStack.push('b');
        testStack.push('c');
        testStack.push('d');
        testStack.push('e');

        while(!testStack.isEmpty()){
            System.out.print("peek: " + testStack.peek() + " ");
            System.out.print(testStack.pop() + " ");
        }



        /*int[][] multiArray = new int[5][];


        multiArray[0] = new int[5];
        multiArray[1] = new int[5];
        multiArray[2] = new int[5];
        multiArray[3] = new int[5];
        multiArray[4] = new int[5];




        fillArray(multiArray[0]);
        fillArray(multiArray[1]);
        fillArray(multiArray[2]);
        fillArray(multiArray[3]);
        fillArray(multiArray[4]);

        displayMultiArray(multiArray);

        swap(4 ,5 );

        LinkedList<Integer> ll = new LinkedList<>();

        ll.add(1);
        ll.add(4);
        ll.add(94);
        ll.add(123);
        ll.add(23);
        ll.add(2389);
        ll.add(23);
        ll.add(342);


        int firstIndex = 0;
        int secondIndex = ll.size() / 2 ;*/


      /* for( ; firstIndex < ll.size() ; firstIndex ++){
           for( ; secondIndex < ll.size() ; secondIndex ++){
               if(ll.get(firstIndex).equals(ll.get(secondIndex))){
                   System.out.println("duplicate found");
                   return;
               }
           }
       }*/

    }

    enum Direction{
        RIGHT,
        DOWN,
        LEFT,
        TOP
    }

    public ArrayList<Integer> spiralOrder(final List<ArrayList<Integer>> a) {
        ArrayList<Integer> result = new ArrayList<Integer>();

        int top = 0;
        int bottom = a.size();
        int left = 0;
        int right = a.size();

        Direction currentDirection = Direction.RIGHT;

        while(top <= bottom && left <= right){
            if(currentDirection == Direction.RIGHT){
                for(int i = left ;i < right; i++){
                    result.add(a.get(top).get(i));
                    top++;
                    currentDirection = Direction.DOWN;
                }
            }else if(currentDirection == Direction.DOWN){
                for(int i = top; i < bottom; i++ ){
                    result.add(a.get(right-1).get(top));
                    right--;
                    currentDirection = Direction.LEFT;
                }
            }
        }

        // Populate result;
        return result;
    }

    private static void print(String str){
        System.out.println(str);

    }

    private static void swap(int a, int b){

        System.out.println(" original a & b values " + a  + " & " + b);


        System.out.println(" new  a & b values " + a + " &  " + b);
    }

    private static void fillArray(int[] fill){
        for(int i = 0 ; i < fill.length ; i ++){
            fill[i] = (int )(Math.random() * 100 + 1);
            System.out.print(" " + fill[i]);
        }
        System.out.println();
    }

    private static void displayMultiArray(int[][] display){
        System.out.println();
        for(int i = 0 ;i < display.length ; i ++){
            for(int j = 0 ; j < display[i].length; j++ ){
                System.out.print(" " + display[i][j]);
            }
            System.out.println();
        }
        System.out.println();
    }



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





}
