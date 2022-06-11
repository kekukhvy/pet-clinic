package dev.vkekukh.petclinic.services.jpa;

import dev.vkekukh.petclinic.model.PetType;
import dev.vkekukh.petclinic.repositories.PetTypeRepository;
import dev.vkekukh.petclinic.services.PetTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;

@Service
@Profile("jpa")
public class PetTypeJpaService implements PetTypeService {

    private PetTypeRepository repository;

    @Autowired
    public void setRepository(PetTypeRepository repository) {
        this.repository = repository;
    }

    @Override
    public Set<PetType> findAll() {
        Set<PetType> types = new HashSet<>();
        repository.findAll().forEach(types::add);
        return types;
    }

    @Override
    public PetType findById(Long aLong) {
        return repository.findById(aLong).orElse(null);
    }

    @Override
    public PetType save(PetType object) {
        return this.repository.save(object);
    }

    @Override
    public void delete(PetType object) {
        this.repository.delete(object);
    }

    @Override
    public void deleteById(Long aLong) {
        this.repository.deleteById(aLong);
    }
}
