package com.meva.finance.model;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

/**
 * Represents the column "family" inside the database
 */
@Entity
@Table(name = "FAMILY")
public class Family {

    @Id
    @Column(name = "id_family")
    @NotNull(message = "The idFamily is mandatory")
    private Long idFamily;

    @NotBlank(message = "The description is mandatory")
    private String description;

    protected Family() {}

    public Family(String description, Long idFamily) {
        this.description = description;
        this.idFamily = idFamily;
    }

    public Family(String description) {
        this.description = description;
    }

    public Long getId() {
        return idFamily;
    }

    public void setId(Long id) {
        this.idFamily = id;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}