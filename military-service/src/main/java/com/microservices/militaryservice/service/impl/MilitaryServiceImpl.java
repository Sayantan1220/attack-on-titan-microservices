package com.microservices.militaryservice.service.impl;

import com.microservices.militaryservice.dto.MilitaryDto;
import com.microservices.militaryservice.entity.Military;
import com.microservices.militaryservice.repository.MilitaryRepository;
import com.microservices.militaryservice.service.MilitaryService;
import lombok.AllArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

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
    public MilitaryDto getMilitary(String militaryCode) {
        Military military = militaryRepository.findByMilitaryCode(militaryCode);
        return modelMapper.map(military, MilitaryDto.class);
    }

    @Override
    public List<MilitaryDto> getAllMilitary() {
        List<Military> militaryList= militaryRepository.findAll();
        List<MilitaryDto> militaryDtoList = new ArrayList<>();
        for (Military military : militaryList){
            militaryDtoList.add(modelMapper.map(military, MilitaryDto.class));
        }
        return militaryDtoList;
    }
}
