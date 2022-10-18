/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.portfolioweb.gv.repository;

import com.portfolioweb.gv.model.Proyecto;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author vicoe
 */
@Repository
public interface IProyectoRepository extends JpaRepository<Proyecto, Integer> {
    public Optional<Proyecto> findByNombrePro(String nombrePro);
    public boolean existsByNombrePro(String nombrePro);
}
