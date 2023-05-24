package exercicios;

import java.util.Scanner;

public class Lista2questao41 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Digite o peso (em kg): ");
        double peso = entrada.nextDouble();
        
        System.out.print("Digite a altura (em metros): ");
        double altura = entrada.nextDouble();
        
        double imc = peso / (altura * altura);
        
        String classificacao;
        
        if (imc < 18.5) {
            classificacao = "Abaixo do Peso";
        } else if (imc <= 24.9){
            classificacao = "Saudável";
        } else if (imc <= 29.9){
            classificacao = "Peso em Excesso";
        } else if (imc <= 34.9){
            classificacao = "Obesidade Grau I";
        } else if (imc <= 39.9){
            classificacao = "Obesidade Grau II (severa)";
        } else{
            classificacao = "Obesidade Grau III (mórbida)";
        }
        
        System.out.println("IMC: " + imc);
        System.out.println("Classificação: " + classificacao);

	}

}
