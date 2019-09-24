
package scholar;

import java.util.Scanner;

public class Scholar {

    public static void main(String[] args) {  
        Scanner entrada =new Scanner (System.in);
        Estudiante estudiante1 = new Estudiante();
        
        MiVentana v = new MiVentana();
        v.setVisible(true);
    
        estudiante1.nombre= "Pedro jose ";
        estudiante1.apellido= "Rivero burgos ";
        estudiante1.genero= "Msculino ";
        estudiante1.fechadenaci= "12/02/2001";
        int fechanaci = 0;
        int fechaactu = 0;
        int edad;
        
        System.out.print("ingrese su fecha de nacimiento");
        fechanaci=entrada.nextInt();
        System.out.print("ingrese el año actual");
        fechaactu=entrada.nextInt();
        edad=fechaactu-fechanaci;
        System.out.print("la edad es " + edad);
        
        
        
                
                
                
        
        
             
           System.out.println("el Estudiante se llama " + estudiante1.nombre + estudiante1.apellido); 
           System.out.println(" el Estudiante es " + estudiante1.genero);
                   //System.out.println("el Estudiante se llama " + estudiante1.nombre + estudiante1.apellido); 
    }              //System.out.println(" el Estudiante es " + estudiante1.genero)
    
}
