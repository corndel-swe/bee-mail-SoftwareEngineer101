package com.beemail;

import java.util.ArrayList;
import java.util.List;

public class App {
    private static App instance;
    private List<User> users = new ArrayList<>();


    //Empty Constructor
    private App() {
    }


    // Getter
    public static App getInstance() {
        if (instance == null) {
            instance = new App();
        }
        return instance;
    }

    public void addUser(User user){
        users.add(user);
        user.setApp(this);
    }


    //Users


}
