package polimorfismo;

import polimorfismo.Apps.Facebook;
import polimorfismo.Apps.MSNMenssenger;
import polimorfismo.Apps.ServicoMenssagemInstantanea;
import polimorfismo.Apps.Telegram;

public class ComputadorPedrinho {
    public static void main(String[] args) {
    ServicoMenssagemInstantanea smi = null;
    /*
     * Não se Sabe Qual APP
     * Mas Qualquer um Deverá Enviar e Receber Menssagem
     */
    String appEscolhido="fcb";

    if(appEscolhido.equals("msn"))
        smi = new MSNMenssenger();
    else if(appEscolhido.equals("fcb"))
        smi = new Facebook();
    else if(appEscolhido.equals("tlg"))
        smi = new Telegram();

    smi.enviarMensagem();
    smi.receberMensagem();
   }


}