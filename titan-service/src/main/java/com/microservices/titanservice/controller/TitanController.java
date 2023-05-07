package com.microservices.titanservice.controller;

import com.microservices.titanservice.dto.TitanDto;
import com.microservices.titanservice.service.TitanService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("titan")
public class TitanController {

    private TitanService titanService;

    @PostMapping("/saveTitan")
    public ResponseEntity<TitanDto> saveAot(@RequestBody TitanDto titanDto) {
        return new ResponseEntity<>(titanService.saveTitan(titanDto), HttpStatus.CREATED);
    }

    @GetMapping("/getTitan/{id}")
    public ResponseEntity<TitanDto> getTitan(@PathVariable int id) {
        return new ResponseEntity<>(titanService.getTitan(id), HttpStatus.OK);
    }

    @GetMapping("/getTitans")
    public ResponseEntity<List<TitanDto>> getAllMilitary() {
        return new ResponseEntity<>(titanService.getAllTitans(), HttpStatus.OK);
    }

}

