package com.loose.helpdeskdev.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@AllArgsConstructor
public class Technician extends Person {

    private List<Called> calleds = new ArrayList<>();

    public Technician(Long id, String name, String cpf, String email, String password) {
        super(id, name, cpf, email, password);
    }
}
