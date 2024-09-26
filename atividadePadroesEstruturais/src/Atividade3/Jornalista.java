/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Atividade3;

/**
 *
 * @author usuario
 */
public class Jornalista implements Observer {
    private String nome;

    public Jornalista(String nome) {
        this.nome = nome;
    }

    @Override
    public void atualizar(String conteudoNoticia) {
        System.out.println("Jornalista " + nome + " foi notificado sobre a nova notícia: " + conteudoNoticia);
    }
}
