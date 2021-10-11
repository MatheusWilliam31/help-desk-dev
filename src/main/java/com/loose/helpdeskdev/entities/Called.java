package com.loose.helpdeskdev.entities;

import com.loose.helpdeskdev.entities.enums.Priority;
import com.loose.helpdeskdev.entities.enums.Status;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;
import java.util.Objects;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Called {

    private Long id;
    private LocalDate dateOpening = LocalDate.now();
    private LocalDate dateClosing;
    private Priority priority;
    private Status status;
    private String title;
    private String comments;

    private Technician technician;
    private Client client;

    public Called(Long id, Priority priority, Status status, String title, String comments, Technician technician, Client client) {
        this.id = id;
        this.priority = priority;
        this.status = status;
        this.title = title;
        this.comments = comments;
        this.technician = technician;
        this.client = client;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Called called = (Called) o;
        return Objects.equals(id, called.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
