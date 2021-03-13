package universidad;

public abstract class Persona {

    protected String nombre;
    protected String apellido;
    protected String NIF;
    protected String correo;
    protected String telefono;
    protected String direccion;
    protected String id;
    protected boolean isAlumno;
    protected boolean isProfesor;
    protected boolean isPAS;
    protected boolean isIT;

    public Persona(String nombre, String apellido, String NIF, String correo, String telefono, String direccion, String id, boolean isAlumno,  boolean isProfesor,  boolean isPAS,  boolean isIT) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.NIF = NIF;
        this.correo = correo;
        this.telefono = telefono;
        this.direccion = direccion;
        this.id = id;
        this.isAlumno = isAlumno;
        this.isProfesor = isProfesor;
        this.isPAS = isPAS;
        this.isIT = isIT;
    }

    public abstract void eliminar();

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getNIF() {
        return NIF;
    }

    public void setNIF(String NIF) {
        this.NIF = NIF;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public  boolean getIsAlumno() {
        return isAlumno;
    }

    public void setIsAlumno( boolean isAlumno) {
        this.isAlumno = isAlumno;
    }

    public  boolean getIsProfesor() {
        return isProfesor;
    }

    public void setIsProfesor( boolean isProfesor) {
        this.isProfesor = isProfesor;
    }

    public  boolean getIsPAS() {
        return isPAS;
    }

    public void setIsPAS( boolean isPAS) {
        this.isPAS = isPAS;
    }

    public  boolean getIsIT() {
        return isIT;
    }

    public void setIsIT( boolean isIT) {
        this.isIT = isIT;
    }

}
