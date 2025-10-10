package com.example.pizzeria.service;

import com.example.pizzeria.persistence.entity.PizzaEntity;
import com.example.pizzeria.persistence.repository.PizzaRepository;
import lombok.AllArgsConstructor;
import org.apache.coyote.BadRequestException;
import org.springframework.data.crossstore.ChangeSetPersister;
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

    public List<PizzaEntity> getAvailable() {
        System.out.println(this.pizzaRepository.countByVeganTrue());
        return this.pizzaRepository.findAllByAvailableTrueOrderByPrice();
    }

    public PizzaEntity getByName(String name) {
        return this.pizzaRepository.findAllByAvailableTrueAndNameIgnoreCase(name);
    }

    public List<PizzaEntity> getWith(String ingredient) {
        return this.pizzaRepository.findAllByAvailableTrueAndDescriptionContainingIgnoreCase(ingredient);
    }

    public List<PizzaEntity> getWithOut(String ingredient) {
        return this.pizzaRepository.findAllByAvailableTrueAndDescriptionNotContainingIgnoreCase(ingredient);
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

    public void delete(int idPizza) throws BadRequestException {
        if (!exists(idPizza)) throw new BadRequestException("Error al eliminar, la pizza no se encuentra");
        this.pizzaRepository.deleteById(idPizza);
    }

    public boolean exists(int idPizza) {
        return this.pizzaRepository.existsById(idPizza);
    }
}
