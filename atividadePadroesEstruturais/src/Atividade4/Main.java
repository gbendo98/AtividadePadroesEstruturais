/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Atividade4;

/**
 *
 * @author usuario
 */
public class Main {
    public static void main(String[] args) {
        // Cria um carrinho de compras com o valor total de R$1000
        CarrinhoDeCompras carrinho = new CarrinhoDeCompras(1000.00);

        // Desconto por Quantidade
        carrinho.definirEstrategiaDesconto(new DescontoQuantidade(12));
        System.out.println("Valor final com Desconto por Quantidade: R$" + carrinho.calcularValorFinal());

        // Desconto de Temporada
        carrinho.definirEstrategiaDesconto(new DescontoTemporada());
        System.out.println("Valor final com Desconto de Temporada: R$" + carrinho.calcularValorFinal());

        //Desconto de Membro VIP
        carrinho.definirEstrategiaDesconto(new DescontoMembroVIP());
        System.out.println("Valor final com Desconto de Membro VIP: R$" + carrinho.calcularValorFinal());
    }
}

