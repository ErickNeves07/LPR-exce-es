import java.util.InputMismatchException;
import java.util.Scanner;



public class Main {
    public static final String RESET = "\033[0m";  // Text Reset
    public static final String RED = "\033[0;31m";     // RED
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int quantPessoas;
        int quantObjetos;
        int total;
        int num = 0;
        double divisao;

        do {
            try{
                System.out.print("Digite a quantidade de pessoas: ");
                quantPessoas = input.nextInt();
                System.out.print("Digite a quantidade de objetos por pessoa: ");
                quantObjetos = input.nextInt();
                if (quantPessoas<0|quantObjetos<0){
                    System.out.println(RED+"\nNão use números negativos!"+RESET);
                    continue;
                }
                divisao = quantPessoas/quantObjetos;
                num = 1;
            } catch (InputMismatchException ime){
                System.out.print(RED+"\nDigite apenas números inteiros!\n"+RESET);
                input.nextLine();
            } catch (ArithmeticException ae){
                System.out.print(RED+"\nDigite números diferentes de zero!\n"+RESET);
                input.nextLine();
            }
        } while (num == 0);

    }
}