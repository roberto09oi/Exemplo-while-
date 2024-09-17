import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int valor = 0;
        int somaTotal = 0;
        Scanner sc = new Scanner(System.in);

        while (valor != 99) {
            /*system.out.println(Valor);
            valor=valor+1; // igaul valor++*/

            System.out.print("informe o valor: ");
            System.out.print("Informe 99 para sair");
            valor = sc.nextInt();

            somaTotal += valor;
        }
        Syste.out.ptintln("Total é " + somaTotal);
    }
}