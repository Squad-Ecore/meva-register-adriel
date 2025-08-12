
package com.meva.finance.api;

import com.meva.finance.api.dto.FamilyCreateDTO;
import com.meva.finance.api.dto.FamilyDTO;
import com.meva.finance.model.Family;
import com.meva.finance.repository.FamilyRepository;
import com.meva.finance.service.FamilyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import lombok.extern.slf4j.Slf4j;

import javax.validation.Valid;
import java.util.Optional;

@Slf4j
@RestController
@RequestMapping("/family")
public class FamilyController {

    // TODO - The id should be inputted on the URL (PUT endpoint)
    // TODO - Save the gender "M" or "F" in the database
    // TODO - Create the documentation for all classes/methods

    @Autowired
    private FamilyRepository familyRepository;
    @Autowired
    private FamilyService familyService;

    @PostMapping("/{create}")
    public ResponseEntity<String> createFamily(@RequestBody @Valid FamilyCreateDTO familyCreateDTO) {

        return familyService.createFamily(familyCreateDTO);
    }

    @PutMapping("/{id}")
    public ResponseEntity<String> changeFamily(@PathVariable Long id, @RequestBody @Valid FamilyDTO familyDTO) {

        return familyService.changeFamily(id, familyDTO);
    }
}