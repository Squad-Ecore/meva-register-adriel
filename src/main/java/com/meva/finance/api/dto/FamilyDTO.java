package com.meva.finance.api.dto;

/**
 * Used to handle the data sent to update a family.
 */
public class FamilyDTO {

    private String description;

    public FamilyDTO() {
    }

    public FamilyDTO(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }
}
