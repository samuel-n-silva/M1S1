package exercicio_dois;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int distancia,tempo;
        Scanner ler = new Scanner(System.in);

        System.out.print("Informe a distancia a ser percorrida: ");
        distancia = ler.nextInt();
        System.out.print("\nInforme o tempo a ser gasto: ");
        tempo = ler.nextInt();

        System.out.println("O carro levou " +tempo+ " horas para percorrer "+distancia+"km"+", então estava dirigindo à "+ distancia/tempo+"km/h!");
    }
}
