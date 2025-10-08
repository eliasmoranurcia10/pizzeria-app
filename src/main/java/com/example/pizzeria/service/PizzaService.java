package com.example.pizzeria.service;

import com.example.pizzeria.persistence.entity.PizzaEntity;
import com.example.pizzeria.persistence.repository.PizzaRepository;
import lombok.AllArgsConstructor;
import org.apache.coyote.BadRequestException;
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

    public PizzaEntity save(PizzaEntity pizza) throws BadRequestException {
        if (pizza.getIdPizza()==null || !exists(pizza.getIdPizza())) {
            return this.pizzaRepository.save(pizza);
        }
        throw new BadRequestException("Error al agregar una nueva pizza");
    }

    public PizzaEntity update(PizzaEntity pizza) throws BadRequestException {
        if (pizza.getIdPizza()!=null && exists(pizza.getIdPizza())) {
            return this.pizzaRepository.save(pizza);
        }
        throw new BadRequestException("Error al actualizar la pizza");
    }

    public boolean exists(int idPizza) {
        return this.pizzaRepository.existsById(idPizza);
    }
}
