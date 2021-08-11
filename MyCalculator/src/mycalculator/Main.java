/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mycalculator;

/**
 *
 * @author anmontero
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        // Create calculator implementation
        System.out.println("Git Calculator!");

        // Karen Sofia Coral Godoy- KSCG
        pruebaKSCG();
        
        //pruebas lida guerrero
        CalculadoraLKGL prueba = new CalculadoraLKGL();
        System.out.println("pruebas "+ prueba.about());
        System.out.println("suma 5 y 6 "+ prueba.add(5,6));
        System.out.println("division 5 y 6 "+ prueba.divide(5, 6));
        System.out.println("multiplicacion 9 y 2 "+ prueba.multiply(9, 2));
        System.out.println("resta 5 y 8 "+ prueba.substract(5, 8));

        //pruebas Daniel Reyes
        CalculadoraDARM prueba2 = new CalculadoraDARM();
        System.out.println("\n ");
        System.out.println(prueba2.about());
        System.out.println("Pruebas Funcionales: ");
        System.out.println("Suma de: 10 + 10 = "+ prueba2.add(10,10));
        System.out.println("Division de: 10 / 2 = "+ prueba2.divide(10, 2));
        System.out.println("Multiplicacion de: 10 * 2 = "+ prueba2.multiply(10, 2));
        System.out.println("Resta de: 10 - 8 = "+ prueba2.substract(10, 8));
        System.out.println("\n");
        
        //pruebas Camilo Cruz
        CalculadoraCACG prueba3 = new CalculadoraCACG();
        System.out.println("\n ");
        System.out.println(prueba3.about());
        System.out.println("Pruebas Funcionales: ");
        System.out.println("Suma de: 9 + 10 = "+ prueba3.add(9,10));
        System.out.println("Division de: 8 / 2 = "+ prueba3.divide(8, 2));
        System.out.println("Multiplicacion de: 11 * 2 = "+ prueba3.multiply(11, 2));
        System.out.println("Resta de: 9 - 8 = "+ prueba3.substract(9, 8));
        System.out.println("\n");
        	
    }

    public static void pruebaKSCG() {

        CalculadoraKSCG c = new CalculadoraKSCG();
        double a = 25;
        double b = 5;

        System.out.println(c.about());
        System.out.println(a + " + " + b + " = " + c.add(a, b));
        System.out.println(a + " - " + b + " = " + c.substract(a, b));
        System.out.println(a + " * " + b + " = " + c.multiply(a, b));
        System.out.println(a + " / " + b + " = " + c.divide(a, b));
    }
    
    

}
