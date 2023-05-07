package com.microservices.titanservice.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class TitanDto {
    private int id;
    private String titanName;
    private String titanDescription;
    private String inheritor;
}
