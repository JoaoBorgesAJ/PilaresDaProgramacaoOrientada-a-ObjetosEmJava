package polimorfismo.Apps ;

public class Facebook extends ServicoMenssagemInstantanea {
    public void enviarMensagem() {
        validarConectadoInternet();
        System.out.println("Enviando menssagem pelo Facebook");
    }
    public void receberMensagem() {
        System.out.println("Recebendo mensagem poelo Facebook");
    }
    
}
