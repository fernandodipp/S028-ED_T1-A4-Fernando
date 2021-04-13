package ativ04t1;

// import com.sun.javafx.image.impl.IntArgb;
import net.datastructures.*;
import CreditCards.*;
import ativ04t1.*;
/**
 *
 * @author brandg
 */
public class Carteira {
    private DoublyLinkedList<Cliente> contas;
    
    public Carteira() {
        //TODO: inicializar a lista contas
    	contas = new DoublyLinkedList<Cliente>();
    }
    
    public void AdicionarConta(String nome, String cpf, String rg) {
        //TODO: adicionar um novo Cliente na lista contas.
        //      veja a assinatura dos métodos construtores da classe Cliente
    	contas.addLast(new Cliente(nome, cpf, rg));
    }
    
    public void RemoverConta() {
        //TODO: remover o primeiro ou ultimo cliente da lista de contas
    	contas.removeLast();
    	return;
    }
    
    public Cliente ObterConta() {
        //TODO: obter a primeira ou ultima posicao da lista contas (tipo Cliente)
        if (!contas.isEmpty()) {
            return (Cliente)contas.last();
        } 
        return null;
    }
        
    public void MostrarCarteira() {
        //TODO: imprimir toda a Carteira, incluindo as informações de cada Cliente e suas contas.
    	 System.out.println("\nSituação da carteira no momento:\n");
         if (contas.isEmpty()) {
             System.out.println("Carteira está vazia");}
         System.out.println(contas);            
    }

    // Exemplo de uso da classe Carteira    
    public static void main(String[] args) {

        Cliente c;
        Carteira contas = new Carteira();

        contas.AdicionarConta("Fernando", "7010801012", "123.456.789-00");
        c = contas.ObterConta();
        c.AdicionarCartao("Banrisul", "2000072103");
        c.AdicionarCartao("Inter", "99999999");
        c.AdicionarCartao("Nubank", "888888");

        contas.AdicionarConta("Juliano", "2222222222", "222.222.222-22");
        c = contas.ObterConta();
        c.AdicionarCartao("Itau", "5686785678578");
        c.AdicionarCartao("BB", "12342345456547");
        c.AdicionarCartao("Nubank", "346568789890");

        contas.AdicionarConta("Joao", "33333333", "333.333.333-33");
        c = contas.ObterConta();
        c.AdicionarCartao("Itau", "1231234234645");
        c.AdicionarCartao("BB", "23434645765");
        c.AdicionarCartao("Nubank", "132234435756");

        contas.MostrarCarteira();
    }
}
