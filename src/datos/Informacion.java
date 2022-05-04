package datos;

import java.util.logging.Logger;


public class Informacion {
    String nombre;
    String carrera;
    int semestre;
    
    public Informacion(String nombre, String carrera, int semestre){
        this.nombre = nombre;
        this.carrera = carrera;
        this.semestre = semestre;
    }

    public String getNombre() {
        return "El nombre del alumno es: "+nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCarrera() {
        return "La carrera es: "+carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    public String getSemestre() {
        return "El semestre es: "+semestre;
    }

    public void setSemestre(int semestre) {
        this.semestre = semestre;
    }
    
    
    
}
