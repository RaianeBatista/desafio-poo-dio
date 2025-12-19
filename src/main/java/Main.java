import br.com.dio.desafio.dominio.*;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("Curso Java");
        curso1.setDescricao("Descrição Curso java");
        curso1.setCargaHoraria(8);



        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria de Java");
        mentoria.setDescricao("Descrição mentoria de Java");
        mentoria.setData(LocalDate.now());

        Curso curso2 = new Curso();
        curso2.setTitulo("Curso JavaScript");
        curso2.setDescricao("Descrição Curso JavaScript");
        curso2.setCargaHoraria(4);

        Conteudo conteudo = new Curso(); // Polimorfismo


//        System.out.println(curso1);
//        System.out.println("================================");
//        System.out.println(curso2);
//        System.out.println("================================");
//        System.out.println(mentoria);


        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Accenture Java");
        bootcamp.setDescricao("Descrição Bootcamp Accenture Java");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);


        Dev devRaiane = new Dev();
        devRaiane.setNome("Raiane");
        devRaiane.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Raiane:\n" + devRaiane.getConteudosInscritos());
        devRaiane.progredir();
        devRaiane.progredir();
        System.out.println("====");
        System.out.println("Conteúdos Inscritos Raiane:\n" + devRaiane.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos Raiane:\n" + devRaiane.getConteudosConcluidos());
        System.out.println("XP: " + devRaiane.calcularTotalXp());


        System.out.println("============================================================");

        Dev devAnderson = new Dev();
        devAnderson.setNome("Anderson");
        devAnderson.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Anderson:\n" + devAnderson.getConteudosInscritos());
        devAnderson.progredir();
        devAnderson.progredir();
        devAnderson.progredir();
        System.out.println("====");
        System.out.println("Conteúdos Inscritos Anderson:\n" + devAnderson.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos Anderson:\n" + devAnderson.getConteudosConcluidos());
        System.out.println("XP: " + devAnderson.calcularTotalXp());



    }
}
