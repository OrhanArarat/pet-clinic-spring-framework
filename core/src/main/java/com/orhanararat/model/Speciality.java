package com.orhanararat.model;


import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Table;

@Getter
@Setter
@Entity
@Table(name = "specialities")
public class Speciality extends BaseEntity {
    private String description;
}
