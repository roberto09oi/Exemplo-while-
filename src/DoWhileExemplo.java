import java.util.Scanner;

public class DoWhileExemplo {
    public static void main(String[] args) {
   int opcao = 0;
   Scanner tantofaz = new Scanner(System.in);

        do{
       System.out.println("** Escolha**");
       System.out.println("1-inserir");
       System.out.println("2 - Excluir");
       System.out.println("Alterar");
       System.out.println("0 - Sair");
       opcao = tantofaz.nextInt();

    } while(opcao !=0);
    }
}
