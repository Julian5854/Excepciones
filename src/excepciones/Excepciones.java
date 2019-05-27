/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package excepciones;

/**
 *z
 * @author 
 */
public class Excepciones {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int a = 14;
        int b = 0;
        int c = 20;
        float d = 2,1;
        try{
            Ejemplo1.Dividir(a, b);
        }catch (ArithmeticException e){
            System.out.println("Está intentando dividir por 0");
        }
        try{
            Ejemplo2.Suma(c, b);
        }catch (ArithmeticException e){
            System.out.println("Está intentando dividir por 0");
        }
    }
    
}
