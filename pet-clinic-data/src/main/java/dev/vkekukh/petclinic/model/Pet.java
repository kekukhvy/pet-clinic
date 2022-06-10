package dev.vkekukh.petclinic.model;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "pets")
public class Pet extends BaseEntity {

    @ManyToOne
    @JoinColumn(name = "type_id")
    private PetType petType;

    @ManyToOne
    @JoinColumn(name = "owner_id")
    private Owner owner;

    private String name;

    private LocalDate birthDate;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "pet")
    private Set<Visit> visits = new HashSet<>();

    public PetType getPetType() {
        return petType;
    }

    public Pet setPetType(PetType petType) {
        this.petType = petType;
        return this;
    }

    public Owner getOwner() {
        return owner;
    }

    public Pet setOwner(Owner owner) {
        this.owner = owner;
        return this;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public Pet setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
        return this;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Pet{");
        sb.append("petType=").append(petType);
        sb.append(", owner=").append(owner);
        sb.append(", birthDate=").append(birthDate);
        sb.append('}');
        return sb.toString();
    }

    public String getName() {
        return name;
    }

    public Pet setName(String name) {
        this.name = name;
        return this;
    }

    public Set<Visit> getVisits() {
        return visits;
    }

    public void setVisits(Set<Visit> visits) {
        this.visits = visits;
    }
}
