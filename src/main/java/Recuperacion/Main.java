package Recuperacion;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int opcion = 0;
        Scanner scan = new Scanner(System.in);
        System.out.println("===================");
        System.out.println("     BIENVENIDO    ");
        System.out.println("===================");
        do {
            System.out.println("================================");
            System.out.println("Que accion deseas realizar?");
            System.out.println("1. Agregar participante.");
            System.out.println("2. Mostrar nomina de participantes.");
            System.out.println("3. Crear torneo de artes marciales");
            System.out.println("4. Iniciar torneo de artes marciales");
            System.out.println("5. Salir");
            opcion = Integer.parseInt(scan.nextLine());

            switch (opcion){
                case 1:
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
                    break;
                default:
                    System.out.println("Ingrese una opcion valida :)");
                    break;
            }

        }while(opcion != 5);
    }
}