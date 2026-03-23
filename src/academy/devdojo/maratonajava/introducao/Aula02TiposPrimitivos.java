package academy.devdojo.maratonajava.introducao;

public class Aula02TiposPrimitivos {
    public static void main(String[] args) {
    //int, double, float, char, byte, short, long, boolean
    //Casting força o valor a entrar em um outro tipo
        int idade = (int) 1000000000L; //Casting - long -> int
        long numeroGrande = (long) 100000.39; //Castimg - double -> long
        double salarioDouble = 2000;
        float salarioFloat = 2500;
        byte idadeByte = 10;
        short idadeShort = 10;
        boolean verdadeiro = true;
        boolean falso = false;
        char caractere = 65;

        String nome = "Goku";

        System.out.println("A idade é "+idade+" anos");
        System.out.println(falso);
        System.out.println(caractere);

    }
}
