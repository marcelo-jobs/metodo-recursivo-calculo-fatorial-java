package application;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		System.out.println("Escolha um número inteiro para ser fatorado: ");
		int n = sc.nextInt();
		int x = factorial(n);
		System.out.println("O resultado da fatoração é: " + x);
	}
	
	public static int factorial(int n) {
		if (n == 1) {
			return 1;
		} else {
			return n * factorial(n - 1);
		}
	}

}
