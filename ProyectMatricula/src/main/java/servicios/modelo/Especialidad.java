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
public class Especialidad {

    /**
     * @return the id_profedor
     */
    public int getId_profedor() {
        return id_profedor;
    }

    /**
     * @param id_profedor the id_profedor to set
     */
    public void setId_profedor(int id_profedor) {
        this.id_profedor = id_profedor;
    }

    /**
     * @return the id_area_tematica
     */
    public int getId_area_tematica() {
        return id_area_tematica;
    }

    /**
     * @param id_area_tematica the id_area_tematica to set
     */
    public void setId_area_tematica(int id_area_tematica) {
        this.id_area_tematica = id_area_tematica;
    }

    public Especialidad(int id_profedor, int id_area_tematica) {
        this.id_profedor = id_profedor;
        this.id_area_tematica = id_area_tematica;
    }

    @Override
    public String toString() {
        return "Especialidad{" + "id_profedor=" + getId_profedor() + ", id_area_tematica=" + getId_area_tematica() + '}';
    }
    private int id_profedor;
    private int id_area_tematica;
}
