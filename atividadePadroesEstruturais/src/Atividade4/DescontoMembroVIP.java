/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Atividade4;

/**
 *
 * @author usuario
 */
public class DescontoMembroVIP implements EstrategiaDesconto {
    @Override
    public double calcularDesconto(double valor) {
        return valor * 0.15; // 15% de desconto para membros VIP
    }
}

