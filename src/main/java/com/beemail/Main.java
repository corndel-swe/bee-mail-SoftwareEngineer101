package com.beemail;

public class Main {


    public static void main(String[] args) {
        App app = App.getInstance();

        User sender = new User("123", "Tania");
        sender.addUser(app);

        User recipient  = new User("456", "Charlie");
        recipient.addUser(app);

    }
}