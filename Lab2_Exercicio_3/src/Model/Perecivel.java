/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author Neto Barboza
 */
public class Perecivel extends Produto{
    private int Validade;
    
    public Perecivel(){
        
    }
    
    public Perecivel(String Nome, int Codigo, double Valor, int Validade){
        setNome(Nome);
        setPreco(Codigo);
        setValor(Valor);
        setValidade(Validade);
        //
        CalculaPreco(getPreco());
    }
    
    public int getValidade() {
        return Validade;
    }

    public void setValidade(int Validade) {
        this.Validade = Validade;
    }    
    
    public double CalculaPreco(double Preco){
        setPreco(1.4 * getValor());
        return Preco;
    }
}
