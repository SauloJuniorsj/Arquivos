/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.github.saulojr.arquivos;

/**
 *
 * @author Saulo Jr
 */
public class Pessoa {
    
    private String nome;
    private int id;
    private String rg;
    private String email;

    public Pessoa(String nome, int id, String rg, String email) {
        this.nome = nome;
        this.id = id;
        this.rg = rg;
        this.email = email;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
    @Override
     public String toString(){
         StringBuilder recebe = new StringBuilder();
         recebe.append(getNome() + ",");
         recebe.append(getRg() + ",");
         recebe.append(getEmail() + "\n");
         return recebe.toString();
     }
    
}
