package model;

import java.util.ArrayList;
import java.util.List;

public class RH {
    private ArrayList<Funcionario> funcionarios = new ArrayList<>();

    public void adicionaFuncionario(Funcionario fun) {
        this.funcionarios.add(fun);
    }

    public List<Funcionario> pesquisaFuncionario(String nome) {
        List<Funcionario> pesquisa = new ArrayList<Funcionario>();
        for (Funcionario fun : funcionarios) {
            if (fun.getNome().equalsIgnoreCase(nome)) {
                pesquisa.add(fun);
            }
        }
        return pesquisa;
    }

    public List<Funcionario> listarFuncionarios() {
        return this.funcionarios;
    }

    public void processarSalario(Salario func) {
        double salario = func.calculaSalario();
        System.out.println("Salário do funcionário: " + salario);
    }
}