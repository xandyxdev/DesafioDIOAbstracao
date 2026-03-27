import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Devs;
import br.com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso c1 = new Curso("test", "descricao", 80);
        System.out.println(c1);
        Mentoria m1 = new Mentoria("test2","descricao2", LocalDate.now());
        System.out.println(m1);

        Bootcamp bootcamp1 = new Bootcamp();

        bootcamp1.getConteudos().add(m1);
        bootcamp1.getConteudos().add(c1);

        Devs alexandre = new Devs();

        alexandre.inscreverBootcamp(bootcamp1);
        System.out.println("Conteúdos Inscritos Alexandre:" + alexandre.getConteudosInscritos());
        alexandre.progredir();
        System.out.println("Conteúdos Inscritos Alexandre:" + alexandre.getConteudosInscritos());
        System.out.println("Conteúdos Inscritos Alexandre:" + alexandre.getConteudosConcluidos());
        System.out.println("XP:" + alexandre.calcularTotalXp());


    }
}
