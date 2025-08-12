package com.meva.finance.api.dto;

/**
 * Used to handle the data sent to create or update a family.
 * The `idFamily` attribute is included only for validation purposes and
 * should be set to 0 when creating a new family.
 */
public class FamilyCreateDTO {

    private Long idFamily;

    private String description;

    public FamilyCreateDTO() {
    }

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