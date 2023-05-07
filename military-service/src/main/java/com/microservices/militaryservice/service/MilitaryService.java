package com.microservices.militaryservice.service;

import com.microservices.militaryservice.dto.MilitaryDto;

import java.util.List;

public interface MilitaryService {

    MilitaryDto saveMilitary(MilitaryDto militaryDto);

    MilitaryDto getMilitary(String code);

    List<MilitaryDto> getAllMilitary();

}
