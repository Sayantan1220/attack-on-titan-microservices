package com.microservices.aotservice.service.impl;

import com.microservices.aotservice.dto.APIResponseDto;
import com.microservices.aotservice.dto.AotDto;
import com.microservices.aotservice.dto.MilitaryDto;
import com.microservices.aotservice.dto.TitanDto;
import com.microservices.aotservice.entity.Aot;
import com.microservices.aotservice.repository.AotRepository;
import com.microservices.aotservice.service.APIClient;
import com.microservices.aotservice.service.AotService;
import com.microservices.aotservice.service.TitanAPIClient;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@Service
public class AotServiceImpl implements AotService {

    private AotRepository aotRepository;
    private ModelMapper modelMapper;
    private APIClient apiClient;
    private TitanAPIClient titanAPIClient;

    @Override
    public AotDto saveAot(AotDto aotDto) {
        Aot toBeSavedAot = modelMapper.map(aotDto, Aot.class);
        Aot savedAot = aotRepository.save(toBeSavedAot);
        return modelMapper.map(savedAot, AotDto.class);
    }

    @Override
    public APIResponseDto getAot(int id) {
        Aot getAot = aotRepository.findById(id).get();
        AotDto aotDto = modelMapper.map(getAot, AotDto.class);
        MilitaryDto militaryDto = apiClient.getMilitary(getAot.getMilitaryCode());
        TitanDto titanDto = titanAPIClient.getTitanInheritor(getAot.getFirstName());
        APIResponseDto apiResponseDto = new APIResponseDto();
        apiResponseDto.setAotDto(aotDto);
        apiResponseDto.setMilitaryDto(militaryDto);
        apiResponseDto.setTitanDto(titanDto);
        return apiResponseDto;
    }

    @Override
    public List<AotDto> getAllAot() {
        List<Aot> aotList= aotRepository.findAll();
        List<AotDto> aotDtoList = new ArrayList<>();
        for (Aot aot : aotList){
            aotDtoList.add(modelMapper.map(aot, AotDto.class));
        }
        return aotDtoList;
    }
}
