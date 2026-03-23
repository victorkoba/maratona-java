package academy.devdojo.maratonajava.introducao.Aula06EstruturasDeRepeticao04Exercicio;

public class Aula06EstruturasDeRepeticao04Exercicio5 {
    public static void main(String[] args) {
        double plano = 10240;

        for (int i = 0; i <= 50; i++){
            double consumoApp = i*500;
            if (consumoApp > plano){
                System.out.println("Limite de dados atingido. Velocidade reduzida. O consumo foi de "+consumoApp);
                break;
            }
            System.out.println("Consumo atual: "+consumoApp);
        }
    }
}
