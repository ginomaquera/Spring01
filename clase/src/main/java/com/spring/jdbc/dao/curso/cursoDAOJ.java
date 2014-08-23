/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.spring.jdbc.dao.curso;

import com.spring.jdbc.CursoRowMapper;
import com.spring.jdbc.model.Curso;
import java.util.List;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.support.JdbcDaoSupport;

/**
 *
 * @author SABADO-MANHANA
 */
public class cursoDAOJ extends JdbcDaoSupport implements CursoDAO {
    
    public List<Curso> list() {
        String sql = "select * from curso";
        return this.getJdbcTemplate().query(sql, new CursoRowMapper());
    }

    public Curso get(Long id) {
        String sql = "select * from curso where id = ?";
        Curso curso = (Curso) this.getJdbcTemplate()
                .queryForObject(sql, new Object[]{id}, new CursoRowMapper());
        return curso;
    }
    
    public Curso get(String nombre) {
        String sql = "select * from curso where nombre = ? ";
        Curso curso = (Curso) this.getJdbcTemplate()
                .queryForObject(sql, new Object[]{nombre}, new CursoRowMapper());
        return curso;
    }

    public void save(Curso programa) {
        String sql = "insert into Curso (nombre, descripcion, codigo) values (?,?,?)";        
        try {
            this.getJdbcTemplate().update(sql, new Object[] {
                programa.getNombre(),
                
                programa.getCodigo()
            });
        } catch (Exception e) {
            System.err.println("ERROR: " + e.getMessage());
        }
    }

    public void update(Curso t) {
        String sql = "update Programa set nombre=?, descripcion=? where id=?";
        try {
            this.getJdbcTemplate().update(sql, new Object[]{
                t.getNombre(),
                
                t.getId()
            });
        } catch (DataAccessException e) {
            System.err.println("ERROR: " + e.getMessage());
        }
    }

    public void delete(Curso curso) {
       this.getJdbcTemplate().update("delete from programa where id=?",
            new Object[]{curso.getId()});
    }

    public void delete(Long id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
   
}
