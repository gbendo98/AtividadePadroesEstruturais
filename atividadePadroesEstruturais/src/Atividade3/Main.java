/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Atividade3;

/**
 *
 * @author usuario
 */
public class Main {
    public static void main(String[] args) {
       
        Noticia noticia = new Noticia();

        
        Leitor leitor1 = new Leitor("Ana");
        Leitor leitor2 = new Leitor("Carlos");
        Jornalista jornalista1 = new Jornalista("Paulo");

        
        noticia.adicionarObservador(leitor1);
        noticia.adicionarObservador(leitor2);
        noticia.adicionarObservador(jornalista1);

       
        noticia.publicarNoticia("Eleições 2024: Candidatos debatem propostas.");

        
        noticia.removerObservador(leitor2);
        noticia.publicarNoticia("Tecnologia 2024: Avanços na Inteligência Artificial.");
    }
}

