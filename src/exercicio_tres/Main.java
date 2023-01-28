package exercicio_tres;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);
        int valor[] =
                {
                        350,
                        700
                },
                opcao = 0, relogios =0, pulseiras= 0, qtd= 0;

        double
                desconto, compra=0, total;

        do{
            System.out.print("Produtos a venda\n[1] Relogio\n[2] Pulseira\n[3] Fechar compra: ");
            opcao = ler.nextInt();

            if(opcao == 1){
                relogios++;
                qtd ++;
                compra = valor[0]*qtd;
                System.out.println(relogios+"- Relogio no valor de R$350 Adicionado!");

            }else if(opcao == 2){
                pulseiras++;
                qtd ++;
                compra = valor[1]*qtd;
                System.out.println(pulseiras+ " - Pulseira no valor de R$700 Adicionada!");

            }else if(opcao == 3){
                System.out.println("Saindo...!");
            }else{
                System.out.println("Opcao Invalida");
            }
        } while(opcao !=3);

        if (compra >= 3000){
            desconto = 0.25;
            total = compra- (compra*desconto/100);
            System.out.println("\nTotal de Produtos ["+(relogios+pulseiras)+ "]\nVendedor foi adicionado um desconto de 25% a compra total: R$" + total);
        }else if(compra >= 2000){
            desconto = 0.20;
            total = compra- (compra*desconto/100);
            System.out.println("\nTotal de Produtos ["+(relogios+pulseiras)+ "]\nVendedor foi adicionado um desconto de 20% a compra total: R$" + total);
        }else{
            total = compra;
            System.out.println("\nTotal de Produtos ["+(relogios+pulseiras)+ "]\n Valor da compra: " +total);
        }
    }
}