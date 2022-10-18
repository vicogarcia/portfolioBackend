/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.portfolioweb.gv.service;

import com.portfolioweb.gv.model.Experiencia;
import com.portfolioweb.gv.repository.IExperienciaRepository;
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
public class ExperienciaService {
    @Autowired
    IExperienciaRepository iExperienciaRepository;
    
    public List<Experiencia> list(){
        return iExperienciaRepository.findAll();
    }
    
    public Optional<Experiencia> getOne(int id){
        return iExperienciaRepository.findById(id);
    }
    
    public Optional<Experiencia> getByNombreExp(String nombreExp){
        return iExperienciaRepository.findByNombreExp(nombreExp);
    }
    
    public void save(Experiencia expe){
        iExperienciaRepository.save(expe);
    }
    
    public void delete(int id){
        iExperienciaRepository.deleteById(id);
    }
    
    public boolean existsById(int id){
        return iExperienciaRepository.existsById(id);
    }
    
    public boolean existsByNombreExp(String nombreExp){
        return iExperienciaRepository.existsByNombreExp(nombreExp);
    }
    
}
