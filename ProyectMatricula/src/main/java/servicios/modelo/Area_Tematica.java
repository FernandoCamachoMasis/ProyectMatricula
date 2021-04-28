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
public class Area_Tematica {

    /**
     * @return the id_area
     */
    public int getId_area() {
        return id_area;
    }

    /**
     * @param id_area the id_area to set
     */
    public void setId_area(int id_area) {
        this.id_area = id_area;
    }

    /**
     * @return the descipcion
     */
    public String getDescipcion() {
        return descipcion;
    }

    /**
     * @param descipcion the descipcion to set
     */
    public void setDescipcion(String descipcion) {
        this.descipcion = descipcion;
    }

    public Area_Tematica(int id_area, String descipcion) {
        this.id_area = id_area;
        this.descipcion = descipcion;
    }

    @Override
    public String toString() {
        return "Area_Tematica{" + "id_area=" + getId_area() + ", descipcion=" + getDescipcion() + '}';
    }
    private int id_area;
    private String descipcion;
}
