/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.github.saulojr.arquivos;

import java.io.IOException;

/**
 *
 * @author Saulo Jr
 */
public class ComGithubSauloJrArquivos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        PessoaRepositorio rep = new PessoaRepositorio();
        
        Pessoa p1 = new Pessoa("Saulo",0, "123456798","teste@gmail.com");
        Pessoa p2 = new Pessoa("Alberto",1, "987654321","novo@gmail.com");
        
         rep.lista.add(p1);
         rep.lista.add(p2);
         
         try{
             //FileIO.writer(rep.lista, "TestePessoas.txt");
             PessoaRepositorio rep2 = FileIO.reader("TestePessoas.txt");
             System.out.println(rep2.lista);
         } catch(IOException e){
             e.printStackTrace();
         }

    }
    
}
