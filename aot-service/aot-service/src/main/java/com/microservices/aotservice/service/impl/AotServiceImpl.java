package com.microservices.aotservice.service.impl;

import com.microservices.aotservice.dto.AotDto;
import com.microservices.aotservice.entity.Aot;
import com.microservices.aotservice.repository.AotRepository;
import com.microservices.aotservice.service.AotService;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

@Getter
@Setter
@AllArgsConstructor
@Service
public class AotServiceImpl implements AotService {

    private AotRepository aotRepository;
    private ModelMapper modelMapper;

    @Override
    public AotDto saveAot(AotDto aotDto) {
        Aot toBeSavedAot = modelMapper.map(aotDto, Aot.class);
        Aot savedAot = aotRepository.save(toBeSavedAot);
        return modelMapper.map(savedAot, AotDto.class);
    }

    @Override
    public AotDto getAot(int id) {
        Aot getAot = aotRepository.findById(id).get();
        return modelMapper.map(getAot, AotDto.class);
    }
}
