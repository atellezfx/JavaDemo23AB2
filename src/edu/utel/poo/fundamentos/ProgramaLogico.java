package edu.utel.poo.fundamentos;

public class ProgramaLogico {

    public static void main(String[] args) {
        Operaciones oper = new Operaciones();
        // Operadores de corto circuito
        if( oper.esVerdadero() || oper.esVerdadero() ) {
            System.out.println("Mensaje importante");
        }

        if( oper.esFalso() && oper.esVerdadero() ) {
            System.out.println("Mensaje importante");
        }
    }

}
