package exercicios;

import java.util.Scanner;

public class Lista2questao20 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite os valores: ");
		
		double a;
        double b; 
        double c; 
        
        a = entrada.nextDouble();
        b = entrada.nextDouble();
        c = entrada.nextDouble();
        
        if (a > b + c || b > a + c || c > a + b){
        	
        	System.out.println("Os valores não formam um triangulo");
        	
        	}else if (a == b && b == c && a == c){
                System.out.println("Triângulo equilátero");
                
            } else if (a == b && b != c && a != c){
                System.out.println("Triângulo isósceles");
                
            } else{
                System.out.println("Triângulo escaleno");
                
            }
        }

	}


