package com.orhanararat.services;

import com.orhanararat.model.Owner;
import org.springframework.data.repository.CrudRepository;

import java.util.Set;

public interface OwnerService extends CrudRepository<Owner, Long> {

    // == methods ==
    Owner findByLastName(String lastName);

//    Owner findById(Long id);
//
//    Owner save(Owner owner);
//
//    Set<Owner> findAll();


}
