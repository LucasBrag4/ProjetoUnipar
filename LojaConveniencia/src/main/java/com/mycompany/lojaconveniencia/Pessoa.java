
package com.mycompany.lojaconveniencia;

import java.util.Date;


public class Pessoa {
    private int id_Pessoa;
    private int documento;
    private int inscricao_Estadual;
    private Date data_Cadastro;
    
    public String nome;
    public int CEP; 
    public String endereco; 
    public String num_Endereco; 
    public String cidade;
    public String estado;
    public char tipo_Cadastro;
    public String email;
    public String telefone;

    public Pessoa(int id_Pessoa, int documento, Date data_Cadastro, String nome, int CEP, String endereco, String cidade, String estado, char tipo_Cadastro) {
        this.id_Pessoa = id_Pessoa;
        this.documento = documento;
        this.data_Cadastro = data_Cadastro;
        this.nome = nome;
        this.CEP = CEP;
        this.endereco = endereco;
        this.cidade = cidade;
        this.estado = estado;
        this.tipo_Cadastro = tipo_Cadastro;
    }
    
    public int getId_Pessoa() {
        return id_Pessoa;
    }
    public void setId_Pessoa(int id_Pessoa) { 
        this.id_Pessoa = id_Pessoa;
    }  //o atributo so recebe valor atravez do set
       //define um valor a um atributo
       // retorna id Pessoa
    
    
    public int documento() {
        return documento;
    }
    public void setDocumento(int documento){
        this.documento = documento;
    }
    
    
    public int getinscricao_Estadual() {
        return inscricao_Estadual;
    }
    public void setinscricao_Estadual(int inscricao_Estadual) {
         this.inscricao_Estadual = inscricao_Estadual;
    }
    
    
    public Date getData_Cadastro(){
        return data_Cadastro;
    }
    public void setData_Cdastro(Date data_Cadastro){
        this.data_Cadastro = data_Cadastro;
    }
    
}

