package dev.vkekukh.petclinic.repositories;

import dev.vkekukh.petclinic.model.Pet;
import org.springframework.data.repository.CrudRepository;

public interface PetRepository extends CrudRepository<Pet, Long> {

}
