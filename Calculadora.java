package projetosBruna;

import java.util.Scanner;

public class Calculadora {


	public static void main(String[] args) {
		Scanner calcu = new Scanner (System.in);
		double a; 
		double b;
		String operacao;
		
		System.out.println("Informe primeiro n�mero: ");
		a = calcu.nextInt (); 
		System.out.println("Informe segundo n�mero: ");
		b = calcu.nextInt (); 
		System.out.println("Escolha a opera��o (+,-,*,/):");
		operacao = calcu.next();
		
		double soma = a+b; 
		double subtracao = a-b;
		double multiplicacao = a*b;
		double divisao = a/b;
		
		if (operacao.equals("+")) {
			System.out.println("Soma :" + soma);
		}
		else if (operacao.equals("-")) {
			System.out.println("Subtra��o :" + subtracao);
	}
		else if (operacao.equals("*")) {
			System.out.println("Multiplica��o:" + multiplicacao);
	}
		else if (operacao.equals("/")) {
			System.out.println("Divis�o :" + divisao);
	}
		else if (operacao != "+, -, *, /") {
			System.out.println("Opera��o invalida");
		}		
}
}


