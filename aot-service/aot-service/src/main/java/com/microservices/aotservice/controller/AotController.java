package com.microservices.aotservice.controller;

import com.microservices.aotservice.dto.AotDto;
import com.microservices.aotservice.service.AotService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@AllArgsConstructor
@RequestMapping("aot")
public class AotController {

    private AotService aotService;

    @PostMapping("/saveAot")
    public ResponseEntity<AotDto> saveAot(@RequestBody AotDto aotDto){
        return new ResponseEntity<>(aotService.saveAot(aotDto), HttpStatus.CREATED);
    }

    @GetMapping("/getAot/{id}")
    public ResponseEntity<AotDto> getMilitary(@PathVariable int id){
        return new ResponseEntity<>(aotService.getAot(id), HttpStatus.OK);
    }
}
