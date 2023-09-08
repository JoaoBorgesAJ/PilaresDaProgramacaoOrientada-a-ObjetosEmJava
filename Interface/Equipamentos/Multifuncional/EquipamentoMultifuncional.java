package Interface.Equipamentos.Multifuncional;

import Interface.Equipamentos.Copiadora.Copiadora;
import Interface.Equipamentos.Digitalizadora.Digitalizadora;
import Interface.Equipamentos.Impressora.Impressora;

public class EquipamentoMultifuncional implements Copiadora, Digitalizadora, Impressora {
    public void copiar() {
        System.out.println("Copiando Via Equipamento Mutifuncional");
    }
    public void digitalizar() {
        System.out.println("Digirtalizando Via Equipamento Multifuncional");
    }
    public void imprimir() {
        System.out.println("Imprimindo Via Equipamento Multifuncional");
    }
    
}
