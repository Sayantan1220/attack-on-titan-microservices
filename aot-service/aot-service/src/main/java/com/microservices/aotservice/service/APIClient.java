package com.microservices.aotservice.service;

import com.microservices.aotservice.dto.MilitaryDto;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(url = "http://localhost:8080", value = "MILITARY-SERVICE")
public interface APIClient {

    @GetMapping("/military/getMilitary/{militaryCode}")
    MilitaryDto getMilitary(@PathVariable("militaryCode") String militaryCode);

}
