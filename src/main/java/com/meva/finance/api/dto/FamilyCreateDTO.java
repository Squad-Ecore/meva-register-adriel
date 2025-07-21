package com.meva.finance.api.dto;

/**
 * Used to handle the description data sent to create a new family.
 */
public class FamilyCreateDTO {

    private String description;

    public FamilyCreateDTO() {}

    public FamilyCreateDTO(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
