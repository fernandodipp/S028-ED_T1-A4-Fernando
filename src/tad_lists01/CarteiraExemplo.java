package tad_lists01;

import net.datastructures.*;
import CreditCards.*;

public class CarteiraExemplo {
    
    private SinglyLinkedList<CreditCardGratuito> wallet;
    
    public CarteiraExemplo() {
        wallet = new SinglyLinkedList<CreditCardGratuito>();
    }
    
    public void AdicionarCartao(String nome, String banco, String conta) {
        wallet.addLast(new CreditCardGratuito(nome, banco, conta));
    }
    
    public CreditCardGratuito ObterCartao() {
        return wallet.last();
    }
    
    public void RemoverCartao() {
        wallet.removeFirst();
    }
    
    public void MostrarCarteira() {
        System.out.println(wallet);
    }
    
    
    
}