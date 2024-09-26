/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Atividade1;

/**
 *
 * @author usuario
 */
public class CriptografiaDecorator extends NotificacaoDecorator {

    public CriptografiaDecorator(Notificacao notificacao) {
        super(notificacao);
    }

    @Override
    public void enviar(String mensagem) {
        String mensagemCriptografada = criptografar(mensagem);
        super.enviar(mensagemCriptografada);
    }

    private String criptografar(String mensagem) {
        // Simulação de criptografia simples (inverter a string)
        return new StringBuilder(mensagem).reverse().toString();
    }
}
