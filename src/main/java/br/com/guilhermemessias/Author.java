package br.com.guilhermemessias;

import java.time.LocalDate;
import java.util.UUID;

public class Author {
    private UUID id;
    private String name;
    private LocalDate birthDate;

    public Author(String name, LocalDate birthDate) {
        this.id = java.util.UUID.randomUUID();
        this.name = name;
        this.birthDate = birthDate;
    }

    public UUID getId() {
        return id;
    }

    private void setId(UUID id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }
}
