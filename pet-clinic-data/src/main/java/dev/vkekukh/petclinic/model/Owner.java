package dev.vkekukh.petclinic.model;

import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "owners")
public class Owner extends Person {

    private String address;
    private String city;
    private String telephone;

    @OneToMany(cascade = javax.persistence.CascadeType.ALL, mappedBy = "owner")
    private Set<Pet> pets = new HashSet<>();

    public Set<Pet> getPets() {
        return pets;
    }

    public Owner setPets(Set<Pet> pets) {
        this.pets = pets;
        return this;
    }

    public String getAddress() {
        return address;
    }

    public Owner setAddress(String address) {
        this.address = address;
        return this;
    }

    public String getCity() {
        return city;
    }

    public Owner setCity(String city) {
        this.city = city;
        return this;
    }

    public String getTelephone() {
        return telephone;
    }

    public Owner setTelephone(String telephone) {
        this.telephone = telephone;
        return this;
    }
}
