package academy.devdojo.maratonajava.javacore.Bintroducaometodos.test;

import academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio.Funcionario;

public class FuncionarioTest01 {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario();
        Funcionario funcionario1 = new Funcionario();

        funcionario.nome = "Victor";
        funcionario.idade = 18;
        funcionario.salario = new double[]{2000.0, 3000.0, 4000.0};

        funcionario1.nome = "João";
        funcionario1.idade = 21;
        funcionario1.salario = new double[]{5000.0, 6000.0, 7000.0};

        funcionario.imprime();
        funcionario1.imprime();

        funcionario.mediaSalario();
        funcionario1.mediaSalario();
    }
}
