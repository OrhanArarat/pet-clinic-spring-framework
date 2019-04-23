package com.orhanararat.util;

public class ViewNames {

    // == constants ==

    public static final String INDEX = "index";

    public static final String VETS_INDEX = "vets/index";

    public static final String OWNERS_INDEX = "owners/index";

    private static ViewNames ourInstance = new ViewNames();

    public static ViewNames getInstance() {
        return ourInstance;
    }

    private ViewNames() {
    }
}
