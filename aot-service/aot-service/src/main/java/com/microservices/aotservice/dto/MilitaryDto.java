package com.microservices.aotservice.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class MilitaryDto {

    private int id;
    private String militaryName;
    private String militaryDescription;
    private String militaryCode;
}
