/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio;

/**
 *
 * @author Estudiantes
 */
public class Cliente {
   int f1,f2,resultado;
   int [] frecuencia= {11};
    public void lanzamiento (){
        for (int i=1;i<=1000;i++){
            Dado r1 = new Dado();
            Dado r2 = new Dado();
            f1 = r1.lado;
            f2 = r2.lado;
            resultado= f1+f2;
            frecuencia [resultado]++;
            
        }
    }
    
}
