package com.google.android.gms.samples.vision.face.facetracker;

/**
 * Created by jonahchin on 2017-12-02.
 */

public class User {
    private String first_name;
    private String key;
    private String title;

    public User(String firstName, String key, String title) {
        this.first_name = firstName;
        this.key = key;
        this.title = title;
    }

    public String getFirst_name() {
        return first_name;
    }

    public String getKey() {
        return key;
    }

    public String getTitle() {
        return title;
    }
}
