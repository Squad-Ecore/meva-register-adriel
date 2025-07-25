
package com.meva.finance.api;

import com.meva.finance.api.dto.FamilyCreateDTO;
import com.meva.finance.model.Family;
import com.meva.finance.repository.FamilyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import lombok.extern.slf4j.Slf4j;

import javax.validation.Valid;
import java.util.Optional;


@Slf4j
@RestController
@RequestMapping("/family")
public class Controller {

    // TODO - The id should be inputted on the URL
    // TODO - Save the gender "M" or "F" in the database
    // TODO - Ask if the user will create a new family or link to an existent one

    @Autowired
    private FamilyRepository familyRepository;

    @PostMapping("/{create}")
    public ResponseEntity<String> createFamily(@RequestBody @Valid FamilyCreateDTO familyCreateDTO) {
        try {
            Family newFamily = new Family(familyCreateDTO.getDescription(), familyCreateDTO.getIdFamily());

            if (familyRepository.existsById(familyCreateDTO.getIdFamily()))
                return ResponseEntity.status(409).body("This family already exists");

            familyRepository.save(newFamily);
            log.info("family created successfully");

            return ResponseEntity.ok("Family created");

        } catch (Exception e) {
            log.error("Error while creating a family", e);
            return ResponseEntity.status(500).body("Intern error while creating a family");
        }
    }

    /**
     * Not important now.
     */
    @PutMapping("/{update}")
    public ResponseEntity<String> changeFamily(@RequestBody @Valid FamilyCreateDTO familyCreateDTO) {
        try {
            Optional<Family> optionalFamily = familyRepository.findById(familyCreateDTO.getIdFamily());

            if (!optionalFamily.isPresent()) {
                return ResponseEntity.status(404).body("Family not found");
            }

            Family existingFamily = optionalFamily.get();
            existingFamily.setDescription(familyCreateDTO.getDescription());

            familyRepository.save(existingFamily);

            return ResponseEntity.ok("Family updated");

        } catch (Exception e) {
            log.error("Error while creating a family", e);
            return ResponseEntity.status(500).body("Intern error while creating a family");
        }
    }
}