/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Atividade2;

/**
 *
 * @author usuario
 */
public class BibliotecaFacade {
    private CatalogoDeLivros catalogoDeLivros;
    private RegistroDeUsuarios registroDeUsuarios;
    private GerenciamentoDeEmprestimos gerenciamentoDeEmprestimos;
    private Notificacoes notificacoes;

    public BibliotecaFacade() {
        this.catalogoDeLivros = new CatalogoDeLivros();
        this.registroDeUsuarios = new RegistroDeUsuarios();
        this.gerenciamentoDeEmprestimos = new GerenciamentoDeEmprestimos();
        this.notificacoes = new Notificacoes();
    }

    public void emprestarLivro(String codigoLivro, String idUsuario) {
        String livro = catalogoDeLivros.buscarLivro(codigoLivro);
        if (livro != null) {
            gerenciamentoDeEmprestimos.registrarEmprestimo(codigoLivro, idUsuario);
            notificacoes.enviarNotificacao(idUsuario, "Você pegou emprestado o livro: " + livro);
        } else {
            System.out.println("Livro não encontrado no catálogo.");
        }
    }

    public void registrarUsuario(String id, String nome) {
        registroDeUsuarios.registrarUsuario(id, nome);
    }

    public void devolverLivro(String codigoLivro) {
        gerenciamentoDeEmprestimos.registrarDevolucao(codigoLivro);
        System.out.println("Livro devolvido com sucesso.");
    }

    public void adicionarLivroAoCatalogo(String codigo, String titulo) {
        catalogoDeLivros.adicionarLivro(codigo, titulo);
    }
}

