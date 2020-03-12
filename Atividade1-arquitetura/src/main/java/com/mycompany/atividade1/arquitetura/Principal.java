/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

        

package com.mycompany.atividade1.arquitetura;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;
import java.util.List;

/**
 *
 * @author Aluno
 */
public class Principal {
    
//deixe espaco para deixar mais organizado

    /*
        alteramos o nome do scanner, para facilitar a compreensao do codigo
        removemos a instanciacao do scanner e do ArrayList do codigo main, assim facilitando o reuso
    */
    public static Scanner scanner = new Scanner(System.in);//nomes de variaveis compreensiveis, e reusabilidade de componentes
    public static ArrayList<Aluno> alunos = new ArrayList<Aluno>();// e reusabilidade de componentes
    
    public static void main(String[] args) {
        
        int menu = 0;
        //cont = 0, verif = 0; Nome das variaveis estao confusos
        //String aux; utlizamos a variavel em outros metodos, para tal fizemos a inicializacao dela neles
        //String[] alunos = ;
        
        while(menu != 3) {
            System.out.println("Bem vindo ao sistema de ...");
            System.out.println("Escolha uma opção: ");
            System.out.println("[1] Cadastrar aluno");
            System.out.println("[2] Listar alunos cadastrados");
            System.out.println("[3] Sair");

            menu = Integer.parseInt(scanner.nextLine());
            
            
             /*
        criamos metodos separados para cada funcionalidade para atingir os seguintes objetivos:
        - programacao funcional
        - reusabilidade de componentes
        - quebra de complexidade do codigo
        - codigo intuitivo
        - divisao do codigo em metodos
        - criacao de funcoes para um codigo mais enxuto e organizado
    */

            switch(menu) {
                case 1:
                    //colocamos a funcao em um metodo especifico
                    //divisao do codigo em metodos
                    inserirAluno();
                    
                    
                    break;
                    
                case 2:
                    //colocamos a funcao em um metodo especifico
                    //divisao do codigo em metodos
                    listarAlunos();
                    
//                    
                    break;
            }
        }
 
    }
    
    
    /*
        A seguinte funcao realiza a insercao de um novo nome na lista. E caso o nome ja exista,
        sera chamado o metodo de verificacao "verificaExistenciaDoNome"
    */
    public static void inserirAluno () {
        
        String nome;
        System.out.println("Digite o nome do aluno: ");
        nome = scanner.nextLine();
        //criamos um metodo para verificar se o nome ja existe na lista
        if (verificaExistenciaDoNome(nome)){//se retornar true, significa que o nome esta na lista
            System.out.println("Nome ja inserido na lista! Digite outro nome.");
            inserirAluno();
        } else {
             alunos.add(new Aluno(nome));
        }
        // alteramos o nome da variavel aux para nome
    }
    
    /*
        Na seguinte funcao, e feita a listagem dos alunos.
    */
    
    public static void listarAlunos () {
        Iterator itr2 = alunos.iterator();
        while(itr2.hasNext()) {
            Object elemento = itr2.next();
            System.out.println(elemento);
        }
    }
    /*
        verifica se o nome esta na lista, se estiver a funcao ira retornar true, caso nao esteja 
        sera retornado false.
    */
    public static boolean verificaExistenciaDoNome (String nome) {

        Iterator iterator = alunos.iterator();//renomeamos itr1 para iterator, nomes de variaveis compreensiveis
        while(iterator.hasNext()) {
            Object aluno = iterator.next();//renomeamos o objeto elemento para aluno, assim fica mais facil de compreender
            if (aluno.equals(nome)) {
                System.out.println("Aluno já cadastrado");
                return true;
            }
        }
        
        return false;
    }
}