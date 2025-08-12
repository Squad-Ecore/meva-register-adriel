package com.meva.finance.service.interfaces;

import org.springframework.http.ResponseEntity;

public interface ICreateService <T, CreateDTO, ResponseDTO>{

    public ResponseEntity<String> createFamily(CreateDTO dto);
    public ResponseEntity<String> changeFamily(Long familyId, ResponseDTO dto);
}