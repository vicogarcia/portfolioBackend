/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.portfolioweb.gv.service;

import com.portfolioweb.gv.model.HysSkill;
import com.portfolioweb.gv.repository.IHySSkillRepository;
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
public class HySSkillService {
    @Autowired
    IHySSkillRepository iHySSkillRepository;
    
    public List<HysSkill> list(){
        return iHySSkillRepository.findAll();
    }
    
    public Optional<HysSkill> getOne(int id){
        return iHySSkillRepository.findById(id);
    }
    
    public Optional<HysSkill> getByNombre(String nombre){
        return iHySSkillRepository.findByNombre(nombre);
    }
    
    public void save(HysSkill hys){
        iHySSkillRepository.save(hys);
    }
    
    public void delete(int id){
        iHySSkillRepository.deleteById(id);
    }
    
    public boolean existsById(int id){
        return iHySSkillRepository.existsById(id);
    }
    
    public boolean existsByNombreExp(String nombre){
        return iHySSkillRepository.existsByNombre(nombre);
    }
    
}
