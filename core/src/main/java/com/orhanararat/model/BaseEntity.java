package com.orhanararat.model;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@Getter
@Setter
public class BaseEntity implements Serializable {

    // == fields ==
    private Long id;

    public boolean isNew() {
        return this.id == null;
    }
}
