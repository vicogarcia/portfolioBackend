/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.portfolioweb.gv.service;

import com.portfolioweb.gv.model.Educacion;
import com.portfolioweb.gv.repository.IEducacionRepository;
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
public class EducacionService {
    @Autowired
    IEducacionRepository iEducacionRepository;
    
    
    public List<Educacion> list(){
        return iEducacionRepository.findAll();
    }
    
    public Optional<Educacion> getOne(int id){
        return iEducacionRepository.findById(id);
    }
    
    public Optional<Educacion> getByNombreEdu(String nombreEdu){
        return iEducacionRepository.findByNombreEdu(nombreEdu);
    }
    
    public void save(Educacion edu){
        iEducacionRepository.save(edu);
    }
    
    public void delete(int id){
        iEducacionRepository.deleteById(id);
    }
    
    public boolean existsById(int id){
        return iEducacionRepository.existsById(id);
    }
    
    public boolean existsByNombreEdu(String nombreEdu){
        return iEducacionRepository.existsByNombreEdu(nombreEdu);
    }
}
