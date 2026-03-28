package com.reader_csv;

import java.io.FileReader;
import java.io.IOException;
import java.util.List;
import com.opencsv.bean.CsvToBeanBuilder;
import com.opencsv.exceptions.CsvException;

public class Main {
    public static void main(String[] args) throws IOException, CsvException {
        
        String fileName = "/home/derk/Downloads/engenharia de dados/leitor_csv/src/main/resources/dis-csv-discentes-de-graduacao-de-2025_1.csv";
                                                // csvtobeanBuilder - faz a transcrição e acopla cada atributo da linha em determinada coluna setada no nosso Discente 
        List<Discente> listaDiscentesBeans = new CsvToBeanBuilder<Discente>(new FileReader(fileName)) // faz diversas instancias com os determinados valores e salva eles no nosso array
                        .withType(Discente.class)
                        .withSkipLines(1).build().parse();
        //listaDiscentesBeans.forEach(System.out::println);

        System.out.println(ReadFileCSV.pesquisaDiscentesPorNome(listaDiscentesBeans, "dereK Marques Almeida"));
        System.out.println("-------------------------------");
        List<Discente> save =  ReadFileCSV.pesquisaDiscentesPorCurso(listaDiscentesBeans, "computação");
        //System.out.println("-------------------------------");
        ReadFileCSV.salvarEmTxt( save, ReadFileCSV.arquivo_de_escrita); 

        
        }
    
}