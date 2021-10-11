package com.loose.helpdeskdev.entities.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.Objects;

@Getter
@AllArgsConstructor
@NoArgsConstructor
public enum Priority {

    LOW("Low", 1), MEDIUM("Medium", 2), HIGH("High", 3);

    private String description;
    private int code;

    public static Priority toEnum(Integer cod) {
        if (Objects.nonNull(cod)) {
            for (Priority x : Priority.values()) {
                if (cod.equals(x.getCode())) {
                    return x;
                }
            }
        }
        throw new IllegalArgumentException("Invalid Priority!");
    }
}
