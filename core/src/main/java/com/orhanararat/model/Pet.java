package com.orhanararat.model;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
public class Pet  extends BaseEntity{
    // == fields ==
    private PetType petType;
    private Owner owner;
    private LocalDate birhtDate;

}
