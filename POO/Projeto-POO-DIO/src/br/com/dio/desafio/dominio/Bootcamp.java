package br.com.dio.desafio.dominio;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Set;

public class Bootcamp {
    private String nome;
    private String descriçao;
    private Object LocalDate;
    private final LocalDate dataInicial = java.time.LocalDate.now();

    private final LocalDate dataFinal = dataInicial.plusDays(45);
    private static Set<Dev> devsInscritos = new HashSet<>();
    private Set<Conteudo> conteudos = new LinkedHashSet<>();

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescriçao() {
        return descriçao;
    }

    public void setDescriçao(String descriçao) {
        this.descriçao = descriçao;
    }

    public Object getLocalDate() {
        return LocalDate;
    }

    public void setLocalDate(Object localDate) {
        LocalDate = localDate;
    }

    public java.time.LocalDate getDataInicial() {
        return dataInicial;
    }

    public java.time.LocalDate getDataFinal() {
        return dataFinal;
    }

    public static Set<Dev> getDevsInscritos() {
        return devsInscritos;
    }

    public void setDevsInscritos(Set<Dev> devsInscritos) {
        this.devsInscritos = devsInscritos;
    }

    public Set<Conteudo> getConteudos() {
        return conteudos;
    }

    public void setConteudos(Set<Conteudo> conteudos) {
        this.conteudos = conteudos;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Bootcamp bootcamp = (Bootcamp) o;
        return Objects.equals(nome, bootcamp.nome) && Objects.equals(descriçao, bootcamp.descriçao) && Objects.equals(LocalDate, bootcamp.LocalDate) && Objects.equals(dataInicial, bootcamp.dataInicial) && Objects.equals(dataFinal, bootcamp.dataFinal) && Objects.equals(devsInscritos, bootcamp.devsInscritos) && Objects.equals(conteudos, bootcamp.conteudos);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, descriçao, LocalDate, dataInicial, dataFinal, devsInscritos, conteudos);
    }

    private java.time.LocalDate now() {
        return null;
    }

}
