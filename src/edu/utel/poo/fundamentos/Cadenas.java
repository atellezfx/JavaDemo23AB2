package edu.utel.poo.fundamentos;

public class Cadenas {

    public static void main(String[] args) {
        // Cadenas creadas por asignación directa
        String cad1 = "Café"; // String-Pool
        String cad2 = "Café"; // String-Pool

        // Cadena creada con la palabra reservada new
        String cad3 = new String("Café"); // Heap

        // El operador == comapara direcciones en memoria
        if( cad1 == cad2 ) System.out.println("Las cadenas cad1 y cad2 son iguales");
        if( cad1 == cad3 ) System.out.println("Las cadenas cad1 y cad3 son iguales");

        // Coparar el valor de las cadenas
        if( cad1.equals(cad3) ) System.out.println("Las cadenas cad1 y cad3 textualmente son iguales");
        if( cad1.equals(cad2) ) System.out.println("Las cadenas cad1 y cad2 textualmente son iguales");

        String cad4 = "cAfÉ";
        if( cad1.equalsIgnoreCase( cad4 ) ) System.out.println("Las cadenas cad1 y cad4 textualmente iguales, \n\tignora mayúsculas y minúsculas");
    }

}
