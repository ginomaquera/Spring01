/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.spring;

import com.spring.orm.dao.ProgramaDAO;
import com.spring.orm.model.Programa;
import java.util.List;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 *
 * @author SABADO-MANHANA
 */
public class AppSpringHibernate {

    public static void main(String[] args) {
        ApplicationContext cntx = new ClassPathXmlApplicationContext("h_db.xml");
        
        ProgramaDAO localDAO = (ProgramaDAO) cntx.getBean("programaDAO");
        Programa programa = new Programa(9L, "curso 26", "curso 26", "26");
        //AppSpringHibernate.doInsert(cntx, programa); 
        //Programa programa1 = localDAO.get(9L);
        //programa1.setDescripcion("33");
        localDAO.update(programa);
        //AppSpringHibernate.doUpdate(cntx, programa1);
        //AppSpringHibernate.doList(cntx);
        List<Programa> lista = localDAO.list();
        for (Programa p : lista) {
            System.out.println("Nombre: " + p.getNombre() + " id: "
                    + p.getId());
        }
    }

    public static void doList(ApplicationContext context) {
        ProgramaDAO localDAO = (ProgramaDAO) context.getBean("programaDAO");
        List<Programa> lista = localDAO.list();
        for (Programa p : lista) {
            System.out.println("Nombre: " + p.getNombre() + " id: "
                    + p.getId());
        }
    }
    
    public static void doInsert(ApplicationContext context, Programa programa) {
        ProgramaDAO localDAO = (ProgramaDAO) context.getBean("programaDAO");
        localDAO.save(programa);
    }
    
    public static void doUpdate(ApplicationContext context, Programa programa) {
        ProgramaDAO localDAO = (ProgramaDAO) context.getBean("programaDAO");
        localDAO.update(programa); 
    }
}
