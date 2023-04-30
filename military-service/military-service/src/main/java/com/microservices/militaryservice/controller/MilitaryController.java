package com.microservices.militaryservice.controller;

import com.microservices.militaryservice.dto.MilitaryDto;
import com.microservices.militaryservice.service.MilitaryService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("military")
@AllArgsConstructor
public class MilitaryController {

    private MilitaryService militaryService;

    @PostMapping("/saveMilitary")
    public ResponseEntity<MilitaryDto> saveMilitary(@RequestBody MilitaryDto militaryDto){
        return new ResponseEntity<>(militaryService.saveMilitary(militaryDto), HttpStatus.CREATED);
    }

    @GetMapping("/getMilitary/{id}")
    public ResponseEntity<MilitaryDto> getMilitary(@PathVariable int id){
        return new ResponseEntity<>(militaryService.getMilitary(id), HttpStatus.OK);
    }
}
