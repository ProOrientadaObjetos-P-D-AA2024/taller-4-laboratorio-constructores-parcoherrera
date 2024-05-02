package estudiante;

public class Estudiante {
    
    private String nombreEstudiante;
    private double califMateria1, califMateria2, califMateria3, promedio;

    public Estudiante(String nombreEstudiante, double califMateria1, double califMateria2, double califMateria3) {
        this.nombreEstudiante = nombreEstudiante;
        this.califMateria1 = califMateria1;
        this.califMateria2 = califMateria2;
        this.califMateria3 = califMateria3;
    }

    public Estudiante(String nombreEstudiante, double califMateria1, double califMateria2) {
        this.nombreEstudiante = nombreEstudiante;
        this.califMateria1 = califMateria1;
        this.califMateria2 = califMateria2;
        califMateria3 = 8.2;
    }

    public String getNombreEstudiante() {
        return nombreEstudiante;
    }

    public void setNombreEstudiante(String nombreEstudiante) {
        this.nombreEstudiante = nombreEstudiante;
    }

    public double getCalifMateria1() {
        return califMateria1;
    }

    public void setCalifMateria1(double califMateria1) {
        this.califMateria1 = califMateria1;
    }

    public double getCalifMateria2() {
        return califMateria2;
    }

    public void setCalifMateria2(double califMateria2) {
        this.califMateria2 = califMateria2;
    }

    public double getCalifMateria3() {
        return califMateria3;
    }

    public void setCalifMateria3(double califMateria3) {
        this.califMateria3 = califMateria3;
    }

    public double getPromedio() {
        return promedio;
    }

    public void calcularPromedio() {
        promedio = (califMateria1 + califMateria2 + califMateria3) / 3;
    }

    @Override
    public String toString() {
        return "Nombre: " + nombreEstudiante + "\n"
                + "Calificación de materia 1: " + califMateria1 + "\n"
                + "Calificación de materia 2: " + califMateria2 + "\n"
                + "Calificación de materia 3: " + califMateria3 + "\n"
                + "Promedio: " + promedio + "\n";
    }

}
