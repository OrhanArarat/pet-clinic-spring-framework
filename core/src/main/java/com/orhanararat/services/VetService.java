package com.orhanararat.services;

import com.orhanararat.model.Vet;
import org.springframework.data.repository.CrudRepository;

import java.util.Set;

public interface VetService extends CrudRepository<Vet, Long> {



//    Vet findById(Long id);
//
//    Vet save(Vet vet);
//
//    Set<Vet> findAll();

}
