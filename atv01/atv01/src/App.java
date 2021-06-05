import pacote01.classNome;
import pacote01.classNotas;
public class App {
    public static void main(String[] args) throws Exception {
        classNome nome = new classNome("Fábio", "Souza", 21);
        classNotas notas = new classNotas(8, 9);
        System.out.println(nome.getNome());
        System.out.println(nome.getSobrenome());
        System.out.println(nome.getIdade());
        System.out.println("A media foi " + notas.getMedia());
    }
}
