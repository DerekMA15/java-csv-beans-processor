package com.reader_csv;

import com.opencsv.bean.CsvBindByPosition;

import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@Data
@NoArgsConstructor

// Lombok serve para deixar o código mais simples e menos extenso, criei todos os Getters,Setters e o contrutor onde todos atributos entram como args

public class Discente {

    /* matricula,nome_discente,ano_ingresso,periodo_ingresso,
    tipo_discente,status_discente,nivel_ensino,nome_curso,modalidade_educacao,
    nome_unidade,nome_unidade_gestora */

    @CsvBindByPosition(position = 0)
    String matricula;

    @CsvBindByPosition(position = 1)
    String nome_discente; 

    @CsvBindByPosition(position = 2)
    String ano_ingresso;

    @CsvBindByPosition(position = 3)
    int periodo_ingresso;

    @CsvBindByPosition(position = 4)
    String tipo_discente;

    @CsvBindByPosition(position = 5)
    String status_discente; // trocar pra boolean dps

    @CsvBindByPosition(position = 6)
    String nivel_ensino;

    @CsvBindByPosition(position = 7)
    String nome_curso;
    
    @CsvBindByPosition(position = 8)
    String modalidade_educacao;

    @CsvBindByPosition(position = 9)
    String nome_unidade;

    @CsvBindByPosition(position = 10)
    String nome_unidade_gestora;

}
