package polimorfismo.Apps;

public class MSNMenssenger extends ServicoMenssagemInstantanea {
    public void enviarMensagem() {
        validarConectadoInternet();
        System.out.println("Enviando menssagem pelo MSN Messenger");
    }
    public void receberMensagem() {
        System.out.println("Recebendo menssagem pelo MSN Mensseger");
    }
    
}
