package com.beemail;

import java.util.ArrayList;
import java.util.List;

public class User {
    private String id;
    private String username;
    private List<Message> inbox = new ArrayList<>();
    private App app;

    public User(String id, String username) {
        this.id = id;
        this.username = username;
    }

    public void addUser(App app) {
        app.addUser(this);
    }


    public void setApp(App app) {
        this.app = app;
    }
}
