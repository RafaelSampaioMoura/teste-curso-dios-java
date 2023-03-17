package com.rafael.calculadora;

import java.util.Scanner;

public class Calculadora {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a, b;
		Scanner scan = new Scanner(System.in);
		System.out.println("Primeiro número: ");
		a = scan.nextInt();
		System.out.println("Segundo número: ");
		b = scan.nextInt();
		
		int soma = soma(a, b);
		int subtração = subtração(a, b);
		int multiplicação = multiplicação(a, b);
		double divisão = divisão(a, b);
		System.out.println("Soma: " + soma + ", Sub: " + subtração + ", Mult: " + multiplicação + ", Div: " + divisão);
	}
	
	public static int soma(int a, int b) {
		return a + b;
	}
	
	public static int subtração(int a, int b) {
		return a - b;
	}
	
	public static int multiplicação(int a, int b) {
		return a * b;
	}
	
	public static double divisão(int a, int b) {
		double c = a;
		double d = b;
		return c / d;
	}

}
