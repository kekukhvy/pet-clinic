package dev.vkekukh.petclinic.repositories;

import dev.vkekukh.petclinic.model.PetType;
import org.springframework.data.repository.CrudRepository;

public interface PetTypeRepository extends CrudRepository<PetType, Long> {


}
