/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Atividade1;

/**
 *
 * @author usuario
 */
public class Main {
    public static void main(String[] args) {
        
        Notificacao notificacaoEmail = new EmailNotificacao();

        
        Notificacao notificacaoEmailCriptografada = new CriptografiaDecorator(notificacaoEmail);

  
        Notificacao notificacaoCompleta = new LogAuditoriaDecorator(notificacaoEmailCriptografada);

    
        notificacaoCompleta.enviar("Olá, esta é uma mensagem importante!");

     
        Notificacao notificacaoSms = new SMSNotificacao();
        Notificacao notificacaoSmsComLog = new LogAuditoriaDecorator(notificacaoSms);
        notificacaoSmsComLog.enviar("Seu código é 123456");
    }
}

