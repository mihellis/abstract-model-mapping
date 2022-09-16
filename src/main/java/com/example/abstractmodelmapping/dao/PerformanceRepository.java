package com.example.abstractmodelmapping.dao;

import com.example.abstractmodelmapping.entity.Circus;
import com.example.abstractmodelmapping.entity.Performance;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PerformanceRepository extends JpaRepository<Performance, Long> {
}
