package academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio;

public class Funcionario {
    public String nome;
    public int idade;
    public double[] salario;

    public void imprime(){
        System.out.println("---------------------");
        System.out.println(this.nome);
        System.out.println(this.idade);
        for (int i = 0; i < salario.length; i++) {
            System.out.println(salario[i]);
        }
    }

    public void mediaSalario(){
        System.out.println("---------------------");
        double total = 0;
        for (int i = 0; i < salario.length; i++) {
            total += salario[i];
        }
        double resultado = total / salario.length;
        System.out.println(resultado);
    }
}
