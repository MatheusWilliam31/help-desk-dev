package com.loose.helpdeskdev.entities.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.Objects;

@Getter
@NoArgsConstructor
@AllArgsConstructor
public enum Status {

    OPEN("Open", 1), PROGRESS("Progress" , 2), CLOSED("Closed", 3);

    private String description;
    private int code;

    public static Status toEnum(Integer cod) {
        if (Objects.nonNull(cod)) {
            for (Status x : Status.values()) {
                if (cod.equals(x.getCode())) {
                    return x;
                }
            }
        }
        throw new IllegalArgumentException("Invalid Status!");
    }
}
