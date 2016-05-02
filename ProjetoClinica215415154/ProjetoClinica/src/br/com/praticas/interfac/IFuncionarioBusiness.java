/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.praticas.interfac;

/**
 *
 * @author Ewerton
 */
public interface IFuncionarioBusiness {

    public void salvarFuncionario(int matricula, String nome, String funcao, int cpf, String pesquisa);

    public void salvarOFuncionario(int matricula, String nome, String funcao, int cpf, String pesquisa);
}
