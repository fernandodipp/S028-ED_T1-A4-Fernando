/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tad_lists01;

// import com.sun.javafx.image.impl.IntArgb;
import net.datastructures.*;
import CreditCards.*;
import ativ04t1.Carteira;

/**
 *
 * @author brandg
 */
public class TAD_Lists01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // SinglyLinkedList<Integer> testsingle = new SinglyLinkedList<Integer>();
        // testsingle.addLast(3);
        // testsingle.addLast(2);
        // testsingle.addLast(1);
        // System.out.println(testsingle);
        
        // DoublyLinkedList<Double> testdouble = new DoublyLinkedList<Double>();
        // testdouble.addLast(1.0);
        // testdouble.addLast(2.0);
        // testdouble.addLast(3.0);
        // System.out.println(testdouble);
        
        // SinglyLinkedList<CreditCardGratuito> testCards;
        // testCards = new SinglyLinkedList<CreditCardGratuito>();
        // testCards.addLast(new CreditCardGratuito("Joao", "Itau", "34346756756"));
        // testCards.addLast(new CreditCardGratuito("Maria", "BB", "435767789768"));
        // testCards.addLast(new CreditCardGratuito("Gilberto", "CEF", "12335769"));
        // // System.out.println(testCards);
        // CreditCardGratuito primeiro = testCards.first();
        // CreditCardGratuito ultimo = testCards.last();
        // System.out.println(primeiro);
        // System.out.println(ultimo);
        
        
        
        
        
        // Possivel Resolucao da ativ03 to T1:
        CreditCardGratuito cartao;
        Carteira carteira = new Carteira();

        carteira.AdicionarCartao("Joao", "Itau", "34346756756");
        cartao = carteira.ObterCartao();
        cartao.charge(500);
        cartao.charge(300);
        cartao.charge(400);
        cartao.makePayment(200);
        cartao.printSummary();

        carteira.AdicionarCartao("Maria", "BB", "435767789768");
        cartao = carteira.ObterCartao();
        cartao.charge(400);
        cartao.charge(300);
        cartao.charge(400);
        cartao.makePayment(200);
        cartao.printSummary();

        carteira.AdicionarCartao("Gilberto", "CEF", "12335769");
        cartao = carteira.ObterCartao();
        cartao.charge(300);
        cartao.charge(300);
        cartao.charge(400);
        cartao.makePayment(200);
        cartao.printSummary();
        
        carteira.MostrarCarteira();
    
    }
}
