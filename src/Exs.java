import java.util.InputMismatchException;
import java.util.Scanner;

public class Exs {
    static boolean parada = false;
    static double porcentagem = 0;
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num = -3;
        do {
            try {
                System.out.print("\n0 - Sair\n1 - Exercício triângulo\n2 - Descontos da loja\n3 - Dia da semana\n4 - Prestação paga\nEscolha uma opção: ");
                num = input.nextInt();
                if (num >4 || num < 0){
                    throw new IllegalArgumentException("Digite números inteiros de 0 a 4");
                }
            } catch (IllegalArgumentException iae){
                System.out.println(iae);
                input.nextLine();
            } catch (InputMismatchException ime){
                System.out.println("Digite números inteiros de 0 a 4");
                input.nextLine();
            }
            if (num == 1){
                //Declaração de váriaveis e
                int lado1 = 0;
                int lado2 = 0;
                int lado3 = 0;
                String triangulo;
                boolean parada = false;

                //Atribuição de valores/entrada de dados
                do {
                    try{
                        System.out.print("\nQual a medida do primeiro lado? ");
                        lado1 = input.nextInt();
                        System.out.print("Qual a medida do segundo lado? ");
                        lado2 = input.nextInt();
                        System.out.print("Qual a medida do terceiro lado? ");
                        lado3 = input.nextInt();
                        if (lado1 <=0 || lado2<=0 || lado3 <0){
                            throw new IllegalArgumentException("SÓ NÚMEROS MAIORES QUE ZERO!");
                        }
                        triangulo = Metodos.Triangulo(lado1, lado2, lado3);
                        System.out.println("\nResultado: "+triangulo);
                        parada = true;
                    }
                    catch (InputMismatchException ime){
                        System.out.println("Só números inteiros são aceitos! ");
                        input.nextLine();
                    } catch (IllegalArgumentException iae){
                        System.out.println(iae);
                        parada = false;
                    }
                } while (!parada);
            } else if (num == 2) {
                double valor;
                int comprasMes;
                int anosCliente;
                boolean parada = false;
                double total;
                
                do {
                    try{
                        System.out.print("\nA quantos anos é cliente? ");
                        anosCliente = input.nextInt();
                        System.out.print("Qual o valor da compra? ");
                        valor = input.nextDouble();
                        System.out.print("Quantas compras tem no mês? ");
                        comprasMes = input.nextInt();

                         if (comprasMes <0 || anosCliente<0){
                            throw new IllegalArgumentException("SEM NÚMEROS NEGATIVOS");
                        }else if (valor <= 0){
                            throw new IllegalArgumentException("A COMPRA DEVE SER MAIOR QUE ZERO!");
                        }
                        total = Metodos.Desconto( anosCliente, valor, comprasMes);
                        System.out.println("\nTotal a ser pago: R$"+total+"\nDesconto recebido: "+(int)porcentagem+"%");
                        parada = true;
                    } catch (InputMismatchException ime){
                        System.out.println("Valor inadequado!");
                        input.nextLine();
                    } catch (IllegalArgumentException iae){
                        System.out.println(iae);
                    }
                } while (!parada);

            } else if (num == 3) {
                int dia;
                String diaSemana;

                do {
                    try {
                        System.out.print("\nQual o número desejado? ");
                        dia = input.nextInt();
                        diaSemana = Metodos.Semana(dia);
                        System.out.println("O resultado: "+diaSemana);
                    } catch (InputMismatchException ime){
                        System.out.println("Somente valores inteiros!");
                        input.nextLine();
                    } catch (IllegalArgumentException iae){
                        System.out.println(iae);
                        parada = false;
                    }
                } while (!parada);

            } else if (num == 4) {
                double valor;
                double juros;
                int meses;
                boolean parada = false;
                double valorParcelas;

                do {
                    try{
                        System.out.print("\nQual o valor da compra? ");
                        valor = input.nextDouble();
                        System.out.print("Deseja pagar em quantos meses? ");
                        meses = input.nextInt();
                        System.out.print("Qual a porcentagem(taxa) de juros mensal? ");
                        juros = input.nextDouble();
                        if (juros < 0){
                            throw new IllegalArgumentException("SEM NÚMEROS NEGATIVOS!");
                        }else if (valor <= 0){
                            throw new IllegalArgumentException("TÁ PENSANDO QUE É DE GRAÇA? ");
                        } else if (meses<=0){
                            throw new IllegalArgumentException("TEM QUE TER ALGUM MÊS PARA PAGAAR! ");
                        }
                        valorParcelas = Metodos.Parcelar(valor, meses, juros);
                        System.out.println("Valor das parcelas: R$"+valorParcelas);
                        parada = true;
                        } catch (InputMismatchException ime){
                            System.out.println("Valor indevido!");
                            input.nextLine();
                        } catch (IllegalArgumentException iae){
                            System.out.println(iae);
                        }
                } while (!parada);
            }
        }while (num  != 0);
    }
}