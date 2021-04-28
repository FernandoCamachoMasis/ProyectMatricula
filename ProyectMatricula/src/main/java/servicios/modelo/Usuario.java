/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicios.modelo;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author ferca
 */
public class Usuario {

    
    

    private static final DateFormat FMT = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
    private String id_usuario;
    private int rol_id;
    private String clave;
    private Date ultimo_acceso;
    private int activo;
    
    public Usuario(String id_usuario, int rol_id, String clave, Date ultimo_acceso, int activo) {
        this.id_usuario = id_usuario;
        this.rol_id = rol_id;
        this.clave = clave;
        this.ultimo_acceso = ultimo_acceso;
        this.activo = activo;
    }
    
    public Usuario() {
        this("", 0, "", new Date(),0);
        this.activo = 0;
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
     * @return the rol_id
     */
    public int getRol_id() {
        return rol_id;
    }

    /**
     * @param rol_id the rol_id to set
     */
    public void setRol_id(int rol_id) {
        this.rol_id = rol_id;
    }
    
    /**
     * @return the FMT
     */
    public static DateFormat getFMT() {
        return FMT;
    }

    /**
     * @return the clave
     */
    public String getClave() {
        return clave;
    }

    /**
     * @param clave the clave to set
     */
    public void setClave(String clave) {
        this.clave = clave;
    }

    /**
     * @return the ultimo_acceso
     */
    public Date getUltimo_acceso() {
        return ultimo_acceso;
    }

    /**
     * @param ultimo_acceso the ultimo_acceso to set
     */
    public void setUltimo_acceso(Date ultimo_acceso) {
        this.ultimo_acceso = ultimo_acceso;
    }

    /**
     * @return the activo
     */
    public int getActivo() {
        return activo;
    }

    /**
     * @param activo the activo to set
     */
    public void setActivo(int activo) {
        this.activo = activo;
    }

    
    @Override
    public String toString() {
        return String.format("{%s, %d, %s, %s, %d, %s", 
                id_usuario, rol_id, clave, clave, FMT.format(ultimo_acceso), activo);
    }
    
    
}
