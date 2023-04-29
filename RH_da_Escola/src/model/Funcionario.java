package model;

public class Funcionario implements Salario{

    private int cpf;
    private String nome;
    private String endereco;
    private String dataAdmissao;
    private String titulacao;
    private double salarioBase;

    public Funcionario(int cpf, String nome, String endereco, String dataAdmissao, String titulacao, double salarioBase) {
        this.cpf = cpf;
        this.nome = nome;
        this.endereco = endereco;
        this.dataAdmissao = dataAdmissao;
        this.titulacao = titulacao;
        this.salarioBase = salarioBase;   
    }
    
    public int getCpf() {
        return cpf;
    }

    public void setCpf(int cpf) {
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getDataAdmissao() {
        return dataAdmissao;
    }

    public void setDataAdmissao(String dataAdmissao) {
        this.dataAdmissao = dataAdmissao;
    }

    public String getTitulacao() {
        return titulacao;
    }

    public void setTitulacao(String titulacao) {
        this.titulacao = titulacao;
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    public void setSalario(double salarioBase) {
        this.salarioBase = salarioBase;
    }
    
    @Override
  public double calculaSalario() {
    return this.getSalarioBase();
  }
    
    @Override
    public String toString() {
	return "\n Cpf: " + this.cpf + "\n Nome: " + this.nome + "\n Endereço: " + this.endereco + "\n Data de Admissão:" + this.dataAdmissao 
                                                               + "\n Titulação: " + this.titulacao + "\n Salario base: " + this.salarioBase;
	}
    
}