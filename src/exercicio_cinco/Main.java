package exercicio_cinco;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        int
                repetir,
                a = 0,
                b = 1;
        Scanner ler = new Scanner(System.in);

        System.out.print("Fibonacci - Informe a quantidade de vezes que deseja verificar na sequecia: ");
        repetir = ler.nextInt();

        for(int i = 0; i < repetir; i++){
            a = a + b;
            b = a - b;
            System.out.print("["+a+"],");
        }
    }
}

