public class Metodos {
    public static String Triangulo(int lado1, int lado2, int lado3) throws IllegalArgumentException{
        String triangulo;
        //Condição/processamento
        if (lado3 + lado2 < lado1 || lado1 + lado2 < lado3 || lado3 + lado1 < lado2){
            throw new IllegalArgumentException("Esses valores não correspondem a um triângulo!");
        }
        else {
            if (lado3 == lado2 && lado2 == lado1) {
                triangulo = "Equilátero, por possuir 3 lados iguais.";
            } else if (lado3 != lado2 && lado2 != lado1 && lado3 != lado1) {
                triangulo = "Escaleno, por possuir todos os 3 lados diferentes.";
            } else {
                triangulo = "Isósceles, possui 2 lados iguais.";
            }
        } return triangulo;
    }

    public static double Desconto( int anosCliente, double valor, int comprasMes) {
        if (anosCliente > 10){
            Exs.porcentagem = Exs.porcentagem+ 15;
        } if (valor > 1500) {
            Exs.porcentagem = Exs.porcentagem+ 17;
        } if(comprasMes > 5){
            Exs.porcentagem = Exs.porcentagem+ 13;
        }
        return (valor*(1-(Exs.porcentagem/100)));
    }

    public  static String Semana(int dia) throws IllegalArgumentException{
        if (dia<0||dia>7) throw new IllegalArgumentException("O número deve estar entre 0 e 7!");
        if (dia == 0) Exs.parada = true;
        String[] semana = new String[8];
        semana[0] = "Saída";
        semana[1] = "Domingo";
        semana[2] = "Segunda";
        semana[3] = "Terça";
        semana[4] = "Quarta";
        semana[5] = "Quinta";
        semana[6] = "Sexta";
        semana[7] = "Sábado";
        return semana[dia];
    }

    public static double Parcelar(double valor, int meses, double juros) throws IllegalArgumentException{
        double valorParcela = Math.round((valor * Math.pow((1+ (juros/100)), meses))/meses);
        if (valorParcela < 50){
            throw new IllegalArgumentException("O número de parcelas precisa ser diminuído!");
        }
        return valorParcela;
    }
}
