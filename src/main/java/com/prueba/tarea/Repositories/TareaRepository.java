package com.prueba.tarea.Repositories;

import java.util.ArrayList;

import com.prueba.tarea.Models.TareaModel;
import org.springframework.data.repository.CrudRepository;



public interface TareaRepository extends CrudRepository<TareaModel, Long> {
    public abstract ArrayList<TareaModel> findByPrioridad(Integer prioridad);
}
