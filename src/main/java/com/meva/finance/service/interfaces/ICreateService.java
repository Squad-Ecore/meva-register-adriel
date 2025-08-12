package com.meva.finance.service.interfaces;

import org.springframework.http.ResponseEntity;

public interface ICreateService <T, DTO>{

    public ResponseEntity<String> createFamily(DTO dto);
}