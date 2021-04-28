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
public class Curso {

    /**
     * @return the id_curso
     */
    public int getId_curso() {
        return id_curso;
    }

    /**
     * @param id_curso the id_curso to set
     */
    public void setId_curso(int id_curso) {
        this.id_curso = id_curso;
    }

    /**
     * @return the descripcion
     */
    public String getDescripcion() {
        return descripcion;
    }

    /**
     * @param descripcion the descripcion to set
     */
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
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

    public Curso(int id_curso, String descripcion, int id_area_tematica) {
        this.id_curso = id_curso;
        this.descripcion = descripcion;
        this.id_area_tematica = id_area_tematica;
    }

    @Override
    public String toString() {
        return "Curso{" + "id_curso=" + getId_curso() + ", descripcion=" + getDescripcion() + ", id_area_tematica=" + getId_area_tematica() + '}';
    }
    private int id_curso;
    private String descripcion;
    private int id_area_tematica;
}
