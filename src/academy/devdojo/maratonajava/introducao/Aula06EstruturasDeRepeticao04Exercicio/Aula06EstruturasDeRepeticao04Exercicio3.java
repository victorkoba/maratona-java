package academy.devdojo.maratonajava.introducao.Aula06EstruturasDeRepeticao04Exercicio;

public class Aula06EstruturasDeRepeticao04Exercicio3 {
    public static void main(String[] args) {
        int quartosDisponiveis = 30;

        for(int i = 0; i <= 100; i+=3){
            int restamQuartos = quartosDisponiveis - i;

            if (i >= quartosDisponiveis){
                System.out.println("Todos quartos ocupados! "+i+" vagas ocupadas");
                break;
            }
            System.out.println("Temos ainda: "+restamQuartos+" quartos");
        }
    }
}
