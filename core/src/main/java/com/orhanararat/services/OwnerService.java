package com.orhanararat.services;

import com.orhanararat.model.Owner;

public interface OwnerService extends CrudService<Owner, Long> {

    // == methods ==
    Owner findByLastName(String lastName);

//    Owner findById(Long id);
//
//    Owner save(Owner owner);
//
//    Set<Owner> findAll();


}
