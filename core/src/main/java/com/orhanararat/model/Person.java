package com.orhanararat.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.MappedSuperclass;

@Getter
@Setter
@MappedSuperclass// Bu annatation i kullanmamizin anlami bu sinifin veritabaninda bulunmayacagi anlamina geliyor.
//Yani bu sinif kalitim vererek baska bir sinif ile veritabanina eklenecegi anlamina geliyor.
public class Person extends BaseEntity{

    // == fields ==

    @Column(name = "first_name")
    private String firstName;

    @Column(name = "last_name")
    private String lastName;
}
