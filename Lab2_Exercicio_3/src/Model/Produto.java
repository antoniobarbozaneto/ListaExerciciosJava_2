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
public class Produto {
    private String Nome;
    private int Codigo;
    private double Preco;
    private double Valor;
    
    
    public Produto(){
        
    }
    
    public Produto(String Nome,int Codigo, double Valor){
        this.Nome = Nome;
        this.Codigo = Codigo;
        this.Valor = Valor;
        //
        setPreco(1.2*getValor()); //Calculando o valor Final
    }

    public String getNome() {
        return Nome;
    }

    public void setNome(String Nome) {
        this.Nome = Nome;
    }

    public int getCodigo() {
        return Codigo;
    }

    public void setCodigo(int Codigo) {
        this.Codigo = Codigo;
    }

    public double getPreco() {
        return Preco;
    }

    public void setPreco(double Preco) {
        this.Preco = Preco;
    }

    public double getValor() {
        return Valor;
    }

    public void setValor(double Valor) {
        this.Valor = Valor;
    }
    
    public double CalculaPreco(double Valor ) {
        setPreco(1.2 * getValor());
        return Preco;
    }
}