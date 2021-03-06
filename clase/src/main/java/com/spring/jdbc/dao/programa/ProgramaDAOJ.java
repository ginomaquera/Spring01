/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.spring.jdbc.dao.programa;

import com.spring.jdbc.ProgramaRowMapper;
import com.spring.jdbc.model.Programa;
import java.util.List;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.support.JdbcDaoSupport;

/**
 *
 * @author SABADO-MANHANA
 */
public class ProgramaDAOJ extends JdbcDaoSupport implements ProgramaDAO {

    public List<Programa> list() {
        String sql = "select * from programa";
        return this.getJdbcTemplate().query(sql, new ProgramaRowMapper());
    }

    public Programa get(Long id) {
        String sql = "select * from programa where id = ?";
        Programa programa = (Programa) this.getJdbcTemplate()
                .queryForObject(sql, new Object[]{id}, new ProgramaRowMapper());
        return programa;
    }
    
    public Programa get(String nombre) {
        String sql = "select * from programa where nombre = ? ";
        Programa programa = (Programa) this.getJdbcTemplate()
                .queryForObject(sql, new Object[]{nombre}, new ProgramaRowMapper());
        return programa;
    }

    public void save(Programa programa) {
        String sql = "insert into programa (nombre, descripcion, codigo) values (?,?,?)";        
        try {
            this.getJdbcTemplate().update(sql, new Object[] {
                programa.getNombre(),
                programa.getDescripcion(),
                programa.getCodigo()
            });
        } catch (Exception e) {
            System.err.println("ERROR: " + e.getMessage());
        }
    }

    public void update(Programa t) {
        String sql = "update Programa set nombre=?, descripcion=? where id=?";
        try {
            this.getJdbcTemplate().update(sql, new Object[]{
                t.getNombre(),
                t.getDescripcion(),
                t.getId()
            });
        } catch (DataAccessException e) {
            System.err.println("ERROR: " + e.getMessage());
        }
    }

    public void delete(Programa programa) {
       this.getJdbcTemplate().update("delete from programa where id=?",
            new Object[]{programa.getId()});
    }

    

    public void delete(Long id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
