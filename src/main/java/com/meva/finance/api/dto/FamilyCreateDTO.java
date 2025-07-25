package com.meva.finance.api.dto;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

/**
 * Used to handle the data sent to create or update a family.
 */
public class FamilyCreateDTO {

    @NotNull(message = "The idFamily is mandatory")
    private Long idFamily;

    @NotBlank(message = "The description is mandatory")
    private String description;

    public FamilyCreateDTO(String description, Long idFamily) {
        this.description = description;
        this.idFamily = idFamily;
    }

    public String getDescription() {
        return description;
    }

    public Long getIdFamily() {
        return idFamily;
    }
}