/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Atividade2;

/**
 *
 * @author usuario
 */
public class Main {
    public static void main(String[] args) {
        BibliotecaFacade biblioteca = new BibliotecaFacade();

        
        biblioteca.adicionarLivroAoCatalogo("11223", "The Pragmatic Programmer");

     
        biblioteca.registrarUsuario("001", "João Silva");

       
        biblioteca.emprestarLivro("11223", "001");

        
        biblioteca.devolverLivro("11223");
    }
}
