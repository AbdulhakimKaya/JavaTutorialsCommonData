package com.abdulhakimkaya.finalhomework.webprogramming.service;

import com.abdulhakimkaya.finalhomework.webprogramming.dto.JqueryDto;
import com.abdulhakimkaya.finalhomework.webprogramming.entity.JqueryEntity;

import java.util.List;

public interface IJqueryService {

    // MODEL MAPPER
    public JqueryDto EntityToDto(JqueryEntity jqueryEntity  );
    public JqueryEntity DtoToEntity(JqueryDto jqueryDto);

    // CREATE
    public JqueryDto createRegister(JqueryDto jqueryDto);

    // LIST
    public List<JqueryDto> getAllRegisters();
}
