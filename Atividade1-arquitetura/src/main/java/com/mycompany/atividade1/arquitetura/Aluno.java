/*
    Criamos a classe (objeto) Aluno para realizar as seguintes melhorias:
    - Codigo Simples e de facil manutencao
    - Nomes de variaveis compreensiveis
    - Foco na funcionalidade
    - Codigo limpo, de facil entendimento
    - Uso minimo de recursos
    - Programacao funcional
    - Codigo estruturado
    - ArrayList do objeto aluno para listagem de aluno
    - Identacao
    - Criacao do objeto Aluno
*/
package com.mycompany.atividade1.arquitetura;

public class Aluno {
    private String nome;
    
    public Aluno (String nome) {
        this.nome = nome;
    }
    
    public void setNome (String nome) {
        this.nome = nome;
    }
    
    public String getNome (){
        return nome;
    }
}
