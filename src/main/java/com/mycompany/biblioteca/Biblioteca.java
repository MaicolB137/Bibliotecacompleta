/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.biblioteca;

import Decorator.*;
import Objetos.*;
import Observador.*;
import Proxy.GestionReservaDevolucionReal;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Michael
 */
public class Biblioteca {

    public static BaseDeDatosBiblioteca baseDeDatos = new BaseDeDatosBiblioteca();

    public static void ingresarSocio() {

        System.out.println("\nIngreso de socio:");

        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el nombre del socio:");
        String nombre = scanner.nextLine();
        System.out.println("Ingrese el número de socio:");
        String numeroSocio = scanner.nextLine();

        Socio nuevoSocio = new Socio(nombre, numeroSocio);

        baseDeDatos.agregarSocio(nuevoSocio);

        System.out.println("Socio ingresado correctamente.");
    }

    public static void modificarSocio() {
        System.out.println("\nModificación de socio:");

        // Solicitar el número de socio del socio a modificar
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el número de socio del socio a modificar:");
        String numeroSocio = scanner.nextLine();

        // Buscar el socio en la base de datos
        Socio socio = baseDeDatos.buscarSocio(numeroSocio);

        // Verificar si se encontró el socio
        if (socio == null) {
            System.out.println("No se encontró un socio con el número de socio proporcionado.");
            return;
        }

        // Mostrar los datos actuales del socio
        System.out.println("Datos actuales del socio:");
        System.out.println("Nombre: " + socio.getNombre());
        System.out.println("Número de socio: " + socio.getNumeroSocio());

        // Solicitar los nuevos datos del socio al usuario
        System.out.println("Ingrese el nuevo nombre del socio (deje en blanco para no modificar):");
        String nuevoNombre = scanner.nextLine();
        System.out.println("Ingrese el nuevo número de socio (deje en blanco para no modificar):");
        String nuevoNumeroSocio = scanner.nextLine();

        // Actualizar los datos del socio si se ingresaron nuevos valores
        if (!nuevoNombre.isEmpty()) {
            socio.setNombre(nuevoNombre);
        }
        if (!nuevoNumeroSocio.isEmpty()) {
            socio.setNumeroSocio(nuevoNumeroSocio);
        }

        System.out.println("Socio modificado correctamente.");
    }

    public static void eliminarSocio() {
        System.out.println("\nEliminación de socio:");

        // Solicitar el número de socio del socio a eliminar
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el número de socio del socio a eliminar:");
        String numeroSocio = scanner.nextLine();

        // Buscar el socio en la base de datos por su número de socio
        Socio socioEncontrado = baseDeDatos.buscarSocio(numeroSocio);

        // Verificar si el socio existe
        if (socioEncontrado != null) {
            // Mostrar los datos del socio a eliminar
            System.out.println("Datos del socio a eliminar:");
            System.out.println("Nombre: " + socioEncontrado.getNombre());
            System.out.println("Número de socio: " + socioEncontrado.getNumeroSocio());

            // Confirmar la eliminación del socio
            System.out.println("¿Está seguro de que desea eliminar este socio? (S/N)");
            String confirmacion = scanner.nextLine();

            if (confirmacion.equalsIgnoreCase("S")) {
                // Eliminar el socio de la base de datos
                baseDeDatos.eliminarSocio(socioEncontrado);
                System.out.println("Socio eliminado correctamente.");
            } else {
                System.out.println("La eliminación del socio ha sido cancelada.");
            }
        } else {
            System.out.println("No se encontró un socio con el número de socio proporcionado.");
        }
    }

    public static void consultarSocio() {
        System.out.println("\nConsulta de socio:");

        // Solicitar el número de socio del socio a consultar
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el número de socio del socio a consultar:");
        String numeroSocio = scanner.nextLine();

        // Buscar el socio en la base de datos por su número de socio
        Socio socioEncontrado = baseDeDatos.buscarSocio(numeroSocio);

        // Verificar si el socio existe
        if (socioEncontrado != null) {
            // Mostrar los detalles del socio
            System.out.println("Detalles del socio:");
            System.out.println("Nombre: " + socioEncontrado.getNombre());
            System.out.println("Número de socio: " + socioEncontrado.getNumeroSocio());
        } else {
            System.out.println("No se encontró un socio con el número de socio proporcionado.");
        }
    }

    public static void listarSocios() {
        System.out.println("\nLista de socios:");

        // Obtener la lista de socios desde la base de datos
        ArrayList<Socio> listaSocios = baseDeDatos.obtenerListaSocios();

        // Verificar si existen socios registrados
        if (!listaSocios.isEmpty()) {
            // Mostrar los datos de cada socio en la lista
            for (Socio socio : listaSocios) {
                System.out.println("Nombre: " + socio.getNombre());
                System.out.println("Número de socio: " + socio.getNumeroSocio());
                System.out.println("---------------------------");
            }
        } else {
            System.out.println("No hay socios registrados en la biblioteca.");
        }
    }

    public static void main(String[] args) {
        ConcreteComponent persona = new ConcreteComponent();
        GestionReservaDevolucionReal proxy = new GestionReservaDevolucionReal();
        
        Libro libro1 = new Libro("La sombra del viento", "Carlos Ruiz Zafón", "9788408163387");
        Libro libro2 = new Libro("Cien años de soledad", "Gabriel García Márquez", "9788439728640");
        Revista revista1 = new Revista("National Geographic", "National Geographic Society", 123);
        Revista revista2 = new Revista("Time", "Time Inc.", 456);

        
        baseDeDatos.agregarLibro(libro1);
        baseDeDatos.agregarLibro(libro2);
        baseDeDatos.agregarRevista(revista1);
        baseDeDatos.agregarRevista(revista2);

        
        System.out.println("Listado de libros:");
        baseDeDatos.listarLibros();
        System.out.println("\nListado de revistas:");
        baseDeDatos.listarRevistas();
        while (true) {
            
            int opcion = 0;

            
            System.out.println("\n--- Operaciones en el sistema de biblioteca ---");
            System.out.println("1. Buscar libros");
            System.out.println("2. Ingresar, modificar, eliminar y listar socios de la biblioteca");
            System.out.println("3. Solicitar préstamo de un libro");
            System.out.println("4. Hacer reserva de un libro");
            System.out.println("5. Devolver un libro en préstamo");
            System.out.println("6. Comprobar disponibilidad de libro");
            System.out.println("7. Extender plazo del préstamo de un libro");
            System.out.println("Ingrese el número de opción:");

            
            Scanner scanner = new Scanner(System.in);
            opcion = scanner.nextInt();

            
            switch (opcion) {
                case 1:
                    scanner.nextLine();
                    System.out.println("\nBúsqueda de libros:");
                    System.out.println("Ingrese el título del libro a buscar:");
                    String titulo = scanner.nextLine();
                    List<Libro> librosEncontrados = baseDeDatos.buscarLibro(titulo);
                    if (librosEncontrados.isEmpty()) {
                        System.out.println("No se encontraron libros con el título \"" + titulo + "\".");
                    } else {
                        System.out.println("Libros encontrados:");
                        for (Libro libro : librosEncontrados) {
                            System.out.println("Título: " + libro.getTitulo());
                            System.out.println("Autor: " + libro.getAutor());
                            System.out.println("ISBN: " + libro.getISBN());
                            System.out.println("---------------");
                        }
                    }

                    break;
                case 2:
                    boolean salir = false;

                    System.out.println("\nOperaciones de socios de la biblioteca:");
                    int opcionSocios = 0;

                    
                    System.out.println("1. Ingresar socio");
                    System.out.println("2. Modificar socio");
                    System.out.println("3. Eliminar socio");
                    System.out.println("4. Consultar socio");
                    System.out.println("5. Listar socios");

                    System.out.println("6. Volver al menú principal");
                    System.out.println("Ingrese el número de opción:");

                    
                    Scanner scannerSocios = new Scanner(System.in);
                    opcionSocios = scannerSocios.nextInt();

                    
                    switch (opcionSocios) {
                        case 1:
                            System.out.println("\nIngreso de socio:");
                            ingresarSocio();
                            break;
                        case 2:
                            System.out.println("\nModificación de socio:");
                            modificarSocio();
                            break;
                        case 3:
                            System.out.println("\nEliminación de socio:");
                            eliminarSocio();
                            break;
                        case 4:
                            System.out.println("\nConsulta de socio:");
                            consultarSocio();
                            break;
                        case 5:
                            System.out.println("\nListado de socios:");
                            listarSocios();
                            break;
                        case 6:
                            salir = true; 
                            break;
                        default:
                            System.out.println("\nOpción no válida.");
                            break;
                    }

                    break;
                case 3:
                    System.out.println("Solicitar préstamo de un libro");
                    persona.doJob();
                    ConcreteDecorator_1 cd_1 = new ConcreteDecorator_1();
                    cd_1.setComponente(persona);
                    cd_1.doJob();
                    ConcreteDecorator_2 cd_2 = new ConcreteDecorator_2();
                    cd_2.setComponente(persona);
                    cd_2.doJob();
                    break;
                case 4:
                    scanner.nextLine();
                    System.out.println("\nReserva de libro:");
                    System.out.println("ingrese el isbn del libro a resevar");
                    String ISBN = scanner.nextLine();
                    proxy.reservaLibro(ISBN);
                    break;
                case 5:
                    scanner.nextLine();
                    System.out.println("\nDevolución de libro en préstamo:");
                    System.out.println("ingrese el isbn del libro a devolver");
                    String ISBN2 = scanner.nextLine();
                    proxy.reservaLibro(ISBN2);
                    break;
                case 6:
                    System.out.println("\nDisponibilidad de libro:");
                    ConcreteDecorator_Disponibilidad cd_3 = new ConcreteDecorator_Disponibilidad();
                    cd_3.setComponente(persona);
                    cd_3.doJob();
                    break;
                case 7:
                    Observator o1 = new Observator();
                    baseDeDatos.agregarObservador(o1);
                    System.out.println("\nExtensión de préstamo:");
                    baseDeDatos.notificarObservadores();
                    break;
                default:
                    System.out.println("\nOpción no válida.");
                    break;
            }
        }
    }
}
