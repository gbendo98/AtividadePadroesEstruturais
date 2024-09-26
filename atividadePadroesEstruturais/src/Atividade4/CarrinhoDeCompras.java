/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Atividade4;

/**
 *
 * @author usuario
 */
public class CarrinhoDeCompras {
    private double valorTotal;
    private EstrategiaDesconto estrategiaDesconto;

    public CarrinhoDeCompras(double valorTotal) {
        this.valorTotal = valorTotal;
    }

    public void definirEstrategiaDesconto(EstrategiaDesconto estrategiaDesconto) {
        this.estrategiaDesconto = estrategiaDesconto;
    }

    public double calcularValorFinal() {
        if (estrategiaDesconto != null) {
            double desconto = estrategiaDesconto.calcularDesconto(valorTotal);
            return valorTotal - desconto;
        }
        return valorTotal; 
    }
}

