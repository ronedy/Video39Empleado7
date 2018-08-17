
package Video39Empleado7Kev;

import java.util.*;

public class Empleado {
    
    public Empleado(String nom,double sue,int agno,int mes,int dia){
      
        nombre=nom;
        sueldo = sue;
        
        GregorianCalendar calendario = new GregorianCalendar(agno,mes-1,dia);
        
        altaContrato = calendario.getTime();
  }
    
    public Empleado(String nom){
        
        this(nom, 30000,2000,01,01);
        
    }

    Empleado() {
        throw new UnsupportedOperationException("Not supported yet."); 
    }
    
  public String dameNombre(){
      
      return nombre;
  }  
  
  public double dameSueldo(){ //geter
      
      return sueldo;
  }
  
  public Date dameFechaContrato(){
      
      return altaContrato;
  }
  
  public void subSueldo(double porcentaje){
      
      double aumento = sueldo*porcentaje/100;
      
      sueldo+=aumento;
  }
  private String nombre;
  private double sueldo;
  private Date altaContrato;
  
    
}
