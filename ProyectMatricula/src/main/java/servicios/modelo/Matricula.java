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
public class Matricula {

    /**
     * @return the id_estudiante
     */
    public int getId_estudiante() {
        return id_estudiante;
    }

    /**
     * @param id_estudiante the id_estudiante to set
     */
    public void setId_estudiante(int id_estudiante) {
        this.id_estudiante = id_estudiante;
    }

    /**
     * @return the num_grupo
     */
    public int getNum_grupo() {
        return num_grupo;
    }

    /**
     * @param num_grupo the num_grupo to set
     */
    public void setNum_grupo(int num_grupo) {
        this.num_grupo = num_grupo;
    }

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
     * @return the id_estado
     */
    public int getId_estado() {
        return id_estado;
    }

    /**
     * @param id_estado the id_estado to set
     */
    public void setId_estado(int id_estado) {
        this.id_estado = id_estado;
    }

    /**
     * @return the nota
     */
    public int getNota() {
        return nota;
    }

    /**
     * @param nota the nota to set
     */
    public void setNota(int nota) {
        this.nota = nota;
    }

    public Matricula(int id_estudiante, int num_grupo, int id_curso, int id_estado, int nota) {
        this.id_estudiante = id_estudiante;
        this.num_grupo = num_grupo;
        this.id_curso = id_curso;
        this.id_estado = id_estado;
        this.nota = nota;
    }

    @Override
    public String toString() {
        return "Matricula{" + "id_estudiante=" + getId_estudiante() + ", num_grupo=" + getNum_grupo() + ", id_curso=" + getId_curso() + ", id_estado=" + getId_estado() + ", nota=" + getNota() + '}';
    }
    private int id_estudiante;
    private int num_grupo;
    private int id_curso;
    private int id_estado;
    private int nota;
}
