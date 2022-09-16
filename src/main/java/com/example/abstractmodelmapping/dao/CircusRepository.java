package com.example.abstractmodelmapping.dao;

import com.example.abstractmodelmapping.entity.Circus;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CircusRepository extends JpaRepository<Circus, Long> {
}
