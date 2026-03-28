# Processamento de Dados Acadêmicos da UFS com Java e OpenCSV

Este projeto apresenta uma solução técnica para a leitura, mapeamento e filtragem de volumes de dados (5.000+ registros) provenientes de arquivos CSV. O foco do desenvolvimento foi aplicar conceitos de **Estrutura de Dados** e **I/O de Arquivos** em ambiente Java, garantindo a integridade dos dados e a eficiência na busca de informações em sistemas Linux (Ubuntu).

## Arquitetura e Implementação

A aplicação utiliza o padrão **Java Beans** para representar os registros de discentes da Universidade Federal de Sergipe (UFS). O mapeamento é realizado de forma declarativa através da biblioteca **OpenCSV**, permitindo que colunas específicas do arquivo bruto sejam convertidas diretamente em atributos de objetos na memória, otimizando o consumo de recursos.

### Principais Componentes

* **Leitura**: Implementada via `CsvToBeanBuilder` para garantir a conversão segura de tipos e tratamento automático de aspas e delimitadores.
* **Modelo de Dados**: Utilização de anotações `@CsvBindByPosition` para garantir a persistência da estrutura mesmo em caso de refatoração de nomes de variáveis.
* **Processamento**: Implementação de busca linear com normalização de strings para garantir a compatibilidade de busca entre diferentes encodings (UTF-8 e ISO-8859-1).
* **Escrita**: Módulo de exportação de resultados utilizando `BufferedWriter` e `FileWriter` para persistência eficiente em arquivos `.txt`.

## Referências Técnicas e Documentação

O desenvolvimento deste projeto foi fundamentado nas seguintes fontes de documentação e melhores práticas da comunidade Java:

* **Mapeamento de Beans com OpenCSV**: [GeeksforGeeks - Mapping CSV to JavaBeans](https://www.geeksforgeeks.org/java/mapping-csv-to-javabeans-using-opencsv/)
* **Guia Completo de Configuração OpenCSV**: [Baeldung - Guide to OpenCSV](https://www.baeldung.com/opencsv)
* **Parsing de Arquivos em Java**: [Mkyong - How to read and parse CSV](https://mkyong.com/java/how-to-read-and-parse-csv-file-in-java/)
* **Persistência e Escrita de Arquivos (Writer)**: [DigitalOcean - Java Write to File (BufferedWriter)](https://www.digitalocean.com/community/tutorials/java-write-to-file-2)

## Configuração do Ambiente

1.  **Dependências**: O projeto é gerenciado via Maven. Certifique-se de que o `pom.xml` possui as bibliotecas `opencsv` e `lombok` devidamente declaradas.
2.  **Diretórios**: O arquivo CSV deve estar localizado em `src/main/resources` para ser carregado via `ClassLoader`, garantindo a portabilidade do projeto.
3.  **Clone o repositório**: 
    ```bash
    git clone https://github.com/seu-usuario/nome-do-repo.git
    ```
3.  **Certifique-se de ter o Maven instalado**: 
    ```bash
    mvn -version
    ```
3.  **Execução via Terminal**:
    ```bash
    mvn clean compile
    mvn exec:java -Dexec.mainClass="com.reader_csv.ReadFileCSV"
    ```
## Fonte de Dados

Os dados utilizados neste projeto são de domínio público e foram obtidos através do **Portal de Dados Abertos da Universidade Federal de Sergipe (UFS)**. 

* **Dataset**: Discentes de Graduação (2025.1)
* **Origem**: [Dados Abertos UFS - Discentes](https://dados.ufs.br/dataset/discentes_graduacao/resource/dis-csv-discentes-de-graduacao-de-2025)
## Licença

Este projeto foi desenvolvido para fins acadêmicos na disciplina de Engenharia de Dados da Universidade Federal de Sergipe (UFS).