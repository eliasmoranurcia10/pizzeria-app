package com.example.pizzeria.service;

import com.example.pizzeria.persistence.entity.PizzaEntity;
import lombok.AllArgsConstructor;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class PizzaService {
    private final JdbcTemplate jdbcTemplate;

    public List<PizzaEntity> getAll(){
        return this.jdbcTemplate.query("select * from pizza where available=0", new BeanPropertyRowMapper<>(PizzaEntity.class));
    }
}
