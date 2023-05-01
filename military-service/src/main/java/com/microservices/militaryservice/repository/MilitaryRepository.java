package com.microservices.militaryservice.repository;

import com.microservices.militaryservice.entity.Military;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MilitaryRepository extends JpaRepository<Military, Integer> {

    Military findByMilitaryCode(String Code);

}
