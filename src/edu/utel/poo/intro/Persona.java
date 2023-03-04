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
        // TODO: Explicar porque la concatenación desperdicia la memoria
        return "Persona: " + nombre + " " + apellidos + " " + genero + " con " + edad + " años.";
    }

}
