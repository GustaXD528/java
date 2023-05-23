package exercicios;

import java.util.Scanner;

public class Lista2questao25 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		double a = 2;
        double b = 6;
        double c = 2;
        
        if (a != 0){
            
            double delta = b * b - 4 * a * c;
            
            if (delta < 0){
                System.out.println("Não existe raiz.");
            } else if (delta == 0){
                double raiz = -b / (2 * a);
                System.out.println("Raiz única: "+ raiz);
            } else {
                double raiz1 = (-b + Math.sqrt(delta)) / (2 * a);
                double raiz2 = (-b - Math.sqrt(delta)) / (2 * a);
                System.out.println("Raiz 1: "+ raiz1);
                System.out.println("Raiz 2: "+ raiz2);
            }
        } else{
            System.out.println("Não é equação de segundo grau.");
        }
		
	}

}
