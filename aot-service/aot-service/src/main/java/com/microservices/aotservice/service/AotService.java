package com.microservices.aotservice.service;

import com.microservices.aotservice.dto.AotDto;

public interface AotService {

    AotDto saveAot(AotDto aotDto);

    AotDto getAot(int id);
}
