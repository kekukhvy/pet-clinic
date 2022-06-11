package dev.vkekukh.petclinic.services.jpa;

import dev.vkekukh.petclinic.model.Speciality;
import dev.vkekukh.petclinic.repositories.SpecialityRepository;
import dev.vkekukh.petclinic.services.SpecialitiesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;

@Profile("jpa")
@Service
public class SpecialitiesJpaService implements SpecialitiesService {

    private SpecialityRepository repository;

    @Autowired
    public void setRepository(SpecialityRepository repository) {
        this.repository = repository;
    }

    @Override
    public Set<Speciality> findAll() {
        Set<Speciality> specialities = new HashSet<>();
        repository.findAll().forEach(specialities::add);
        return null;
    }

    @Override
    public Speciality findById(Long aLong) {
        return repository.findById(aLong).orElse(null);
    }

    @Override
    public Speciality save(Speciality object) {
        return repository.save(object);
    }

    @Override
    public void delete(Speciality object) {
        repository.delete(object);
    }

    @Override
    public void deleteById(Long aLong) {
        repository.deleteById(aLong);
    }
}
