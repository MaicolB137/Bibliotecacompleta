package Observador;

import java.util.ArrayList;
import java.util.List;
import Objetos.*;

/**
 *
 * @author Alejandro Bernal Garnica
 */
public class BaseDeDatosBiblioteca {

    private List<Observator> observadores = new ArrayList<>();
    private List<Libro> libros = new ArrayList<>();
    private List<Revista> revistas = new ArrayList<>();
    private List<Socio> socios = new ArrayList<>();

    public void agregarObservador(Observator observator) {
        observadores.add(observator);
    }

    public void agregarLibro(Libro libro) {
        libros.add(libro);
        notificarObservadores();
    }

    public void agregarSocio(Socio socio) {
        socios.add(socio);
        notificarObservadores();
    }

    public void agregarRevista(Revista revista) {
        revistas.add(revista);
        notificarObservadores();
    }

    public void notificarObservadores() {
        for (Observador Observator : observadores) {
            Observator.actualizar();
        }
    }

    public void listarLibros() {
        for (Libro libro : libros) {
            System.out.println(libro.getTitulo() + " - " + libro.getAutor());
        }
    }

    public void listarRevistas() {
        for (Revista revista : revistas) {
            System.out.println(revista.getTitulo() + " - " + revista.getEditor());
        }
    }

    public List<Libro> buscarLibro(String titulo) {
        List<Libro> librosEncontrados = new ArrayList<>();
        for (Libro libro : libros) {
            if (libro.getTitulo().equalsIgnoreCase(titulo)) {
                librosEncontrados.add(libro);
            }
        }
        return librosEncontrados;
    }

    public Socio buscarSocio(String num) {
        for (Socio socio : socios) {
            if (socio.getNumeroSocio().equals(num)) {
                return socio;
            }
        }
        return null;
    }

    public void eliminarSocio(Socio socio) {
        socios.remove(socio);
    }
    public ArrayList<Socio> obtenerListaSocios() {
    ArrayList<Socio> listaSocios = new ArrayList<>();

    // Recorrer la lista de socios y agregarlos a la lista
    for (Socio socio : socios) {
        listaSocios.add(socio);
    }

    return listaSocios;
}

    // Resto de la implementación de la base de datos
}
