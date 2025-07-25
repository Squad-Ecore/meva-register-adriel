package com.meva.finance.repository;

import com.meva.finance.model.Family;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Contains the CRUD methods
 */
public interface FamilyRepository extends JpaRepository<Family, Long> {

    boolean existsById(Long idFamily);
}