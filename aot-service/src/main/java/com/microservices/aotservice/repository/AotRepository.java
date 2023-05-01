package com.microservices.aotservice.repository;

import com.microservices.aotservice.entity.Aot;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AotRepository extends JpaRepository<Aot, Integer> {
}
