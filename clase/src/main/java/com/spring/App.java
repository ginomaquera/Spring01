package com.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.model.Musico;

public class App {	
	
	 public static void main(String[] args) {
	        ApplicationContext cntx = new ClassPathXmlApplicationContext("app.xml");
	        //AppBean.valoresConstructor(cntx);
	        //AppBean.valoresReferencia(cntx);
	        //AppBean.valoresSetter(cntx);
	        //AppBean.inyeccionBean(cntx);
	        App.inyeccionColeccion(cntx);
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

}
