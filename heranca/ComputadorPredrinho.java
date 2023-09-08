package heranca;

public class ComputadorPredrinho {
    public static void main(String[] args) {
        System.out.println("MSN");
        MSNMensseger msn = new MSNMensseger();
        msn.enviarMensagem();
        msn.receberMensagem();

        System.out.println("Facebook");

        Facebook fcb = new Facebook();
        fcb.enviarMensagem();
        fcb.receberMensagem();

        System.out.println("Telegram");

        Telegram tlg = new Telegram();
        tlg.enviarMensagem();
        tlg.receberMensagem();
        
    }
}
