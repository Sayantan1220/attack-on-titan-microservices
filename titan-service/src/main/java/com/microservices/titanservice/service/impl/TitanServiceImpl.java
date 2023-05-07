package com.microservices.titanservice.service.impl;

import com.microservices.titanservice.dto.TitanDto;
import com.microservices.titanservice.entity.Titan;
import com.microservices.titanservice.repository.TitanRepository;
import com.microservices.titanservice.service.TitanService;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@AllArgsConstructor
@Getter
@Setter
public class TitanServiceImpl implements TitanService {

    private TitanRepository titanRepository;
    private ModelMapper modelMapper;

    @Override
    public TitanDto saveTitan(TitanDto titanDto) {
        Titan toBeSavedTitan = modelMapper.map(titanDto, Titan.class);
        Titan savedTitan = titanRepository.save(toBeSavedTitan);
        return modelMapper.map(savedTitan, TitanDto.class);
    }

    @Override
    public TitanDto getTitan(int id) {
        Titan getTitan = titanRepository.findById(id).get();
        return modelMapper.map(getTitan, TitanDto.class);
    }

    @Override
    public TitanDto getTitanInheritor(String inheritor) {
        Titan getTitan = titanRepository.findByInheritor(inheritor);
        return modelMapper.map(getTitan, TitanDto.class);
    }

    @Override
    public List<TitanDto> getAllTitans() {
        List<Titan> titanList= titanRepository.findAll();
        List<TitanDto> titanDtoList = new ArrayList<>();
        for (Titan titan : titanList){
            titanDtoList.add(modelMapper.map(titan, TitanDto.class));
        }
        return titanDtoList;
    }
}
