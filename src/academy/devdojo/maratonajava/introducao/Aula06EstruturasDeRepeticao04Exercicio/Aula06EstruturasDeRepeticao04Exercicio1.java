package academy.devdojo.maratonajava.introducao.Aula06EstruturasDeRepeticao04Exercicio;

public class Aula06EstruturasDeRepeticao04Exercicio1 {
    public static void main(String[] args) {

        double pesoLimite = 15000;
        double pesoContainer = 1200;
        double pesoAtual = 0;

        for(int i = 0; i <= 20; i++){
            pesoAtual += pesoContainer;

            if(pesoAtual >= pesoLimite){
                System.out.println("Peso Limite excedido! "+ pesoAtual+" kilos");
                break;
            }

            System.out.println("O avião suporta mais peso! "+ pesoAtual+" kilos");
        }
    }
}
