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
public class Grupo {

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
     * @return the id_profesor
     */
    public int getId_profesor() {
        return id_profesor;
    }

    /**
     * @param id_profesor the id_profesor to set
     */
    public void setId_profesor(int id_profesor) {
        this.id_profesor = id_profesor;
    }

    public Grupo(int num_grupo, int id_curso, int id_profesor) {
        this.num_grupo = num_grupo;
        this.id_curso = id_curso;
        this.id_profesor = id_profesor;
    }

    @Override
    public String toString() {
        return "Grupo{" + "num_grupo=" + getNum_grupo() + ", id_curso=" + getId_curso() + ", id_profesor=" + getId_profesor() + '}';
    }
    private int num_grupo;
    private int id_curso;
    private int id_profesor; 
}
