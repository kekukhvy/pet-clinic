package dev.vkekukh.petclinic.model;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import java.time.LocalDate;

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
}
