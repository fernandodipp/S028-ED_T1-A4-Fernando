package ativ04t1;

// import com.sun.javafx.image.impl.IntArgb;
import net.datastructures.*;
import CreditCards.*;
import tad_lists01.*;

/**
 *
 * @author brandg
 */
public class Cliente {
    String nome;
    String rg;
    String cpf;
    DoublyLinkedList<CreditCardGratuito> cartoes = new DoublyLinkedList<CreditCardGratuito>();

    // Construtores para inicializar os atributos, seja preenchidos ou vazios
    public Cliente(String str_nome, String doc_rg, String doc_cpf) {
        //TODO: inicializar todos os atributos
//    	str_nome = nome; doc_rg = rg; doc_cpf = cpf;
    	nome = str_nome;
    	rg = doc_rg;
    	cpf = doc_cpf;
    }
    

	public String getNome() {
		return nome;
	}


	public void setNome(String str_nome) {
		this.nome = str_nome;
	}


	public String getRg() {
		return rg;
	}


	public void setRg(String doc_rg) {
		this.rg = doc_rg;
	}


	public String getCpf() {
		return cpf;
	}


	public void setCpf(String doc_cpf) {
		this.cpf = doc_cpf;
	}


	public Cliente() {
        //TODO: inicializar somente a lista e o resto fica vazio
    	cartoes = new DoublyLinkedList();
    }
    
    // Adicionar o nome, rg e cpf do cliente, sem cartoes
    public void AdicionarCliente(String str_nome, String doc_rg, String doc_cpf) {
        //TODO: atribuir valores aos atributos de nome, rg e cpf caso estejam vazios
    	Cliente cliente = new Cliente(str_nome, doc_rg, doc_cpf);
    }

    public void AdicionarCartao(String banco, String conta) {
        //TODO: adicionar um cartao a lista de cartoes
    	cartoes.addLast(new CreditCardGratuito(nome, banco, conta));
    }
    
    public void RemoverCartao(String banco, String conta) {
        //TODO: remover o primeiro ou ultimo cartao da lista de cartoes (a escolha)
    	CreditCardGratuito cliente = (CreditCardGratuito)cartoes.removeLast();
    }
    
    public void MostrarCliente() {
        //TODO: imprimir as informações do cliente
    	System.out.println("\nSituação do cliente no momento:\n");
        if (cartoes.isEmpty()) {
            System.out.println("Lista de cartões está vazia");
            return;
        }

    }

    // Metodo toString esta pronto, retorna as informacoes do clinte em uma string.
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Nome: " + nome + ", RG: " + rg +", CPF: " + cpf + "\n");
        sb.append("Lista de cartoes:\n");
        sb.append(cartoes);
        sb.append("\n");
        
        return sb.toString();
    }
    
}