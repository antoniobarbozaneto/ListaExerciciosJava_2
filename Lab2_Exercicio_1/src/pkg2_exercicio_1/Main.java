/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg2_exercicio_1;

import javax.annotation.processing.Messager;
import javax.swing.JOptionPane;

/**
 *
 * @author Neto Barboza
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Cliente cliente = new Cliente();

        cliente.setNome(JOptionPane.showInputDialog("Digite seu nome: "));
        cliente.setCpf(JOptionPane.showInputDialog("Digite seu cpf: "));
        cliente.setCodigo(Integer.parseInt(JOptionPane.showInputDialog("Digite seu código: ")));

        JOptionPane.showMessageDialog(null, "Nome: " + cliente.getNome() + "\n" + "Cpf: " + cliente.getCpf() + "\n" + "Código: " + cliente.getCodigo());
        
        //Passando direto para o construtor os dados
        Cliente cliente2 = new Cliente("Antonio","123.456.789-00",2);
        JOptionPane.showMessageDialog(null, "Nome: " + cliente2.getNome() + "\n" + "Cpf: " + cliente2.getCpf() + "\n" + "Código: " + cliente2.getCodigo());
        //
    }
}
