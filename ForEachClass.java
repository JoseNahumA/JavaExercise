package org.example;

public class ForEachClass {
    public static void main(String[] args) {

        int[] numbers ={1,2,3,4,5,6,7,8,9,10};
        for (int number: numbers){
            System.out.println(number);
        };

        String[] users = {"Carlos","Alex","Maria","Juan"};
        for (String user : users){
             if (user == "Juan"){
                 System.out.println("Hey " + user);
             }

            System.out.println(user);
        }

    }
}
