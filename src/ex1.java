//Exercício N°1:
//Faça um programa em Java para ler uma String com 10
//caracteres numéricos e criar um dígito verificador.
//O digito verificador será a parte inteira da média dos 10 dígitos.

//String lida = “1234567890”
//Média = (1+2+3+4+5+6+7+8+9+0)/10
//Média = 45/10 = 4,5
//Dígito Verificador = 4

//Exercício N°2:
//Escreva um programa para calcular o Índice de Massa Corporal
//(IMC) de uma pessoa, mostrar o valor do IMC e sua situação de
//acordo com a tabela no próximo slide.

//O programa deve ter dois métodos:
//Um que recebe o peso e a altura como parâmetros e
//retorna o IMC.
//Outro que recebe o IMC e retorna a mensagem.

//Menor que 18,5 - Magreza
//18,5 a 24,9 - Normal
//25 a 29,9 - Sobrepeso
//30 a 34,9 - Obesidade grau I
//35 a 39,9 - Obesidade grau II
//Maior que 40 - Obesidade grau III

public class ex1 {
    public static void main(String[] args) {
        //Declaração de variáveis ↓
        String lida = "1234567890";
        double peso = 20.2;
        double altura = 1.72;

        System.out.println("O retorno é: " + calcularDigitoVerificador(lida));
        System.out.println("\nDe acordo com o IMC, o seu peso se enquadra em: " + mensagemIMC(calcularIMC(peso, altura)) + "\nValor IMC: " + calcularIMC(peso, altura));
    }

    public static int calcularDigitoVerificador(String lida) {
        //Declaração de variáveis ↓
        int[] vetor = new int[9];
        int resultado = 0;

        //Processamento ↓
        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = Integer.parseInt(lida.substring(i, i + 1));
            resultado += vetor[i];
        }

        return (resultado / 10);
    }

    public static double calcularIMC(double peso, double altura) {
        //Declaração de variáveis ↓
        return peso / (altura * altura); //peso / (altura x altura)
    }

    public static String mensagemIMC(double imc) {
        //Comparações do IMC ↓
        if (imc < 18.5) {
            return "Magreza";
        }
        else if (imc >= 18.5 && imc <= 24.9) {
            return "Normal";
        }
        else if (imc >= 25 && imc <= 29.9) {
            return "Sobrepeso";
        }
        else if (imc >= 30 && imc <= 34.9) {
            return "Obesidade grau I";
        }
        else if (imc >= 35 && imc <= 39.9) {
            return "Obesidade grau II";
        }
        else if (imc >= 40) {
            return "Obesidade grau III";
        }
        else {
            return "Valor inválido";
        }
    }
}

