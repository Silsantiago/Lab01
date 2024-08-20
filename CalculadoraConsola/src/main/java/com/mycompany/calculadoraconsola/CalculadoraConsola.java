/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.calculadoraconsola;
import java.util.InputMismatchException;
import java.util.Scanner;

public class CalculadoraConsola {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char continuar;
        
        do {
            double num1 = 0, num2 = 0;
            char operador = ' ';
            
            try {
                System.out.print("Ingrese el primer número: ");
                num1 = scanner.nextDouble();
                
                System.out.print("Ingrese el segundo número: ");
                num2 = scanner.nextDouble();
                
                System.out.print("Ingrese un operador (+, -, *, /): ");
                operador = scanner.next().charAt(0);
                
                double resultado = calcular(num1, num2, operador);
                
                if (Double.isNaN(resultado)) {
                    System.out.println("¡Error! Operación no válida.");
                } else {
                    System.out.println("El resultado es: " + resultado);
                }
                
            } catch (InputMismatchException e) {
                System.out.println("¡Error! Entrada no válida. Por favor, ingrese valores numéricos.");
                scanner.next(); 
            }
            
            System.out.print("¿Desea realizar otro cálculo? (s/n): ");
            continuar = scanner.next().charAt(0);
            
        } while (continuar == 's' || continuar == 'S');
        
        scanner.close(); 
    }
    
    public static double calcular(double num1, double num2, char operador) {
        switch (operador) {
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
