/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package calculadora;

import java.util.Stack;

/**
 *
 * @author ASOCIACIÒN
 */
public class Calculadora {
    private double dato1;
    private double dato2;
    private Stack<String> Deshacer;
    private Stack<String> Rehacer;
    private Stack<String> resultado;
    

    public Calculadora(double dato1, double dato2, Stack<String> Deshacer, Stack<String> Rehacer,Stack<String> resultado) {
        this.dato1 = dato1;
        this.dato2 = dato2;
        Deshacer = new Stack<>();
        Rehacer = new Stack<>();
        resultado = new Stack<>();
        
    }

  
    
         public void sumar(String calculadora){
             Deshacer.pop();
             
        
    }
    
    
}
