/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.spring.orm.dao;

import com.spring.orm.model.Programa;
import java.util.List;
import org.hibernate.Criteria;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;

/**
 *
 * @author SABADO-MANHANA
 */

@Repository("programaDAO")
public class ProgramaDAOH extends BaseHibernateDAO implements ProgramaDAO {

    public List<Programa> list() {
        Criteria criteria = this.getSession().createCriteria(Programa.class);
        return criteria.list();
    }

    public Programa get(Long id) {
        Criteria criteria = this.getSession().createCriteria(Programa.class);
        criteria.add(Restrictions.eq("id", id));
        return (Programa) criteria.uniqueResult();
    }

    public void save(Programa t) {
        this.getSession().save(t);
    }

    public void update(Programa t) {
        this.getSession().update(t);
    }

    public void delete(Programa t) {
        this.getSession().delete(t);
    }
}
