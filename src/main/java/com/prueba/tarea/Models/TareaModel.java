package com.prueba.tarea.Models;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name= "tarea")
public class TareaModel {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique = true, nullable = false)
    private Long id;

    private String nombreTarea;
    private String encargado;
    
    public TareaModel() {
    }
    
    public String getEncargado() {
        return encargado;
    }
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getNombreTarea() {
        return nombreTarea;
    }
    public void setNombreTarea(String nombreTarea) {
        this.nombreTarea = nombreTarea;
    }
    public void setEncargado(String encargado) {
        this.encargado = encargado;
    }



    
}
