/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.calculadoraconsola;
import java.util.Scanner;

public class CalculadoraConsola {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Ingrese el primer número: ");
        double num1 = scanner.nextDouble();
        
        System.out.print("Ingrese el segundo número: ");
        double num2 = scanner.nextDouble();
        
        System.out.print("Ingrese un operador (+, -, *, /): ");
        char operator = scanner.next().charAt(0);
        
        double result = calculate(num1, num2, operator);
        
        if (Double.isNaN(result)) {
            System.out.println("¡Error! Operación no válida.");
        } else {
            System.out.println("El resultado es: " + result);
        }
    }
    
    public static double calculate(double num1, double num2, char operator) {
        switch (operator) {
            case '+':
                return num1 + num2;
            case '-':
                return num1 - num2;
            case '*':
                return num1 * num2;
            case '/':
                if (num2 != 0) {
                    return num1 / num2;
                } else {
                    return Double.NaN; 
                }
            default:
                return Double.NaN; 
        }
    }
}
