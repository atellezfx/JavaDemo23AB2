package edu.utel.poo.fundamentos;

import java.util.Scanner;

public class Programa {

    private Scanner scn = new Scanner(System.in);

    public static void main(String[] args) {
        Programa prog = new Programa();
        int opcion = prog.imprimeMenu();
        int x = prog.pedirValor("Escribe el valor de x: ");
        int y = prog.pedirValor("Escribe el valor de y: ");
        prog.realizaOperacion(opcion, x, y);
    }

    private int imprimeMenu() {
        System.out.println("Selecciona la operación deseada: ");
        System.out.println("1. Suma");
        System.out.println("2. Resta");
        System.out.println("3. Multiplicación");
        System.out.println("4. División");
        System.out.println("0. Salir");
        System.out.print("Opción: ");
        return scn.nextInt();
    }

    private int pedirValor(String mensaje) {
        System.out.print(mensaje);
        return scn.nextInt();
    }

    private void realizaOperacion(int opcion, int x, int y) {
        Operaciones oper = new Operaciones();
        int resultado = 0;
        switch (opcion) {
            case 1:
                resultado = oper.suma(x, y);
                break;
            case 2:
                resultado = oper.resta(x, y);
                break;
            case 3:
                resultado = oper.multiplica(x, y);
                break;
            case 4:
                resultado = oper.divide(x, y);
                break;
            default:
                System.out.println("Gracias por participar");
                System.exit(0);
        }
        System.out.printf("El resultado de la operación es: %d \n", resultado);
    }

}
