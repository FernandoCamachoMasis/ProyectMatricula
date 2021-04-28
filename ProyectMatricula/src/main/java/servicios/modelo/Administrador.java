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
public class Administrador {

    /**
     * @return the id_administrador
     */
    public int getId_administrador() {
        return id_administrador;
    }

    /**
     * @param id_administrador the id_administrador to set
     */
    public void setId_administrador(int id_administrador) {
        this.id_administrador = id_administrador;
    }

    /**
     * @return the usuario_id
     */
    public String getUsuario_id() {
        return usuario_id;
    }

    /**
     * @param usuario_id the usuario_id to set
     */
    public void setUsuario_id(String usuario_id) {
        this.usuario_id = usuario_id;
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

    public Administrador(int id_administrador, String usuario_id, String apellido1, String apellido2, String nombre, String telefono, String email) {
        this.id_administrador = id_administrador;
        this.usuario_id = usuario_id;
        this.apellido1 = apellido1;
        this.apellido2 = apellido2;
        this.nombre = nombre;
        this.telefono = telefono;
        this.email = email;
    }

    @Override
    public String toString() {
        return "Administrador{" + "id_administrador=" + getId_administrador() + ", usuario_id=" + getUsuario_id() + ", apellido1=" + getApellido1() + ", apellido2=" + getApellido2() + ", nombre=" + getNombre() + ", telefono=" + getTelefono() + ", email=" + getEmail() + '}';
    }
    private int id_administrador;
    private String usuario_id;
    private String apellido1;
    private String apellido2;
    private String nombre;
    private String telefono;
    private String email;
}
