package com.beemail;

public class App {
    private static App instance;


    //Empty Constructor
   private App () {};


    // Getter
    public static App  getInstance(){
        if (instance == null) {instance = new App();}
        return instance;}




    //Users


}
