package abstracao;

public class Facebook extends ServicoMensagemInstantanea {
    public void enviarMensagem() {
        System.out.println("Enviando Menssagem pelo Facebook Menssenger");
    }
    public void receberMensagem() {
        System.out.println("Recebendo Messagem pelo Facebook Menssenger");
    }
    
}
