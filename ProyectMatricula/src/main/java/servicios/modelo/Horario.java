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
public class Horario {

    /**
     * @return the seq
     */
    public int getSeq() {
        return seq;
    }

    /**
     * @param seq the seq to set
     */
    public void setSeq(int seq) {
        this.seq = seq;
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
     * @return the grupo_curso
     */
    public int getGrupo_curso() {
        return grupo_curso;
    }

    /**
     * @param grupo_curso the grupo_curso to set
     */
    public void setGrupo_curso(int grupo_curso) {
        this.grupo_curso = grupo_curso;
    }

    /**
     * @return the dia
     */
    public int getDia() {
        return dia;
    }

    /**
     * @param dia the dia to set
     */
    public void setDia(int dia) {
        this.dia = dia;
    }

    /**
     * @return the hora
     */
    public int getHora() {
        return hora;
    }

    /**
     * @param hora the hora to set
     */
    public void setHora(int hora) {
        this.hora = hora;
    }

    public Horario(int seq, int num_grupo, int grupo_curso, int dia, int hora) {
        this.seq = seq;
        this.num_grupo = num_grupo;
        this.grupo_curso = grupo_curso;
        this.dia = dia;
        this.hora = hora;
    }

    @Override
    public String toString() {
        return "Horario{" + "seq=" + getSeq() + ", num_grupo=" + getNum_grupo() + ", grupo_curso=" + getGrupo_curso() + ", dia=" + getDia() + ", hora=" + getHora() + '}';
    }
    private int seq;
    private int num_grupo;
    private int grupo_curso;
    private int dia;
    private int hora;
}
