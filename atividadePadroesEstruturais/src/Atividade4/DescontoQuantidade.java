/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Atividade4;

/**
 *
 * @author usuario
 */
public class DescontoQuantidade implements EstrategiaDesconto {
    private int quantidade;

    public DescontoQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    @Override
    public double calcularDesconto(double valor) {
        if (quantidade > 10) {
            return valor * 0.10; // 10% de desconto para mais de 10 itens
        }
        return 0; // Sem desconto se a quantidade for menor ou igual a 10
    }
}
