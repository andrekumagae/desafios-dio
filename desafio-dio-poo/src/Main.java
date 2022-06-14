import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("curso java");
        curso1.setDescricao("descrição curso java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("curso js");
        curso2.setDescricao("descrição curso js");
        curso2.setCargaHoraria(4);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("mentoria de java");
        mentoria.setDescricao("descrição mentoria de java");
        mentoria.setData(LocalDate.now());

/*        System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria);*/

        Bootcamp bootcampGftQa = new Bootcamp();
        bootcampGftQa.setNome("Bootcamp GFT Quality Assurance #1");
        bootcampGftQa.setDescricao("Bootcamp que vai deixar o meu primeiro emprego mais próximo!");
        bootcampGftQa.getConteudos().add(curso1);
        bootcampGftQa.getConteudos().add(curso2);
        bootcampGftQa.getConteudos().add(mentoria);

        Dev devAndre = new Dev();
        devAndre.setNome("André");
        devAndre.inscreverBootcamp(bootcampGftQa);
        System.out.println("Conteúdos inscritos de " + devAndre.getNome() + ": " + devAndre.getConteudosInscritos());
        devAndre.progredir();
        devAndre.progredir();
        devAndre.progredir();
        System.out.println("Conteúdos inscritos de " + devAndre.getNome() + ": " + devAndre.getConteudosInscritos());
        System.out.println("Conteúdos concluídos de " + devAndre.getNome() + ": " + devAndre.getConteudosConcluidos());
        System.out.println("XP: " + devAndre.calcularTotalXp());
        System.out.println("-----");
        Dev devJoao = new Dev();
        devJoao.setNome("Joao");
        devJoao.inscreverBootcamp(bootcampGftQa);
        System.out.println("Conteúdos inscritos de " + devJoao.getNome() + ": " + devAndre.getConteudosInscritos());
        devJoao.progredir();
        devJoao.progredir();
        devJoao.progredir();
        devJoao.progredir();
        System.out.println("Conteúdos inscritos de " + devJoao.getNome() + ": " + devAndre.getConteudosInscritos());
        System.out.println("Conteúdos concluídos de " + devJoao.getNome() + ": " + devJoao.getConteudosConcluidos());
        System.out.println("XP: " + devJoao.calcularTotalXp());

    }
}
