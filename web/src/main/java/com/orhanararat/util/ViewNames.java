package com.orhanararat.util;

public class ViewNames {

    // == constants ==

    public static final String INDEX = "index";

    private static ViewNames ourInstance = new ViewNames();

    public static ViewNames getInstance() {
        return ourInstance;
    }

    private ViewNames() {
    }
}
