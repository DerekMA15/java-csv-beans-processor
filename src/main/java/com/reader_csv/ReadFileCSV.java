package com.reader_csv;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ReadFileCSV {

    static String arquivo_de_escrita = "/home/derk/Downloads/engenharia de dados/leitor_csv/src/main/resources/arquivo_de_escrita.txt"; 

    public static List<Discente>  pesquisaDiscentesPorNome(List<Discente> lista, String termo_Nome_Discente){
        List<Discente> resultados = new ArrayList<>(); // salvar os dados da pesquisa
            System.out.printf("Termo de pesquisa: %s\n", termo_Nome_Discente);
            System.out.println("Tamanho da lista original: " + lista.size()); // Ver se a lista não está vazia
            for (Discente discente : lista) {
                if (discente.getNome_discente().toUpperCase().contains(termo_Nome_Discente.toUpperCase())) {
                    resultados.add(discente);
                    }
                }
                return resultados;
                
            }

    public static List<Discente>  pesquisaDiscentesPorCurso(List<Discente> lista, String termo_Nome_do_Curso){
        List<Discente> resultados = new ArrayList<>(); // salvar os dados da pesquisa
            System.out.printf("Termo de pesquisa: %s\n", termo_Nome_do_Curso);
            System.out.println("Tamanho da lista original: " + lista.size()); // Ver se a lista não está vazia
            for (Discente cursoDiscente : lista) {
                if (cursoDiscente.getNome_curso().toUpperCase().contains(termo_Nome_do_Curso.toUpperCase())) {
                    resultados.add(cursoDiscente);
                    }
                }
                return resultados;
                
            }

    public static void salvarEmTxt(List<Discente> lista, String caminhoDestino) {
            try (BufferedWriter writer = new BufferedWriter(new FileWriter(caminhoDestino))) {
                for (Discente discente : lista) {
                    // Escreve os dados que você quer no TXT
                    writer.write("Mátricula: " + discente.getMatricula() + " - Nome: "+ discente.getNome_discente() + " - Ano Ingresso: " + discente.getAno_ingresso() + 
                    " - Periodo Ingreeso: " + discente.getAno_ingresso() + " - Periodo Ingresso: " + discente.getPeriodo_ingresso() + 
                    " - Status Discente: " + discente.getStatus_discente() + " - Nivel de Ensíno: " + discente.getNivel_ensino() + " - Nome do Curso: " 
                    + discente.getNome_curso() + " - Modalidade de Educação: " + discente.getModalidade_educacao() + " - Nome da Unidade: " 
                    + discente.getNome_unidade() + " - Nome da Unidade Gestora: " + discente.getNome_unidade_gestora()); // fficou enorme para escrever o nome dos alunos
                    writer.newLine(); // Pula para a próxima linha
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }  
}
