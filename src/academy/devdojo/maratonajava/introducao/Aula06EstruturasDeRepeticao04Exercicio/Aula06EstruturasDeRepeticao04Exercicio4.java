package academy.devdojo.maratonajava.introducao.Aula06EstruturasDeRepeticao04Exercicio;

public class Aula06EstruturasDeRepeticao04Exercicio4 {
    public static void main(String[] args) {
        double meta = 50000;

        for (int i = 0; i<=30; i++){
            double vendaDiaria = i*2300;
            if (vendaDiaria >= meta){
                System.out.println("Meta batida no dia "+i+" totalizou "+vendaDiaria);
                break;
            }
            System.out.println("A meta ainda não foi batida "+vendaDiaria);
        }
    }
}
