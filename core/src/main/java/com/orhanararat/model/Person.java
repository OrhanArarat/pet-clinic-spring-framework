package com.orhanararat.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Person extends BaseEntity{

    // == fields ==
    private String firstName;
    private String lastName;
}
