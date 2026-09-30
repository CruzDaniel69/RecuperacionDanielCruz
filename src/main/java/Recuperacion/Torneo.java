package Recuperacion;

import java.util.List;
import java.util.Scanner;
import java.util.TreeMap;

public class Torneo{

    Scanner scan = new Scanner(System.in);
    public String nombre;
    Peleador obj1 = new Peleador();
    TreeMap<String, Peleador> participantes = new TreeMap<>();

    public String Torneo(){
        System.out.println("Ingresa el nombre del torneo:");
        nombre = scan.nextLine();
        return nombre;
    }

    public void agregarParticipante(){
        String nombre;
        System.out.println("Ingresa nombre del participante:");
        nombre = scan.nextLine();

        participantes.put(nombre, obj1);
    }

    public void iniciarTorneo(){
        System.out.println("Iniciando torneo...");
    }

    public void mostrarParticipantes(){
        participantes.forEach();
    }
}
