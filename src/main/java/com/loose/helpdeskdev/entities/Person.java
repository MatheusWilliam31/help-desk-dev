package com.loose.helpdeskdev.entities;

import com.loose.helpdeskdev.entities.enums.Profile;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;
import java.util.stream.Collectors;

@Getter
@Setter
@AllArgsConstructor
public abstract class Person {

    protected Long id;
    protected String name;
    protected String cpf;
    protected String email;
    protected String password;
    protected Set<Integer> profiles = new HashSet<>();
    protected LocalDate dateCreating = LocalDate.now();

    public Person() {
        super();
        addProfile(Profile.CLIENT);
    }

    public Person(Long id, String name, String cpf, String email, String password) {
        super();
        this.id = id;
        this.name = name;
        this.cpf = cpf;
        this.email = email;
        this.password = password;
    }

    public Set<Profile> getProfiles() {
        return profiles.stream().map(x -> Profile.toEnum(x)).collect(Collectors.toSet());
    }

    public void addProfile(Profile profile) {
        this.profiles.add(profile.getCode());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return id.equals(person.id) && cpf.equals(person.cpf);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, cpf);
    }
}

