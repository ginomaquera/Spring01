/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.spring.jdbc;

import com.spring.jdbc.model.Programa;
import java.sql.ResultSet;
import java.sql.SQLException;
import org.springframework.jdbc.core.RowMapper;

/**
 *
 * @author SABADO-MANHANA
 */
public class ProgramaRowMapper implements RowMapper<Programa> {

    @Override
    public Programa mapRow(ResultSet rs, int i) throws SQLException {
        Programa programa = new Programa();
        programa.setId(rs.getLong(1));
        programa.setNombre(rs.getString(2));
        programa.setDescripcion(rs.getString(3));
        programa.setCodigo(rs.getString(4));
        return programa;
    }

    /*
    public Object mapRow(ResultSet rs, int rowNum) throws SQLException {
        Programa programa = new Programa();
        programa.setId(rs.getLong(1));
        programa.setNombre(rs.getString(2));
        programa.setDescripcion(rs.getString(3));
        programa.setCodigo(rs.getString(4));
        return programa;
    }*/
}
