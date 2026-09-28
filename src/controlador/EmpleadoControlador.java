package controlador;

import modelo.RepositorioEmpleados;

import java.util.ArrayList;

public class EmpleadoControlador {

    public static final String[] TIPOS_EMPLADO = {"Operativo", "Administrador"};

    private final RepositorioEmpleados repositorio;
    private final ArrayList<String> historial;

    public EmpleadoControlador() {
        repositorio = new RepositorioEmpleados();
        historial = new ArrayList<>();
        cargarDatosDePrueba();
    }
}
