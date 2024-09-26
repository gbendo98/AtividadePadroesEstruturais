/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Atividade3;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author usuario
 */
public class Noticia {
    private List<Observer> observadores;
    private String conteudo;

    public Noticia() {
        observadores = new ArrayList<>();
    }

    public void adicionarObservador(Observer observador) {
        observadores.add(observador);
    }

    public void removerObservador(Observer observador) {
        observadores.remove(observador);
    }

    public void notificarObservadores() {
        for (Observer observador : observadores) {
            observador.atualizar(conteudo);
        }
    }

    public void publicarNoticia(String conteudo) {
        this.conteudo = conteudo;
        System.out.println("Nova notícia publicada: " + conteudo);
        notificarObservadores();
    }
}
