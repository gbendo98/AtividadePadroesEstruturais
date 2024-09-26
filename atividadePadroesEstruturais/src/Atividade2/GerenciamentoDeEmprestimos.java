import java.util.HashMap;
import java.util.Map;

public class GerenciamentoDeEmprestimos {
    private Map<String, String> emprestimos;

    public GerenciamentoDeEmprestimos() {
        emprestimos = new HashMap<>();
    }

    public void registrarEmprestimo(String codigoLivro, String idUsuario) {
        emprestimos.put(codigoLivro, idUsuario);
        System.out.println("Livro com código " + codigoLivro + " emprestado ao usuário " + idUsuario);
    }

    public void registrarDevolucao(String codigoLivro) {
        emprestimos.remove(codigoLivro);
        System.out.println("Livro com código " + codigoLivro + " devolvido.");
    }
}
