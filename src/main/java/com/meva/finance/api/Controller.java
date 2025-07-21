
package com.meva.finance.api;

import com.meva.finance.api.dto.FamilyCreateDTO;
import com.meva.finance.model.Family;
import com.meva.finance.repository.FamilyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@RestController
@RequestMapping("/family")
public class Controller {

	@Autowired
	private FamilyRepository familyRepository;

	@PostMapping
	public ResponseEntity<String> createFamily(@RequestBody FamilyCreateDTO familyCreateDTO){
		Family newFamily = new Family(familyCreateDTO.getDescription());
		familyRepository.save(newFamily);
		log.info("family created sucessfully");

		return ResponseEntity.ok("Family created");
	}
}