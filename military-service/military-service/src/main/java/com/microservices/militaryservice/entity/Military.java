package com.microservices.militaryservice.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "military_divisions")
public class Military {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String militaryName;
    private String militaryDescription;
    private String militaryCode;

}
