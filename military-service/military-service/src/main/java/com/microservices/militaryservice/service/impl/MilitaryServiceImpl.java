package com.microservices.militaryservice.service.impl;

import com.microservices.militaryservice.dto.MilitaryDto;
import com.microservices.militaryservice.entity.Military;
import com.microservices.militaryservice.repository.MilitaryRepository;
import com.microservices.militaryservice.service.MilitaryService;
import lombok.AllArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class MilitaryServiceImpl implements MilitaryService {

    private MilitaryRepository militaryRepository;
    private ModelMapper modelMapper;

    @Override
    public MilitaryDto saveMilitary(MilitaryDto militaryDto) {
        Military militaryToBeSaved = modelMapper.map(militaryDto, Military.class);
        Military militarySaved = militaryRepository.save(militaryToBeSaved);
        return modelMapper.map(militarySaved, MilitaryDto.class);
    }

    @Override
    public MilitaryDto getMilitary(int id) {
        Military military = militaryRepository.findById(id).get();
        return modelMapper.map(military, MilitaryDto.class);
    }
}
