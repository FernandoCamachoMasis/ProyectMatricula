/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicios.modelo;

/**
 *
 * @author ferca
 */
public class Profesor {

    /**
     * @return the id_profe
     */
    public int getId_profe() {
        return id_profe;
    }

    /**
     * @param id_profe the id_profe to set
     */
    public void setId_profe(int id_profe) {
        this.id_profe = id_profe;
    }

    /**
     * @return the id_usuario
     */
    public String getId_usuario() {
        return id_usuario;
    }

    /**
     * @param id_usuario the id_usuario to set
     */
    public void setId_usuario(String id_usuario) {
        this.id_usuario = id_usuario;
    }

    /**
     * @return the apellido1
     */
    public String getApellido1() {
        return apellido1;
    }

    /**
     * @param apellido1 the apellido1 to set
     */
    public void setApellido1(String apellido1) {
        this.apellido1 = apellido1;
    }

    /**
     * @return the apellido2
     */
    public String getApellido2() {
        return apellido2;
    }

    /**
     * @param apellido2 the apellido2 to set
     */
    public void setApellido2(String apellido2) {
        this.apellido2 = apellido2;
    }

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the telefono
     */
    public String getTelefono() {
        return telefono;
    }

    /**
     * @param telefono the telefono to set
     */
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    /**
     * @return the email
     */
    public String getEmail() {
        return email;
    }

    /**
     * @param email the email to set
     */
    public void setEmail(String email) {
        this.email = email;
    }

    public Profesor(int id_profe, String id_usuario, String apellido1, String apellido2, String nombre, String telefono, String email) {
        this.id_profe = id_profe;
        this.id_usuario = id_usuario;
        this.apellido1 = apellido1;
        this.apellido2 = apellido2;
        this.nombre = nombre;
        this.telefono = telefono;
        this.email = email;
    }

    @Override
    public String toString() {
        return "Profesor{" + "id_profe=" + getId_profe() + ", id_usuario=" + getId_usuario() + ", apellido1=" + getApellido1() + ", apellido2=" + getApellido2() + ", nombre=" + getNombre() + ", telefono=" + getTelefono() + ", email=" + getEmail() + '}';
    }
    private int id_profe;
    private String id_usuario;
    private String apellido1;
    private String apellido2;
    private String nombre;
    private String telefono;
    private String email;
}
