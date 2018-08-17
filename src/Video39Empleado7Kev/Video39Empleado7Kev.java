/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Video39Empleado7Kev;



public class Video39Empleado7Kev {

    
     
    public static void main(String[] args) {
        // TODO code application logic here
        
      Empleado[] misempleados = new Empleado[4];
      
      misempleados[0] = new Empleado("Paco Gomez" , 8500,1990,12,17);
      
      misempleados[1] = new Empleado("Ana Lopez" , 9500,1995,06,02);
      
      misempleados[2] = new Empleado("Maria Martin" , 105,2002,03,15);
      
      misempleados[3] = new Empleado("Antonio Fernandez");
      
       for(Empleado e : misempleados){
          
          e.subSueldo(5);
      }
      
      for(Empleado e:misempleados){
          
          System.out.println("Nombre: " + e.dameNombre() + 
                  "Sueldo: " + e.dameSueldo()+ " Fecha de alta " +
                  e.dameFechaContrato());
      }
    }
    
}
