package academy.devdojo.maratonajava.introducao;

public class Aula04Operadores {
    public static void main(String[] args) {
        double numero01 = 10;
        double numero02 = 20;
        System.out.println(numero01/numero02);

        int resto = 21 % 7;
        System.out.println(resto);

        boolean isDezMaiorQueVinte = 10 > 20;
        boolean isDezMenorQueVinte = 10 < 20;
        boolean isDezIgualVinte = 10 == 20;
        boolean isDezIgualDez = 10 == 10;
        boolean isDezDiferenteDez = 10 != 10;

        System.out.println(isDezMaiorQueVinte);
        System.out.println(isDezMenorQueVinte);
        System.out.println(isDezIgualVinte);
        System.out.println(isDezIgualDez);
        System.out.println(isDezDiferenteDez);

        //&& (AND) || (OR)
        int idade = 29;
        float salario = 3500F;
        boolean isDentroDaLeiMaiorQueTrinta = idade >= 30 && salario >= 4612;
        boolean isDentroDaLeiMenorQueTrinta = idade < 30 && salario >=3381;

        System.out.println(isDentroDaLeiMaiorQueTrinta);
        System.out.println(isDentroDaLeiMenorQueTrinta);

        double valorTotalContaCorrente = 200;
        double valorTotalContaPoupanca = 10000;
        float valorPlaystation = 5000F;
        boolean isPlaystatioCincoCompravel = valorTotalContaCorrente > valorPlaystation || valorTotalContaPoupanca > valorPlaystation;
        System.out.println("isPlaystationCincoCompravel: "+isPlaystatioCincoCompravel);

        //= += -= *= /= %=
        double bonus = 1800; //1800
        bonus += 1000; //2800
        bonus -= 1000; //1800
        bonus *= 2; // 1800 x 2
        bonus /= 2; // 1800 : 2
        bonus %= 2; // resto de 1800 : 2
        System.out.println(bonus);

        int contador = 0;
        contador += 1; //contador = contador + 1;
        contador ++;
        contador --;
        ++contador;
        --contador;
        int contador2 = 0;
        System.out.println(++contador2);
    }
}
