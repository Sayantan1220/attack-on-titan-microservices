package com.microservices.titanservice.service;

import com.microservices.titanservice.dto.TitanDto;

import java.util.List;

public interface TitanService {
    TitanDto saveTitan(TitanDto titanDto);

    TitanDto getTitan(int id);

    TitanDto getTitanInheritor(String inheritor);

    List<TitanDto> getAllTitans();
}
