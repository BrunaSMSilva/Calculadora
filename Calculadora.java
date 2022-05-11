package projetosBruna;

import java.util.Scanner;

public class Calculadora {


	public static void main(String[] args) {
		Scanner calcu = new Scanner (System.in);
		double a; 
		double b;
		String operacao;
		
		System.out.println("Informe primeiro número: ");
		a = calcu.nextInt (); 
		System.out.println("Informe segundo número: ");
		b = calcu.nextInt (); 
		System.out.println("Escolha a operação (+,-,*,/):");
		operacao = calcu.next();
		
		double soma = a+b; 
		double subtracao = a-b;
		double multiplicacao = a*b;
		double divisao = a/b;
		
		if (operacao.equals("+")) {
			System.out.println("Soma :" + soma);
		}
		else if (operacao.equals("-")) {
			System.out.println("Subtração :" + subtracao);
	}
		else if (operacao.equals("*")) {
			System.out.println("Multiplicação:" + multiplicacao);
	}
		else if (operacao.equals("/")) {
			System.out.println("Divisão :" + divisao);
	}
		else if (operacao != "+, -, *, /") {
			System.out.println("Operação invalida");
		}		
}
}


