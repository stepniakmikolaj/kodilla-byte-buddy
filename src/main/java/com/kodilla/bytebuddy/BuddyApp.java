package com.kodilla.bytebuddy;

public class BuddyApp {
    public static void main(String[] args) throws Exception {
        User user = new User();
        for (int i = 0 ; i <=10; i++) {
            user.doSomething();
        }
    }
}
