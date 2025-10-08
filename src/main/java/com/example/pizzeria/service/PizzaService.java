package com.example.pizzeria.service;

import com.example.pizzeria.persistence.entity.PizzaEntity;
import com.example.pizzeria.persistence.repository.PizzaRepository;
import lombok.AllArgsConstructor;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class PizzaService {
    private final PizzaRepository pizzaRepository;

    public List<PizzaEntity> getAll(){
        return this.pizzaRepository.findAll();
    }

    public PizzaEntity get(Integer idPizza) {
        return this.pizzaRepository.findById(idPizza).orElse(null);
    }
}
