package exercicios_seis;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        String[] pessoas = {"Ana","Roberto","Samuel","Marcos","Maria","Paloma"};
        Scanner ler = new Scanner(System.in);
        int select;

        do{
            System.out.print("Escolha seu amigo secreto (números de 1 à 6):");
            select = ler.nextInt();

            if(select <= 0 || select >=7){
                System.out.println("Numero Invalido");
            }
        }while (select <=0 || select >= 7);

        System.out.println("Seu amigo secreto é: " + pessoas[select-1]);
    }
}