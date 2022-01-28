package com.prueba.tarea.Services;

import java.util.ArrayList;
import java.util.Optional;

import com.prueba.tarea.Models.TareaModel;
import com.prueba.tarea.Repositories.TareaRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TareaService {
    @Autowired
    TareaRepository tareaRepository;
    
    public ArrayList<TareaModel> obtenerTareas(){
        return (ArrayList<TareaModel>) tareaRepository.findAll();
    }

    public TareaModel guardarTarea(TareaModel tarea){
        return tareaRepository.save(tarea);
    }

    public Optional<TareaModel> obtenerPorId(Long id){
        return tareaRepository.findById(id);
    }

    public boolean eliminarTarea(Long id) {
        try{
            tareaRepository.deleteById(id);
            return true;
        }catch(Exception err){
            return false;
        }
    }


}
