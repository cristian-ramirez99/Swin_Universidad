package universidad;

public class PAS extends Persona {

    private String rol;
    private double salario;
    private String horario;
    private String oficina;
    private String extension;

    public PAS(String rol, Double salario, String horario, String oficina, String extension, String nombre, String apellido, String NIF, String correo, String telefono, String direccion, String id, boolean isAlumno, boolean isProfesor, boolean isPAS, boolean isIT) {
        super(nombre, apellido, NIF, correo, telefono, direccion, id, isAlumno, isProfesor, isPAS, isIT);
        this.rol = rol;
        this.salario = salario;
        this.horario = horario;
        this.oficina = oficina;
        this.extension = extension;
    }

    public void modificar(String rol, Double salario, String horario,
            String oficina, String extension) {

        this.rol = rol;
        this.salario = salario;
        this.horario = horario;
        this.oficina = oficina;
        this.extension = extension;
    }

    @Override
    public void eliminar() {
        rol = null;
        horario = null;
        oficina = null;
        extension = null;
        nombre = null;
        apellido = null;
        NIF = null;
        correo = null;
        telefono = null;
        direccion = null;
        id = null;
    }

    public String getRol() {
        return rol;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }

    public Double getSalario() {
        return salario;
    }

    public void setSalario(Double salario) {
        this.salario = salario;
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

    public String getOficina() {
        return oficina;
    }

    public void setOficina(String oficina) {
        this.oficina = oficina;
    }

    public String getExtension() {
        return extension;
    }

    public void setExtension(String extension) {
        this.extension = extension;
    }

}
