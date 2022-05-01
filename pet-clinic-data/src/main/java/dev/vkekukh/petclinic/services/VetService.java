package dev.vkekukh.petclinic.services;

import dev.vkekukh.petclinic.model.Vet;

import java.util.Set;

public interface VetService {
    Vet findById(Long id);

    Set<Vet> findAll();

    Vet save(Vet pet);
}
