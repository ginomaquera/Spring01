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
        List<Programa> lista = localDAO.list();
        for (Programa p : lista) {
            System.out.println("Nombre: " + p.getNombre() + " id: " + p.getCodigo());
        }
    }
}