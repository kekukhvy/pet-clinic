package dev.vkekukh.petclinic.services.jpa;

import dev.vkekukh.petclinic.model.Pet;
import dev.vkekukh.petclinic.repositories.PetRepository;
import dev.vkekukh.petclinic.services.PetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;

@Service
@Profile("jpa")
public class PetJpaService implements PetService {

    private PetRepository repository;

    @Autowired
    public void setRepository(PetRepository repository) {
        this.repository = repository;
    }

    @Override
    public Set<Pet> findAll() {
        Set<Pet> pets = new HashSet<>();
        repository.findAll().forEach(pets::add);
        return pets;
    }

    @Override
    public Pet findById(Long aLong) {
        return this.repository.findById(aLong).orElse(null);
    }

    @Override
    public Pet save(Pet object) {
        return this.repository.save(object);
    }

    @Override
    public void delete(Pet object) {
        this.repository.delete(object);
    }

    @Override
    public void deleteById(Long aLong) {
        this.repository.deleteById(aLong);
    }
}
