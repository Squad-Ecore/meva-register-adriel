package com.meva.finance.service;

import com.meva.finance.api.dto.FamilyCreateDTO;
import com.meva.finance.model.Family;
import com.meva.finance.repository.FamilyRepository;
import com.meva.finance.service.interfaces.ICreateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class FamilyService implements ICreateService<Family, FamilyCreateDTO> {

    @Autowired
    private FamilyRepository familyRepository;

    @Override
    public ResponseEntity<String> createFamily(FamilyCreateDTO familyCreateDTO) {
        try {
            Family newFamily = new Family(familyCreateDTO.getDescription());

            if (familyRepository.existsById(familyCreateDTO.getIdFamily()))
                return ResponseEntity.status(409).body("This family already exists");

            if(familyCreateDTO.getIdFamily() == 0){
                familyRepository.save(newFamily);
                log.info("family created successfully");
            }
            else {
                return ResponseEntity.status(409).body("Please input 0 if you want to create a new family. Number submitted: " +
                        familyCreateDTO.getIdFamily());
            }

            return ResponseEntity.ok("Family created");

        } catch (Exception e) {
            log.error("Error while creating a family", e);
            return ResponseEntity.status(500).body("Intern error while creating a family");
        }
    }
}