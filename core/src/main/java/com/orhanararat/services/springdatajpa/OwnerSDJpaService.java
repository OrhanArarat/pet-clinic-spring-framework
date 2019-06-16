package com.orhanararat.services.springdatajpa;

import com.orhanararat.model.Owner;
import com.orhanararat.repositories.OwnerRepository;
import com.orhanararat.repositories.PetRepository;
import com.orhanararat.repositories.PetTypeRepository;
import com.orhanararat.services.OwnerService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;

@Service
@Profile("springdatajpa")//OwnerService den iki tane sinif kalitim aldigi icin sistemin hangi sinifi kullanmasi
// gerektigini anlamasi icin @Profile annotation i ni kullandik.
public class OwnerSDJpaService implements OwnerService {
    // == fields ==
    private final OwnerRepository ownerRepository;

    private final PetRepository petRepository;

    private final PetTypeRepository petTypeRepository;

    public OwnerSDJpaService(OwnerRepository ownerRepository, PetRepository petRepository,
                             PetTypeRepository petTypeRepository) {

        this.ownerRepository = ownerRepository;
        this.petRepository = petRepository;
        this.petTypeRepository = petTypeRepository;
    }

    @Override
    public Owner findByLastName(String lastName) {
        return ownerRepository.findByLastName(lastName);
    }

    @Override
    public Set<Owner> findAll() {

//        Set<Owner> owners = new HashSet<>();
//
//        Iterator<Owner> iterator = owners.iterator();
//        while(iterator.hasNext()){
//            owners.add(iterator.next());
//        }

        Set<Owner> owners = new HashSet<>();
        ownerRepository.findAll().forEach(owners::add);

        return owners;
    }

    @Override
    public Owner findById(Long id) {
        return ownerRepository.findById(id).orElse(null);
    }

    @Override
    public Owner save(Owner object) {
        return ownerRepository.save(object);
    }

    @Override
    public void delete(Owner object) {
        ownerRepository.delete(object);
    }

    @Override
    public void deleteById(Long id) {
        ownerRepository.deleteById(id);
    }
}
