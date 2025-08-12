package com.meva.finance.api.dto;

/**
 * Used to handle the data sent to update a family.
 */
public class FamilyDTO {

    private Long idFamily;

        private String description;

        public FamilyDTO() {
        }

        public FamilyDTO(String description, Long idFamily) {
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
