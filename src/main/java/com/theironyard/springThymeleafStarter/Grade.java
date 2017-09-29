package com.theironyard.springThymeleafStarter;

public enum Grade {
    First("First"),
    Second("Second"),
    Third("Third"),
    Fourth("Fourth"),
    Fifth("Fifth"),
    Sixth("Sixth"),
    Seventh("Seventh"),
    Eighth("Eighth"),
    Ninth("Ninth"),
    Tenth("Tenth"),
    Eleventh("Eleventh"),
    Twelfth("Twelfth");


    private final String displayName;

    Grade(String displayName) {
        this.displayName = displayName;
    }

    public String getDisplayName() {
        return displayName;
    }


}
