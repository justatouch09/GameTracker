package com.company;

import java.util.ArrayList;

/**
 * Created by jaradtouchberry on 4/25/17.
 */
public class User {
    String name;
    ArrayList<Game> games = new ArrayList<>();

    public User(String name) {
        this.name = name;
    }
}
