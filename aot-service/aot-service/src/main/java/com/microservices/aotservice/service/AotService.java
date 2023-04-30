package com.microservices.aotservice.service;

import com.microservices.aotservice.dto.APIResponseDto;
import com.microservices.aotservice.dto.AotDto;

import java.util.List;

public interface AotService {

    AotDto saveAot(AotDto aotDto);

    APIResponseDto getAot(int id);

    List<AotDto> getAllAot();
}
