/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.proyectos.proyectos.repository;


import com.proyectos.proyectos.entity.Proceso;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Carmen
 */@Repository
public interface ProcesoRepository extends JpaRepository<Proceso, Integer>  {
    
}
