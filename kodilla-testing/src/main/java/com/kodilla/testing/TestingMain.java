package com.kodilla.testing;

import com.kodilla.testing.User.SimpleUser;
import com.kodilla.testing.calculator.Calculator;

public class TestingMain {
    public static void main(String[] args) {
        SimpleUser simpleUser = new SimpleUser("theForumUser");
        Calculator calculator= new Calculator();


    int math = calculator.add(4,5);
    int math2 = calculator.substract(6,7);


    String result = simpleUser.getUsername();

    if(result.equals("theForumUser")){
        System.out.println("Test OK");
        } else {
        System.out.println("Error");
        }
    }




}
