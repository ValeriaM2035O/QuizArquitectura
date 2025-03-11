package org.example;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> lstCarros = new ArrayList<>();

        int opcion;
        do {
            System.out.println("Menú de opciones:");
            System.out.println("1. Registrar carro");
            System.out.println("2. Mostrar detalles del vehiculo");
            System.out.println("3. Actualizar Kilometraje");
            System.out.println("4. Antiguo o nuevo?");
            System.out.println("5. Mantenimiento");
            System.out.println("6. Calcule el consumo del combustible");
            System.out.println("7. Combustible restante");
            System.out.println("8. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1 ->{
                    System.out.println("Ingrese datos del carro");
                    System.out.println("Nombre");
                    String nombre = scanner.nextLine();
                    System.out.println("Marca");
                    String marca = scanner.nextLine();
                    System.out.println("Modelo");
                    String modelo = scanner.nextLine();
                    System.out.println("Año");
                    int año = scanner.nextInt();
                    System.out.println("Kilometraje");
                    double kilometraje = scanner.nextDouble();
                    System.out.print("Ingrese la placa: ");
                    String placa = scanner.nextLine();
                    System.out.print("Ingrese la capacidad del tanque: ");
                    double capacidadTanque = scanner.nextDouble();

                    lstCarros.add(nombre, marca, modelo, año, kilometraje, placa, capacidadTanque);
                }
                case 2 -> {
                    System.out.print("Ingrese la placa del vehículo: ");
                    String placaBuscar = scanner.nextLine();
                    Auto autoEncontrado = buscarAuto(lstCarros, placaBuscar);
                    boolean encontrado = (autoEncontrado != null);

                    if (encontrado) {
                        autoEncontrado.mostrarDetalles();
                    } else {
                        System.out.println("Vehículo no encontrado.");
                    }

                    if (encontrado) {
                        System.out.println("No se encontró ningún vehículo con esa placa.");
                    }
                }
                 case 3 -> {
                     System.out.print("Ingrese la placa del vehículo: ");
                     String placaBuscar = scanner.nextLine();
                     Auto autoEncontrado = buscarAuto(lstCarros, placaBuscar);
                     if (autoEncontrado != null) {
                         System.out.print("Ingrese el nuevo kilometraje: ");
                         double nuevoKilometraje = scanner.nextDouble();
                         autoEncontrado.actualizarKilometraje(nuevoKilometraje);
                         System.out.println("Kilometraje actualizado.");
                     } else {
                         System.out.println("Vehículo no encontrado.");
                     }
                 }

                case 4 -> {
                    System.out.print("Ingrese la placa del vehículo: ");
                    String placaBuscar = scanner.nextLine();
                    Auto autoEncontrado = buscarAuto(lstCarros, placaBuscar);
                    if (autoEncontrado != null) {
                        System.out.println(autoEncontrado.esAntiguo() "El auto es antiguo." : "El auto es nuevo.");
                    } else {
                        System.out.println("Vehículo no encontrado.");
                    }
                }
                case 5 ->
                case 6 ->
                case 7 ->
                case 8 ->
                        System.out.println("Saliendo del sistema.");

                default ->
                        System.out.println("Opción no válida, intente de nuevo.");
            }
        } while (opcion != 8);

    }
}
}