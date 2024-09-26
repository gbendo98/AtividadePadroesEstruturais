/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Atividade1;

/**
 *
 * @author usuario
 */
public class LogAuditoriaDecorator extends NotificacaoDecorator {

    public LogAuditoriaDecorator(Notificacao notificacao) {
        super(notificacao);
    }

    @Override
    public void enviar(String mensagem) {
        logAuditoria(mensagem);
        super.enviar(mensagem);
    }

    private void logAuditoria(String mensagem) {
        System.out.println("Log de auditoria: Enviando a mensagem -> " + mensagem);
    }
}