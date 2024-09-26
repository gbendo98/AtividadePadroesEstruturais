import java.util.HashMap;
import java.util.Map;

public class CatalogoDeLivros {
    private Map<String, String> livros;

    public CatalogoDeLivros() {
        livros = new HashMap<>();
        livros.put("12345", "Design Patterns: Elements of Reusable Object-Oriented Software");
        livros.put("67890", "Clean Code: A Handbook of Agile Software Craftsmanship");
    }

    public String buscarLivro(String codigo) {
        return livros.get(codigo);
    }

    public void adicionarLivro(String codigo, String titulo) {
        livros.put(codigo, titulo);
        System.out.println("Livro adicionado ao catálogo: " + titulo);
    }
}
