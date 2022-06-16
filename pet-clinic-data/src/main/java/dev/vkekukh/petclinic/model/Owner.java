package dev.vkekukh.petclinic.model;

import lombok.*;
import lombok.experimental.SuperBuilder;

import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "owners")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@SuperBuilder
@ToString
public class Owner extends Person {

    private String address;
    private String city;
    private String telephone;

    @OneToMany(cascade = javax.persistence.CascadeType.ALL, mappedBy = "owner")
    private Set<Pet> pets = new HashSet<>();


}
