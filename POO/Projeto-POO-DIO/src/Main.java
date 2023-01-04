import br.com.dio.desafio.dominio.*;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTítulo("curso java");
        curso1.setDescrição("descrição curso java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTítulo("curso js");
        curso2.setDescrição("descrição curso js");
        curso2.setCargaHoraria(4);

        Mentoria mentoria = new Mentoria();
        mentoria.setTítulo("mentoria de java");
        mentoria.setDescrição("descrição mentoria java");
        mentoria.setData(LocalDate.now());

        /*System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria);*/

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescriçao("Descrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devDaiany = new Dev();
        devDaiany.setNome("Daiany");
        devDaiany.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Daiany:"+ devDaiany.getConteudosInscritos());
        devDaiany.progredir();
        devDaiany.progredir();
        System.out.println("_");
        System.out.println("Conteúdos Inscritos Daiany:" + devDaiany.getConteudosInscritos());
        System.out.println("Conteúdos Concluidos Daiany:" + devDaiany.getConteudosConcluidos());
        System.out.println("XP:" + devDaiany.calcularTotalXp());

        System.out.println(".....");

        Dev devMatheus = new Dev();
        devMatheus.setNome("Matheus");
        devMatheus.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Matheus:" + devMatheus.getConteudosInscritos());
        devMatheus.progredir();
        devMatheus.progredir();
        devMatheus.progredir();
        System.out.println("_");
        System.out.println("Conteúdos Inscritos Matheus:" + devMatheus.getConteudosInscritos());
        System.out.println("Conteúdos Concluidos Matheus:" + devMatheus.getConteudosConcluidos());
        System.out.println("XP:" + devMatheus.calcularTotalXp());


        }
    }
