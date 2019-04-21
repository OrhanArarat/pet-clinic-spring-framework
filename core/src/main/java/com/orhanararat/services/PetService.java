package com.orhanararat.services;

import com.orhanararat.model.Pet;
import org.springframework.data.repository.CrudRepository;

import java.util.Set;

public interface PetService extends CrudRepository<Pet, Long> {

//    Pet findById(Long id);
//
//    Pet save(Pet pet);
//
//    Set<Pet> findAll();

}
