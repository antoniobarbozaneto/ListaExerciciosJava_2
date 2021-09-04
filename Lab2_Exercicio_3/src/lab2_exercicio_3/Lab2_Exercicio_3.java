/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab2_exercicio_3;

import Model.Perecivel;
import Model.Produto;
import javax.swing.JOptionPane;

/**
 *
 * @author Neto Barboza
 */
public class Lab2_Exercicio_3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Perecivel perecivel = new Perecivel();

        perecivel.setNome(JOptionPane.showInputDialog("Digite o nome do produto: "));
        perecivel.setCodigo(Integer.parseInt(JOptionPane.showInputDialog("Digite o código do produto: ")));
        perecivel.setValor(Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do produto: ")));
        perecivel.setValidade(Integer.parseInt(JOptionPane.showInputDialog("Digite a validade do produto: ")));
        perecivel.CalculaPreco(perecivel.getPreco());

        JOptionPane.showMessageDialog(null, "Nome do produto: " + perecivel.getNome()
                + "\n" + "Código do produto: " + perecivel.getCodigo()
                + "\n" + "Preço final do produto: " + perecivel.getPreco()
                + "\n" + "A validade do produto é: " + perecivel.getValidade());
        //
        Perecivel perecive2 = new Perecivel("Feijão", 10, 20.00,10052021); //Passando direto pro construtor os dados
        JOptionPane.showMessageDialog(null, "Nome do produto: " + perecive2.getNome()
                + "\n" + "Código do produto: " + perecive2.getCodigo()
                + "\n" + "Preço final do produto: " + perecive2.getPreco()
                + "\n" + "A validade do produto é: " + perecive2.getValidade());
    }
}
