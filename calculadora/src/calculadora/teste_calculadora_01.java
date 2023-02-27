package calculadora;

import java.util.Scanner;

public class teste_calculadora_01 {

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		
		int a, b;
		
		System.out.println("Digite o primeiro numero: ");
		a= scan.nextInt();
		System.out.println("Digite o segundo numero: ");
		b= scan.nextInt();
		
		int soma = soma(a,b);
		int subtracao = subtracao(a,b);
		int multiplicacao = multiplicacao(a,b);
		float divisão = divisão(a,b);
		
		System.out.println(soma);
		System.out.println(subtracao);
		System.out.println(multiplicacao);
		System.out.println(divisão);

	}
	
	public static int soma(int a, int b) {
		return a + b;
	}

	public static int subtracao(int a, int b) {
		return a - b;
	}

	public static int multiplicacao(int a, int b) {
		return a * b;
	}

	public static float divisão(int a, float b) {
		return a / b;
	}

}
