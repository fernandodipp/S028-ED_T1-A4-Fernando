package ativ04t1;

// import com.sun.javafx.image.impl.IntArgb;
import net.datastructures.*;
import CreditCards.*;
import ativ04t1.Cliente;
/**
 *
 * @author brandg
 */
public class Carteira {
    private DoublyLinkedList<Cliente> contas;
    
    public Carteira() {
        //TODO: inicializar a lista contas
    	contas = new DoublyLinkedList();
    }
    
    public void AdicionarConta(String nome, String cpf, String rg) {
        //TODO: adicionar um novo Cliente na lista contas.
        //      veja a assinatura dos métodos construtores da classe Cliente
    	contas.addLast(new Cliente(nome, cpf, rg));
    }
    
    public void RemoverConta() {
        //TODO: remover o primeiro ou ultimo cliente da lista de contas
    	contas.removeLast();
    }
    
    public Cliente ObterConta() {
        //TODO: obter a primeira ou ultima posicao da lista contas (tipo Cliente)
        if (!contas.isEmpty()) {
            return (Cliente)contas.first();
        } 
        return null;
    }
        
    public void MostrarCarteira() {
        //TODO: imprimir toda a Carteira, incluindo as informações de cada Cliente e suas contas.
    	 System.out.println("\nSituação da carteira no momento:\n");
         if (contas.isEmpty()) {
             System.out.println("Carteira está vazia");}
            
    }

    // Exemplo de uso da classe Carteira    
    public static void main(String[] args) {

        Cliente c;
        Carteira contas = new Carteira();

        contas.AdicionarConta("Joao", "111111111", "111.111.111-11");
        c = contas.ObterConta();
        c.AdicionarCartao("Itau", "34346756756");
        c.AdicionarCartao("BB", "13241234123424");
        c.AdicionarCartao("Nubank", "79789785674");

        contas.AdicionarConta("Maria", "2222222222", "222.222.222-22");
        c = contas.ObterConta();
        c.AdicionarCartao("Itau", "5686785678578");
        c.AdicionarCartao("BB", "12342345456547");
        c.AdicionarCartao("Nubank", "346568789890");

        contas.AdicionarConta("Gilberto", "33333333", "333.333.333-33");
        c = contas.ObterConta();
        c.AdicionarCartao("Itau", "1231234234645");
        c.AdicionarCartao("BB", "23434645765");
        c.AdicionarCartao("Nubank", "132234435756");

        contas.MostrarCarteira();
    }
}
