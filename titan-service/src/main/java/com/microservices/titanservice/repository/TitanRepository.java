package com.microservices.titanservice.repository;

import com.microservices.titanservice.entity.Titan;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TitanRepository extends JpaRepository<Titan, Integer> {

    Titan findByInheritor(String inheritor);

}
