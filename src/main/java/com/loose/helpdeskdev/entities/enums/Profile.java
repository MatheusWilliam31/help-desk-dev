package com.loose.helpdeskdev.entities.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.Objects;

@Getter
@NoArgsConstructor
@AllArgsConstructor
public enum Profile {

    ADMIN("ROLE_ADMIN", 1), CLIENT("ROLE_CLIENT", 2), TECHNICIAN("CLIENT_TECHNICIAN", 3);

    private String description;
    private Integer code;

    public static Profile toEnum(Integer cod) {
        if (Objects.nonNull(cod)) {
            for (Profile x : Profile.values()) {
                if (cod.equals(x.getCode())) {
                    return x;
                }
            }
        }
        throw new IllegalArgumentException("Invalid Profile!");
    }

}
