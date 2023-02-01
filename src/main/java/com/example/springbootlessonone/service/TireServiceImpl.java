package com.example.springbootlessonone.service;

import com.example.springbootlessonone.dao.TireRepository;
import com.example.springbootlessonone.domain.Tire;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class TireServiceImpl implements TireService{
    @Autowired
    TireRepository tireRepository;
    @Override
    public List<Tire> findAll() {
        return tireRepository.findAll();
    }

    @Override
    public void save(Tire tire) {
        tireRepository.save(tire);
    }

    @Override
    public void delete(Tire tire) {
        tireRepository.delete(tire);
    }

    @Override
    public void update(Tire tire) {
        tireRepository.save(tire);
    }
}
