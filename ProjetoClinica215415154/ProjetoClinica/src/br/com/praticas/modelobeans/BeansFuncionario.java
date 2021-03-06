
package br.com.praticas.modelobeans;



public class BeansFuncionario {
    
    private int matricula;
    private String nome;
    private String funcao;
    private int cpf;
    private String pesquisa;

    /**
     * @return the codigo
     */
    public int getMatricula() {
        return matricula;
    }

    /**
     * @param codigo the codigo to set
     */
    public void setCodigo(int matricula) {
        this.matricula = matricula;
    }

    /**
     * @return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * @return the especialidade
     */
    public String getFuncao() {
        return funcao;
    }

    /**
     * @param especialidade the especialidade to set
     */
    public void setFuncao(String funcao) {
        this.funcao = funcao;
    }

    /**
     * @return the crm
     */
    public int getCpf() {
        return cpf;
    }

    /**
     * @param crm the crm to set
     */
    public void setCpf(int cpf) {
        this.cpf = cpf;
    }

    /**
     * @return the pesquisa
     */
    public String getPesquisa() {
        return pesquisa;
    }

    /**
     * @param pesquisa the pesquisa to set
     */
    public void setPesquisa(String pesquisa) {
        this.pesquisa = pesquisa;
    }
    
}
