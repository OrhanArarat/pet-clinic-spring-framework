package com.orhanararat.util;

public class Mappings {

    // == constants ==

    public static final String INDEX = "/";

    private static Mappings ourInstance = new Mappings();

    public static Mappings getInstance() {
        return ourInstance;
    }

    private Mappings() {
    }
}
