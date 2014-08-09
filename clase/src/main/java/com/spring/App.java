package com.spring;

import com.spring.jdbc.dao.ProgramaDAO;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.model.Musico;
import com.spring.jdbc.model.Programa;
import java.util.List;

public class App {	
	
	 public static void main(String[] args) {
                ApplicationContext cntx = new ClassPathXmlApplicationContext("jdbc_db.xml");
                ProgramaDAO localDAO = (ProgramaDAO) cntx.getBean("programaDAO");
                System.out.println("Lista Inicial");
                List<Programa> lista = localDAO.all();
                for (Programa p: lista) {
                    System.out.println("Nombre: "+p.getNombre()+ " id: "+p.getCodigo());
                }                
                Programa pro1 = localDAO.find(Long.valueOf(1));
                System.out.println("valores :"+pro1.getDescripcion());
                
                Programa pro2 = new Programa(Long.valueOf(2),"C4","C3","2");
                localDAO.update(pro2);
                System.out.println("Modificando valor C2");
                System.out.println("Lista Actualizada");
                List<Programa> lista2 = localDAO.all();
                for (Programa p: lista2) {
                    System.out.println("Nombre: "+p.getNombre()+ " id: "+p.getCodigo());
                }
                
	        //ApplicationContext cntx = new ClassPathXmlApplicationContext("app.xml");
	        //AppBean.valoresConstructor(cntx);
	        //AppBean.valoresReferencia(cntx);
	        //AppBean.valoresSetter(cntx);
	        //AppBean.inyeccionBean(cntx);
	        //App.inyeccionColeccion(cntx);
                //App.inyeccionNombre(cntx);
                //App.inyeccionTipo(cntx);
                //App.inyeccionConstructor(cntx);
                //App.inyeccionAutomatica(cntx);
                
                
                
	    }
	    
	    public static void valoresConstructor(ApplicationContext context) {
	        Musico musico = (Musico) context.getBean("musico");
	        System.out.println(musico.getNumeroCanciones());        
	    }
	    
	    public static void valoresReferencia(ApplicationContext context) {
	        Musico musico = (Musico) context.getBean("musico2");
	        System.out.println(musico.getNumeroCanciones()+" "+musico.getInstrumento().getNombre());        
	    }
	    
	    public static void valoresSetter(ApplicationContext context) {
	        Musico musico = (Musico) context.getBean("musico3");
	        System.out.println(musico.getNumeroCanciones()+" "+musico.getInstrumento().getNombre());        
	    }
	    
	    public static void inyeccionBean(ApplicationContext context) {
	        Musico musico = (Musico) context.getBean("musico4");
	        System.out.println(musico.getInstrumento().getNombre());        
	    }
	    
	    public static void inyeccionColeccion(ApplicationContext context) {
	        Musico musico = (Musico) context.getBean("musico5");
	        System.out.println(musico.getInstrumentos().get(0).getNombre());        
	        System.out.println(musico.getInstrumentos().get(1).getNombre());        
	    }
            
            public static void inyeccionNombre(ApplicationContext context) {
	        Musico musico = (Musico) context.getBean("musico10");
	        System.out.println(musico.getInstrumento10().getNombre());        
	    }
            
            public static void inyeccionTipo(ApplicationContext context) {
	        Musico musico = (Musico) context.getBean("musico11");
	        System.out.println(musico.getInstrumento10().getNombre());        
	    }
            
            public static void inyeccionConstructor(ApplicationContext context) {
	        Musico musico = (Musico) context.getBean("musico12");
	        System.out.println(musico.getInstrumento().getNombre());        
	    }
            
            public static void inyeccionAutomatica(ApplicationContext context) {
	        Musico musico = (Musico) context.getBean("musico13");
	        System.out.println(musico.getInstrumento().getNombre());        
	    }
}
