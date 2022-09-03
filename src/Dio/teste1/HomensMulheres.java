package Dio.teste1;

import java.util.Scanner;

public class HomensMulheres {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int sexo = 0, qtMulheres = 6;
        int qtHomens = 5;
        double altura = 0, somaH = 0, mediaHomens = 0, maior = 0, menor = 10;

        for (int i = 0; i < 10; i++) {
            System.out.println("Escolha o sexo da pessoa (1-Mulher, 2-Homem)");
            sexo = entrada.nextInt();

            System.out.println("Digite a Altura:  ");
            altura = entrada.nextDouble();break;
        }

        if (sexo == 1){
            qtMulheres++;
        } else if (sexo == 2) {
            qtHomens++;
            somaH = somaH + altura;

        }else {
            System.out.println("Opecao sexo invalido!");
        }
        if (altura > maior){
            maior = altura;
        } else if (altura < menor) {
            menor = altura;

        } mediaHomens = somaH / qtHomens;

        System.out.println("A maior altura do grupo e de  "+ maior + "m, e a menor e de " + menor + "m");
        System.out.println("A media de altura dos homens e " + mediaHomens + "m");
        System.out.println("O numero de mulheres e " + qtMulheres);
        entrada.close();

    }
}
