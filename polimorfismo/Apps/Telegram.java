package polimorfismo.Apps;

public class Telegram extends ServicoMenssagemInstantanea {
    public void enviarMensagem() {
        validarConectadoInternet();
        System.out.println("Envidndo menssagem pelo Telegram");
    }
    public void receberMensagem() {
        System.out.println("Recebendo menssagem pelo Telegram");
    }
    
}
