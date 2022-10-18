/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.portfolioweb.gv.service;

import com.portfolioweb.gv.model.Proyecto;
import com.portfolioweb.gv.repository.IProyectoRepository;
import java.util.List;
import java.util.Optional;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author vicoe
 */
@Service
@Transactional
public class ProyectoService {
    @Autowired
    IProyectoRepository iProyectoRepository;
    
public List<Proyecto> list(){
        return iProyectoRepository.findAll();
    }
    
    public Optional<Proyecto> getOne(int id){
        return iProyectoRepository.findById(id);
    }
    
    public Optional<Proyecto> getByNombrePro(String nombrePro){
        return iProyectoRepository.findByNombrePro(nombrePro);
    }
    
    public void save(Proyecto proy){
        iProyectoRepository.save(proy);
    }
    
    public void delete(int id){
        iProyectoRepository.deleteById(id);
    }
    
    public boolean existsById(int id){
        return iProyectoRepository.existsById(id);
    }
    
    public boolean existsByNombrePro(String nombrePro){
        return iProyectoRepository.existsByNombrePro(nombrePro);
    }
    
}
