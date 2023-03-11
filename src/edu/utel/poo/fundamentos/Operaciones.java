package edu.utel.poo.fundamentos;

/**
 * Clase que realiza operaciones básicas aritméticas
 * @author Benito Bodoque
 */
public class Operaciones {

    /**
     * Este método <b>suma</b> dos valores enteros
     * @param x El primer entero a sumar
     * @param y El segundo entero a sumar
     * @return La suma de los dos parámetros
     */
    public int suma(int x, int y) {
        return x+y;
    }

    /**
     * Este método restar dos valores enteros
     * @param x El primer entero a restar
     * @param y El segundo entero a restar
     * @return La resta de los dos parámetros
     */
    public int resta(int x, int y) {
        return x-y;
    }

    /**
     * Este método suma dos valores enteros
     * @param x El primer entero a sumar
     * @param y El segundo entero a sumar
     * @return La suma de los dos parámetros
     */
    public int multiplica(int x, int y) {
        return x*y;
    }

    /**
     * Este método divide dos valores enteros
     * @param x El primer entero a dividir
     * @param y El segundo entero a dividir
     * @return La división de los dos parámetros
     */
    public int divide(int x, int y) {
        return x/y;
    }

    public boolean esVerdadero() {
        System.out.println("Este método regresa verdadero");
        return true;
    }

    public boolean esFalso() {
        System.out.println("Este método regresa falso");
        return false;
    }


}
