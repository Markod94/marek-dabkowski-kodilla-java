package com.kodilla.testing;

import com.kodilla.testing.User.SimpleUser;

public class TestingMain {
    public static void main(String[] args) {
        SimpleUser simpleUser = new SimpleUser("theForumUser");


    String result = simpleUser.getUsername();

    if(result.equals("theForumUser")){
        System.out.println("Test OK");
        } else {
        System.out.println("Error");
        }
    }
}
