package academy.devdojo.maratonajava.introducao.Aula06EstruturasDeRepeticao04Exercicio;

public class Aula06EstruturasDeRepeticao04Exercicio2 {
    public static void main(String[] args) {

        double temperaturaLimite = 500;

        for(int i = 1; i <= 20; i++){
            double temperaturaAtual = i *45;

            if(temperaturaAtual >= temperaturaLimite){
                System.out.println("Emergência, reator desligado!");
                break;
            }

            System.out.println("Temperatura atual: "+temperaturaAtual+" °C");
        }
    }
}