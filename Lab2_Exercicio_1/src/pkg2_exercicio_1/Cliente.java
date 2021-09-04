/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg2_exercicio_1;

/**
 *
 * @author Neto Barboza
 */
public class Cliente {

    private String Nome;
    private int Codigo;
    private String Cpf;

    Cliente() {// Construtor

    }

    Cliente(String Nome, String Cpf, int Codigo) {
        this.Nome = Nome;
        this.Cpf = Cpf;
        this.Codigo = Codigo;
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

    public String getCpf() {
        return Cpf;
    }

    public void setCpf(String Cpf) {
        this.Cpf = Cpf;
    }
}
