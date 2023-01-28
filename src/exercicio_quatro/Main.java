package exercicio_quatro;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        String nome = "";
        Scanner ler = new Scanner(System.in);
        double[] Valor = {350.00,750.00},Desconto = {0.10,0.15,0.20};
        double total = 0;
        int select = 0;

        do {
            System.out.print("Informe seu nome: ");
            nome = ler.nextLine();
        }while (nome.isBlank());

        System.out.println("\n[1] Relógio de pulso\n[2] Pulseiras de prata");
        select = ler.nextInt();

        switch (select){
            case 1:
                total = Valor[0];
                break;
            case 2:
                total = Valor[1];
                break;
            default:
                System.out.println("Seleção invalida!");
        }


        System.out.println("Informar valor de desconto!\n[1] 10% \n[2] 15% \n[3] 20%");
        select = ler.nextInt();

        switch (select){
            case 1:
                total = total - (total*Desconto[0]/100);
                break;
            case 2:
                total = total - (total*Desconto[1]/100);
                break;
            case 3:
                total = total - (total*Desconto[2]/100);
                break;
            default:
                System.out.println("Seleção invalida!");
        }

        System.out.println(nome+" do cliente e o valor a ser pago " + total);

    }
}