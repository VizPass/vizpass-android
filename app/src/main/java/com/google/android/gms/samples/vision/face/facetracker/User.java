package com.google.android.gms.samples.vision.face.facetracker;

/**
 * Created by jonahchin on 2017-12-02.
 */

public class User {
    private String name;
    private String key;
    private boolean inEvent;

    public User(String name, String key, boolean inEvent) {
        this.name = name;
        this.key = key;
        this.inEvent = inEvent;
    }

    public String getName() {
        return name;
    }

    public String getKey() {
        return key;
    }

    public boolean isInEvent() {
        return inEvent;
    }
}
