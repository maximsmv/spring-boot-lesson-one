package com.example.springbootlessonone.service;

import java.util.List;
import com.example.springbootlessonone.domain.Tire;

public interface TireService {
    List<Tire> findAll();
    void save(Tire tire);
    void delete(Tire tire);
    void update(Tire tire);

}
