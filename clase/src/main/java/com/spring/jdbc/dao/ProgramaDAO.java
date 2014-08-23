/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.spring.jdbc.dao;

import java.util.List;
import com.spring.jdbc.model.Programa;

/**
 *
 * @author SABADO-MANHANA
 */
public interface ProgramaDAO {
    
    List<Programa> all(); 
    
    Programa find(Long id);
    
    Programa find(String nombre);
    
    void save(Programa programa);
    
    void update(Programa programa);
    
    void delete(Programa programa);
    
}
