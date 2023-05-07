package com.microservices.aotservice.service;

import com.microservices.aotservice.dto.MilitaryDto;
import com.microservices.aotservice.dto.TitanDto;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "TITAN-SERVICE")
public interface TitanAPIClient {

    @GetMapping("/titan/getTitanInheritor/{inheritor}")
    TitanDto getTitanInheritor(@PathVariable("inheritor") String inheritor);

}
