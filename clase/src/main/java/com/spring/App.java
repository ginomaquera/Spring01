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
	        //App.inyeccionColeccion(cntx);
                //App.inyeccionNombre(cntx);
                App.inyeccionTipo(cntx);
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
