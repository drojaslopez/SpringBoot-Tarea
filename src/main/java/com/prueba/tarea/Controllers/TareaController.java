package com.prueba.tarea.Controllers;

import java.util.ArrayList;
import java.util.Optional;

import com.prueba.tarea.Models.TareaModel;
import com.prueba.tarea.Services.TareaService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/tareadb")
public class TareaController {
    @Autowired
    TareaService tareaService;
    //get
    @GetMapping()
    public ArrayList<TareaModel> obtenertareas(){
        return tareaService.obtenerTareas();
    }
    //update
    @PostMapping()
    public TareaModel guardartarea(@RequestBody TareaModel tarea){
        return this.tareaService.guardarTarea(tarea);
    }
    //get a element by id
    @GetMapping( path = "/{id}")
    public Optional<TareaModel> obtenertareaPorId(@PathVariable("id") Long id) {
        return this.tareaService.obtenerPorId(id);
    }

    //delte a element by id
    @DeleteMapping( path = "/{id}")
    public String eliminarPorId(@PathVariable("id") Long id){
        boolean flag = this.tareaService.eliminarTarea(id);
        if (flag){
            return "Se eliminó la tarea con id " + id;
        }else{
            return "No pudo eliminar la tarea con id" + id;
        }
    }
    
}
