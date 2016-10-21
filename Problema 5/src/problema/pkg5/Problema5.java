/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problema.pkg5;
import java.util.*;
/**
 *
 * @author Raziel 2
 */
public class Problema5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) { //Calcular si un numero es primo o no
        int x; // Numero solicitado
        int a; //ayuda a resolver el calculo
        x = solicitarNumero(); // solocitar el numero
        a = x-1;
        calcularymostrarTipo(x,a); 
    }
    public static int solicitarNumero(){
        int x;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce un numero");
        x = teclado.nextInt();
        return x;
    }
    public static void calcularymostrarTipo(int x, int a){
       while  ((x%a) != 0) { // Mientras que el residuo sea diferente de cero
       a --;                 //Disminuir a 
       }
       if (a==1){ mostrarPrimo(); } //Si a llega hasta el 1 mostrar que es primo
       else { mostrarOtro();
    }
    }
    public static void mostrarPrimo(){
        System.out.println("El numero a es primo");    
    }
    public static void mostrarOtro(){
        System.out.println("El numero a no es primo");
    }
}

