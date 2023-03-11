package edu.utel.poo.intro;

public class Persona {

    private String nombre, apellidos;
    private String genero;
    private int edad; // La edad debe ser calculada

    public Persona(String nombre, String apellidos, String genero, int edad) {
       this.nombre = nombre;
       this.apellidos = apellidos;
       this.genero = genero;
       this.edad = edad;
    }

    public String toString() {
        // Se desperdicia memoria porque aquí se crean 17 cadenas de texto
        // return "Persona: " + nombre + " " + apellidos + " " + genero + " con " + edad + " años.";

        // Ocupando cadenas con formato se crean 4 cadenas
        String cadena = "Persona: %s %s %s con %d años.";
        return cadena.formatted(nombre, apellidos, genero, edad);

        // Ensamblar cadenas con las clase StringBuilder o StringBuffer
    }

}
