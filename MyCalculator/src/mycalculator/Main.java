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
