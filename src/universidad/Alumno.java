package universidad;

public class Alumno extends Persona {

    private String horario;
    private String ciclo;
    private String aula;
    private String tutor;
    private String curso;

    public Alumno(String horario, String ciclo, String aula, String tutor,
            String curso, String nombre, String apellido, String NIF,
            String correo, String telefono, String direccion, String id,
            boolean isAlumno, boolean isProfesor, boolean isPAS, boolean isIT) {
        super(nombre, apellido, NIF, correo, telefono, direccion, id, isAlumno,
                isProfesor, isPAS, isIT);
        this.horario = horario;
        this.ciclo = ciclo;
        this.aula = aula;
        this.tutor = tutor;
        this.curso = curso;
    }

    public void modificar(String horario, String ciclo, String aula, String tutor,
            String curso) {
        
        this.horario = horario;
        this.ciclo = ciclo;
        this.aula = aula;
        this.tutor = tutor;
        this.curso = curso;
    }

    @Override
    public void eliminar() {
        horario = null;
        ciclo = null;
        aula = null;
        tutor = null;
        curso = null;
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

    public String getCiclo() {
        return ciclo;
    }

    public void setCiclo(String ciclo) {
        this.ciclo = ciclo;
    }

    public String getAula() {
        return aula;
    }

    public void setAula(String aula) {
        this.aula = aula;
    }

    public String getTutor() {
        return tutor;
    }

    public void setTutor(String tutor) {
        this.tutor = tutor;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

}
