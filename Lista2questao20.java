package exercicios;

import java.util.Scanner;

public class Lista2questao20 {

	public static void main(String[] args) {
		Scanner entrada=new Scanner(System.in);
		
		int A = 5;
        int B = 5; 
        int C = 5; 
        
        if (A < B + C && B < A + C && C < A + B) {
     
            if (A == B && B == C) {
                System.out.println("Triângulo equilátero");
                
            } else if (A == B || B == C || A == C) {
                System.out.println("Triângulo isósceles");
                
            } else {
                System.out.println("Triângulo escaleno");
                
            }
        }

	}

}
