import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso c1 = new Curso("test", "descricao", 80);
        System.out.println(c1);
        Mentoria m1 = new Mentoria("test2","descricao2", LocalDate.now());
        System.out.println(m1);
    }
}
