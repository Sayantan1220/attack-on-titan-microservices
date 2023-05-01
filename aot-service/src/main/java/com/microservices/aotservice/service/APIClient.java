package com.microservices.aotservice.service;

import com.microservices.aotservice.dto.MilitaryDto;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "MILITARY-SERVICE")
public interface APIClient {

    @GetMapping("/military/getMilitary/{militaryCode}")
    MilitaryDto getMilitary(@PathVariable("militaryCode") String militaryCode);

}
