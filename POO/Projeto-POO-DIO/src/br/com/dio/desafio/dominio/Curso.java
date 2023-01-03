package br.com.dio.desafio.dominio;

public class Curso {
    private String título;
   private String descrição;
   private int cargaHoraria;

    public Curso() {
    }

    public String getTítulo() {
        return título;
    }

    public void setTítulo(String título) {
        this.título = título;
    }

    public String getDescrição() {
        return descrição;
    }

    public void setDescrição(String descrição) {
        this.descrição = descrição;
    }

    public int getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    @Override
    public String toString() {
        return "Curso{" +
                "título='" + título + '\'' +
                ", descrição='" + descrição + '\'' +
                ", cargaHoraria=" + cargaHoraria +
                '}';
    }
}
