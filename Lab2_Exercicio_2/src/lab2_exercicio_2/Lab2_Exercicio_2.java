/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab2_exercicio_2;

import Model.Produto;
import javax.swing.JOptionPane;

/**
 *
 * @author Neto Barboza
 */
public class Lab2_Exercicio_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Produto produto = new Produto();
        
        produto.setNome(JOptionPane.showInputDialog("Digite o nome do produto: "));
        produto.setCodigo(Integer.parseInt(JOptionPane.showInputDialog("Digite o código do produto: ")));
        produto.setValor(Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do produto: ")));        
        produto.CalculaPreco(produto.getPreco());
        
       JOptionPane.showMessageDialog(null, "Nome do produto: " + produto.getNome() + "\n" + "Código do produto: " + produto.getCodigo() + "\n" + "Preço final do produto: " + produto.getPreco());
       //
       Produto produto2 = new Produto("Feijão",10,20.00); //Passando direto pro construtor os dados
       JOptionPane.showMessageDialog(null, "Nome do produto: " + produto2.getNome() + "\n" + "Código do produto: " + produto2.getCodigo() + "\n" + "Preço final do produto: " + produto2.getPreco());
       //
    }
}
