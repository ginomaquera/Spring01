/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.spring.jdbc;

import org.springframework.jdbc.core.RowMapper;
import com.spring.jdbc.model.Curso;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author SABADO-MANHANA
 */
public class CursoRowMapper implements RowMapper<Curso> {

    public Curso mapRow(ResultSet rs, int i) throws SQLException {
        Curso Curso = new Curso();
        Curso.setId(rs.getInt(1));
        Curso.setNombre(rs.getString(2));
        Curso.setCodigo(rs.getString(3));
        Curso.setFecha_inicio(rs.getDate(4));
        Curso.setId_programa(rs.getInt(5));        
        return Curso;
    }
    
}
