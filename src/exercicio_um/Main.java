package exercicio_um;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int dia,ano;
        String mes,pais;
        Scanner ler = new Scanner(System.in);

        System.out.print("Informe o Dia: ");
        dia = ler.nextInt();
        ler.nextLine();

        System.out.print("\nInforme o mês: ");
        mes = ler.nextLine();

        System.out.print("\nInforme o Ano: ");
        ano = ler.nextInt();
        ler.nextLine();

        System.out.print("\nInforme o Pais: ");
        pais = ler.nextLine();

        if (dia == 22 && mes.equals("abril") && ano == 1500 && pais.equals("brasil") ){
            System.out.println("O "+pais+" foi descoberto no dia "+dia+" de "+mes+", de "+ano+"!");
        }else{
            System.out.println("Sem registros!");
        }

    }
}

