package com.orhanararat.util;

public class Mappings {

    // == constants ==

    public static final String INDEX = "/";

    public static final String VETS_INDEX = "vets";

    public static final String OWNERS_INDEX = "owners";

    private static Mappings ourInstance = new Mappings();

    public static Mappings getInstance() {
        return ourInstance;
    }

    private Mappings() {
    }
}
