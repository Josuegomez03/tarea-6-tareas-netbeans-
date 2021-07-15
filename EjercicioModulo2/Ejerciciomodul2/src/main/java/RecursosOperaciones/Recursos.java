
package RecursosOperaciones;

public class Recursos {
    int edad=18;
    int multiplicacion;
  
          public void dato() {
           System.out.println("Programacion Orientada a Objetos 2021");
          }
          
          public void edad() {
              if(edad>=21){
                  System.out.println(" Eres mayor de edad");
               }else {
                 System.out.println(" Eres menor de edad");
              }
             }
          
           public int multiplicacion (int num1,int num2){
               int multiplicacion = num1 * num2;
               return multiplicacion;
                
          }         
} 
