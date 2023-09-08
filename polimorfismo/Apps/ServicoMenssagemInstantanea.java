package polimorfismo.Apps;

public abstract class ServicoMenssagemInstantanea {
    public abstract void enviarMensagem();
    public abstract void receberMensagem();

    //Somente os filhos conhecem este método
    protected void validarConectadoInternet(){
        System.out.println("Validando se está conectado a internet");
    }
    
}
