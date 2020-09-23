/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.github.saulojr.arquivos;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 *
 * @author Saulo Jr
 */
public class FileIO {

    public static void writer(List<Pessoa> pessoas, String nomeArquivo) throws IOException {
        FileWriter fileWriter = new FileWriter(nomeArquivo);

        try (BufferedWriter bufferedWriter = new BufferedWriter(fileWriter)) {
            List<String> dados = pessoas.stream().map(pessoa -> pessoa.toString()).collect(Collectors.toList());

            for (String linha : dados) {
                bufferedWriter.write(linha);
            }
        }

    }

    public static PessoaRepositorio reader(String nomeArquivo) throws IOException {

        PessoaRepositorio pessoas = new PessoaRepositorio();

        FileReader fileReader = new FileReader(nomeArquivo);

        try (BufferedReader reader = new BufferedReader(fileReader)) {
            String dado = "";
            while ((dado = reader.readLine()) != null) {
                int i = 0;
                String[] linha = dado.split(",");
                Pessoa p = new Pessoa(linha[0], i++, linha[1], linha[2]);
                pessoas.lista.add(p);
            }
        }

        return pessoas;
    }

}
