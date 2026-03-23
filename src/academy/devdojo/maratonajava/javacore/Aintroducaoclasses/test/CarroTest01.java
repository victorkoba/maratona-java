package academy.devdojo.maratonajava.javacore.Aintroducaoclasses.test;

import academy.devdojo.maratonajava.javacore.Aintroducaoclasses.dominio.Carro;

public class CarroTest01 {
    public static void main(String[] args) {
        Carro carro1 = new Carro();
        Carro carro2 = new Carro();

        carro1.nome = "Onix";
        carro1.modelo = "Sedan";
        carro1.ano = 2019;

        carro2.nome = "Prisma";
        carro2.modelo = "Retrô";
        carro2.ano = 1999;

        System.out.println("Nome do carro: "+carro1.nome+", modelo: "+carro1.modelo+", ano: "+carro1.ano);
        System.out.println("Nome do carro: "+carro2.nome+", modelo: "+carro2.modelo+", ano: "+carro2.ano);
    }
}
