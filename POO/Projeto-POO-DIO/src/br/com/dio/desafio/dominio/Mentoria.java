package br.com.dio.desafio.dominio;

import java.time.LocalDate;

public class Mentoria extends Conteudo {

    private LocalDate data;
    @Override
    public double calcularXp() {
        return 0;
    }
    public double Mentoria() {
        return XP_PADRAO + 20d;
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "Mentoria{" +
                "título='" + getTitulo() + '\'' +
                ", descrição='" + getDescrição() + '\'' +
                ", data=" + data +
                '}';
    }


    public void setTítulo(String mentoriaDeJava) {
    }
}
