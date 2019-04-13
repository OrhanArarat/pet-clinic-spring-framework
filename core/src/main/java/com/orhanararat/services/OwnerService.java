package com.orhanararat.services;

import com.orhanararat.model.Owner;

import java.util.Set;

public interface OwnerService {

    // == methods ==
    Owner findByLastName(String lastName);

    Owner findById(Long id);

    Owner save(Owner owner);

    Set<Owner> findAll();



}
