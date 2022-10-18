/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.portfolioweb.gv.repository;

import com.portfolioweb.gv.model.HysSkill;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author vicoe
 */
@Repository
public interface IHySSkillRepository extends JpaRepository<HysSkill, Integer>{
    public Optional<HysSkill> findByNombre(String nombre);
    public boolean existsByNombre(String nombre);
}
