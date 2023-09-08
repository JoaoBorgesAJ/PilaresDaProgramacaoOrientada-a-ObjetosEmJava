package encapsulamento;

public class MSNMenssenger {
    public void enviarMensagem(){
        validarConectadoInternet();
        System.out.println("Enviando Menssagem");
        salvarHistoricoMenssagem();
    }
    public void receberMensagem(){
        System.out.println("Recebendo Menssagem");
    }
    private void validarConectadoInternet(){
        System.out.println("Validando se está chegando internet");
    }
    private void salvarHistoricoMenssagem(){
        System.out.println("Salvando o historico da mensagem");
    }
}
