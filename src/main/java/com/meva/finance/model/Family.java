package com.meva.finance.model;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;

/**
 * Represents the colunm "family" inside the database
 */
@Entity
@Table(name = "FAMILY")
public class Family {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_family")
    private Integer id;

    @NotBlank
    private String description;

    public Family(String description) {
        this.description = description;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}