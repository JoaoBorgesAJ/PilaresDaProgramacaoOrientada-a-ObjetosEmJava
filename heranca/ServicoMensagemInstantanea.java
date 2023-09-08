package heranca;

// A classe MSNMensseger é ou representa

public class ServicoMensagemInstantanea {
    public void enviarMensagem(){
        //Primeiro confirmar se está conectado a internet
        validarConectadoInternet();
        System.out.println("Enviando Menssagem");
        //Depois de enviada, salvar o historico da mensagem
        salvarHistoricoMenssagem();        
    }
    public void receberMensagem(){
        System.out.println("Recebendo Mensagem");
    }
    //Métodos privadas, visíveis somente na classe
    private void validarConectadoInternet(){
        System.out.println("Validando se está conectado a internet");
    }
    private void salvarHistoricoMenssagem(){
        System.out.println("Salvando o historico da mensagem");
    }
}