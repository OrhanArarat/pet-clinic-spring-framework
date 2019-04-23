package com.orhanararat.util;

public class Mappings {

    // == constants ==

    public static final String INDEX = "/";

    public static final String VETS_INDEX = "vets";

    private static Mappings ourInstance = new Mappings();

    public static Mappings getInstance() {
        return ourInstance;
    }

    private Mappings() {
    }
}
