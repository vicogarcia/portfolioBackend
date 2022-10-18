/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.portfolioweb.gv.controller;


import com.portfolioweb.gv.dto.dtoHySSkill;
import com.portfolioweb.gv.model.HysSkill;
import com.portfolioweb.gv.security.controller.Mensaje;
import com.portfolioweb.gv.service.HySSkillService;
import java.util.List;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author vicoe
 */

@RestController
@RequestMapping("/hys")
@CrossOrigin(origins = "http://localhost:4200")
public class HySSkillController {
    @Autowired
    HySSkillService hySSkillService;
    
    @GetMapping("/lista")
    public ResponseEntity<List<HysSkill>> list(){
        List<HysSkill> list = hySSkillService.list();
        return new ResponseEntity(list, HttpStatus.OK);
    }
    
    @PostMapping("/create")
    public ResponseEntity<?> create(@RequestBody dtoHySSkill dtohys){
        if(StringUtils.isBlank(dtohys.getNombre()))
            return new ResponseEntity(new Mensaje("El nombre es obligatorio"), HttpStatus.BAD_REQUEST);
        if(hySSkillService.existsByNombreExp(dtohys.getNombre()))
            return new ResponseEntity(new Mensaje("Esa habilidad existe"), HttpStatus.BAD_REQUEST);
        HysSkill hys = new HysSkill(dtohys.getNombre(), dtohys.getPorcentaje());
        hySSkillService.save(hys);
        
        return new ResponseEntity(new Mensaje("Habilidad agregada"), HttpStatus.OK);
    
    }

    @GetMapping("/detail/{id}")
    public ResponseEntity<HysSkill> getById(@PathVariable("id") int id){
        if(!hySSkillService.existsById(id))
            return new ResponseEntity(new Mensaje("no existe"), HttpStatus.NOT_FOUND);
        HysSkill hys = hySSkillService.getOne(id).get();
        return new ResponseEntity(hys, HttpStatus.OK);
    }
    
    @DeleteMapping("/delete/{id}")
    public ResponseEntity<?> delete(@PathVariable("id") int id) {
        if (!hySSkillService.existsById(id)) {
            return new ResponseEntity(new Mensaje("no existe"), HttpStatus.NOT_FOUND);
        }
        hySSkillService.delete(id);
        return new ResponseEntity(new Mensaje("Habilidad eliminada"), HttpStatus.OK);
    }

    
    @PutMapping("/update/{id}")
    public ResponseEntity<?> update(@PathVariable("id") int id, @RequestBody dtoHySSkill dtohys){
        //Validamos si existe el ID
        if(!hySSkillService.existsById(id))
            return new ResponseEntity(new Mensaje("El ID no existe"), HttpStatus.BAD_REQUEST);
        //Compara nombre de habilidades
        if(hySSkillService.existsByNombreExp(dtohys.getNombre()) && hySSkillService.getByNombre(dtohys.getNombre()).get().getId() != id)
            return new ResponseEntity(new Mensaje("Esa habilidad ya existe"), HttpStatus.BAD_REQUEST);
        //No puede estar vacio
        if(StringUtils.isBlank(dtohys.getNombre()))
            return new ResponseEntity(new Mensaje("El nombre es obligatorio"), HttpStatus.BAD_REQUEST);
        
        HysSkill hys = hySSkillService.getOne(id).get();
        hys.setNombre(dtohys.getNombre());
        hys.setPorcentaje(dtohys.getPorcentaje());
        
        hySSkillService.save(hys);
        return new ResponseEntity(new Mensaje("Habilidad actualizada"), HttpStatus.OK);
             
    }
}
