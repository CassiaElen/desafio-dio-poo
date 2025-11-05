import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("Curso de java");
        curso1.setDescricao("Descrição do curso de java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("Curso dart");
        curso2.setDescricao("Descrição curso de dart");
        curso2.setCargaHoraria(6);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria java");
        mentoria.setDescricao("Descrição mentoria java");
        mentoria.setData(LocalDate.now());

        System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria);

        Bootcamp bootcamp =  new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);


        Dev devArnalda = new Dev();
        devArnalda.setNome("Arnalda");
        devArnalda.inscreverBootcamp(bootcamp);
        System.out.println("-------------------------- " + devArnalda.getNome() +" --------------------------");
        System.out.println("Conteúdos inscritos Arnalda: " + devArnalda.getConteudosInscritos() +"\n");
        devArnalda.progredir();
        System.out.println("Conteúdos inscritos Arnalda: " + devArnalda.getConteudosInscritos());
        System.out.println("Conteúdos concluídos  Arnalda: " + devArnalda.getConteudosConcluidos());
        System.out.println("XP: "+ devArnalda.calcularTotalXp());

        Dev devConrado = new Dev();
        devConrado.setNome("Conrado");
        System.out.println("-------------------------- " + devConrado.getNome() + " --------------------------");
        devConrado.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos inscritos Conrado: " + devConrado.getConteudosInscritos()+"\n");
        devConrado.progredir();
        devConrado.progredir();
        devConrado.progredir();
        System.out.println("Conteúdos inscritos Conrado: " + devConrado.getConteudosInscritos());
        System.out.println("Conteúdos concluídos Conrado: " + devArnalda.getConteudosConcluidos());
        System.out.println("XP: "+ devConrado.calcularTotalXp());



    }
}