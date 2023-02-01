package com.example.springbootlessonone.dao;

import com.example.springbootlessonone.domain.Tire;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TireRepository extends JpaRepository<Tire, Long> {
}
