package universidad;

public class IT extends Persona {

    private String horario;
    private double salario;
    private String estacionDeTrabajo;
    private String extension;
    private boolean hacePracticas;

    public IT(String horario, double salario, String estacionDeTrabajo,
            String extension, boolean hacePracticas, String nombre,
            String apellido, String NIF, String correo, String telefono,
            String direccion, String id, boolean isAlumno, boolean isProfesor,
            boolean isPAS, boolean isIT) {
        super(nombre, apellido, NIF, correo, telefono, direccion, id, isAlumno, isProfesor, isPAS, isIT);
        this.horario = horario;
        this.salario = salario;
        this.estacionDeTrabajo = estacionDeTrabajo;
        this.extension = extension;
        this.hacePracticas = hacePracticas;
    }

    public void modificar(String horario, Double salario, String estacionDeTrabajo,
            String extension, boolean hacerPracticas) {

        this.horario = horario;
        this.salario = salario;
        this.estacionDeTrabajo = estacionDeTrabajo;
        this.extension = extension;
        this.hacePracticas = hacerPracticas;
    }

    @Override
    public void eliminar() {
        horario = null;
        estacionDeTrabajo = null;
        extension = null;
        nombre = null;
        apellido = null;
        NIF = null;
        correo = null;
        telefono = null;
        direccion = null;
        id = null;
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getEstacionDeTrabajo() {
        return estacionDeTrabajo;
    }

    public void setEstacionDeTrabajo(String estacionDeTrabajo) {
        this.estacionDeTrabajo = estacionDeTrabajo;
    }

    public String getExtension() {
        return extension;
    }

    public void setExtension(String extension) {
        this.extension = extension;
    }

    public boolean isHacePracticas() {
        return hacePracticas;
    }

    public void setHacePracticas(boolean hacePracticas) {
        this.hacePracticas = hacePracticas;
    }

}
