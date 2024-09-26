/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Atividade5;

/**
 *
 * @author usuario
 */
public class Main {
    public static void main(String[] args) {
        
        Sanduiche sanduicheBasico = new Sanduiche.SanduicheBuilder("Pão Branco")
                                    .carne("Presunto")
                                    .queijo("Queijo Prato")
                                    .build();

        System.out.println(sanduicheBasico);

   
        Sanduiche sanduicheComplexo = new Sanduiche.SanduicheBuilder("Pão Integral")
                                    .carne("Peito de Frango")
                                    .queijo("Queijo Cheddar")
                                    .alface(true)
                                    .tomate(true)
                                    .molho("Molho de Mostarda")
                                    .build();

        System.out.println(sanduicheComplexo);

        
        Sanduiche sanduicheVegetariano = new Sanduiche.SanduicheBuilder("Pão Integral")
                                    .queijo("Queijo Suíço")
                                    .alface(true)
                                    .tomate(true)
                                    .molho("Molho de Ervas")
                                    .build();

        System.out.println(sanduicheVegetariano);
    }
}
