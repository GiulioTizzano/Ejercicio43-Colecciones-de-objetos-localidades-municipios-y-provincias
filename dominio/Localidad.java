package dominio;

public class Localidad {
    private String nombreLocalidad;
    public int numeroHabitantes;

    public Localidad(String nombreLocalidad, int numeroHabitantes) {
        this.nombreLocalidad = nombreLocalidad;
        this.numeroHabitantes = numeroHabitantes;

    }

    public String getNombre() {
        return nombreLocalidad;
    }

    public void setNombre(String nombreLocalidad) {
        this.nombreLocalidad = nombreLocalidad;
    }

    public int getNumeroHabitantes() {
        return numeroHabitantes;

    }

    public void setNumeroHabitantes(int numeroHabitantes) {
        this.numeroHabitantes = numeroHabitantes;
    }

    public String toString() {

        return "El nombre de la localidad es " + nombreLocalidad + " y tiene " + numeroHabitantes + "\n" +
        "numero de habitantes. ";
    }


}