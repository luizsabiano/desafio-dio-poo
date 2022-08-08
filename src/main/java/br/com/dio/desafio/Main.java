package br.com.dio.desafio;

import br.com.dio.desafio.dominio.*;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        Curso curso1 = new Curso();
        Curso curso2 = new Curso();
        Mentoria mentoria = new Mentoria();

        curso1.setTitulo("Curso Java");
        curso1.setDescricao("Curso de programação intermediário utilizando linguagem Java");
        curso1.setCargaHoraria(8);


        curso2.setTitulo("Curso Js");
        curso2.setDescricao("Curso de programação intermediário utilizando linguagem Js");
        curso2.setCargaHoraria(4);

        mentoria.setTitulo("Mentoria Java");
        mentoria.setDescricao("Descricao Mentoria Java");
        mentoria.setData(LocalDate.now());


        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descricao Bootcampo Java Developer");
        bootcamp.setConteudos(curso1);
        bootcamp.setConteudos(curso2);
        bootcamp.setConteudos(mentoria);

        Dev devCamila = new Dev();
        devCamila.setNome("Camila Cavalcante");
        devCamila.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos: " + devCamila.getConteudosInscritos());
        devCamila.progredir();
        devCamila.progredir();
        System.out.println("Conteúdos Inscritos2: " + devCamila.getConteudosInscritos());
        System.out.println("Conteúdos Concluidos: " + devCamila.getConteudosConcluidos());
        System.out.println("XP: " + devCamila.calcularTotalXP());

        System.out.println();
        System.out.println("-----------------------------------------------");
        System.out.println();

        Dev devLuizSabiano = new Dev();
        devLuizSabiano.setNome("Luiz Sabiano");
        devLuizSabiano.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos: " + devLuizSabiano.getConteudosInscritos());
        devLuizSabiano.progredir();
        System.out.println("Conteúdos Inscritos2: " + devLuizSabiano.getConteudosInscritos());
        System.out.println("Conteúdos Concluidos: " + devLuizSabiano.getConteudosConcluidos());
        System.out.println("XP: " + devLuizSabiano.calcularTotalXP());



    }
}