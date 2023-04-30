package com.microservices.militaryservice.service;

import com.microservices.militaryservice.dto.MilitaryDto;

public interface MilitaryService {

    MilitaryDto saveMilitary(MilitaryDto militaryDto);

    MilitaryDto getMilitary(String code);

}
