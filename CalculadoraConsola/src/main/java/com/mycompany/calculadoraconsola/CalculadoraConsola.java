/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.calculadoraconsola;

import java.util.Scanner;

public class CalculadoraConsola {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduce el primer número:");
        double num1 = scanner.nextDouble();

        System.out.println("Introduce la operación (+, -, *, /):");
        String operacion = scanner.next();

        System.out.println("Introduce el segundo número:");
        double num2 = scanner.nextDouble();

        double resultado = 0;

        switch (operacion) {
            case "+":
                resultado = num1 + num2;
                break;
            case "-":
                resultado = num1 - num2;
                break;
            case "*":
                resultado = num1 * num2;
                break;
            case "/":
                resultado = num1 / num2;
                break;
            default:
                System.out.println("Operación no válida.");
                return;
        }

        System.out.println("El resultado es: " + resultado);
    }
}
