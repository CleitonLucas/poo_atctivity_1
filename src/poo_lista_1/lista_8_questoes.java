package poo_lista_1;

import java.util.Scanner;
import java.util.Random;

public class lista_8_questoes {
	public static void main(String[] args) {
		calcularMedia2();
	}

	// Questo 1: solicitação de 5 notas e realizar a média.
	public static void calcularMedia() {
		float[] array = new float[5];
		String[] materias = { "Portugues", "Matematica", "Fisica", "Literatura", "Biologia" };

		Scanner sc = new Scanner(System.in);

		for (int i = 0; i < array.length; i++) {
			System.out.println("Informe suas notas de " + materias[i] + ":");
			array[i] = sc.nextFloat();
		}

		float soma = 0;

		for (int notas = 0; notas < array.length; notas++) {
			soma = soma + array[notas];
		}

		float media = soma / array.length;
		System.out.println("Sua media geral eh: " + media);
	}

	// Questao 2: impressão inversa de um array com 10 números inteiros.
	public static void imprimirInverso(int[] array) {
		for (int i = array.length - 1; i >= 0; i--) {
			System.out.print(array[i] + " ");
		}
	}

	// Questão 3: impressão inversa de um array com 100 números inteiros.
	public static void imprimirAleatorio() {
		int[] array = new int[100];
		Random gerador = new Random();

		for (int i = 0; i < array.length; i++) {
			array[i] = gerador.nextInt(101);
			System.out.print(array[i] + " ");
		}

		System.out.println();

		for (int j = array.length - 1; j >= 0; j--) {
			System.out.print(array[j] + " ");
		}
	}

	// Questão 4: preencher um array com 100 números inteiros aleatórios 
	//e imprimir os números primos.
	public static void imprimirPrimos() {
		int[] array = new int[100];
		Random gerador = new Random();

		for (int i = 0; i < array.length; i++) {
			array[i] = gerador.nextInt(101);
			System.out.print(array[i] + " ");
		}
		
		System.out.println();
		
		for(int i = 0; i < array.length; i++) {
			int cont = 0;
			for(int j = 1; j <= array[i]; j++) {
					if(array[i] % j == 0) {
						cont ++;
					}
			}
			if(cont == 2) {
				System.out.print(array[i] + " ");
			}
		}
	}
	
	// Questão 5: preencher um array com 100 número inteiros aleatórios
	// e imprimir apenas os ímpares.
	public static void imprimirImpares() {
		int[] array = new int[100];
		Random gerador = new Random();

		for (int i = 0; i < array.length; i++) {
			array[i] = gerador.nextInt(101);
			System.out.print(array[i] + " ");
		}
		
		System.out.println();
		
		for(int j = 0; j < array.length; j++) {
			if(array[j] % 2 != 0 ) {
				System.out.print(array[j] + " ");
			}
		}
	}
	
	// Questão 6: preencher um array com 100 números inteiros aleatórios
	// e imprimir apenas os pares.
	public static void imprimirPares() {
		int[] array = new int[100];
		Random gerador = new Random();

		for (int i = 0; i < array.length; i++) {
			array[i] = gerador.nextInt(101);
			System.out.print(array[i] + " ");
		}
		
		System.out.println();
		
		for(int j = 0; j < array.length; j++) {
			if(array[j] % 2 == 0 ) {
				System.out.print(array[j] + " ");
			}
		}
	}
	
	// Questão 7: preencher um array com 100 números inteiros aleatórios
	// e imprimir o maior e o menor valor;
	public static void imprimirMaiorMenor() {
		int[] array = new int[100];
		int numMaior = Integer.MIN_VALUE;
	    int numMenor = Integer.MAX_VALUE;
		
		Random gerador = new Random();

		for (int i = 0; i < array.length; i++) {
			array[i] = gerador.nextInt(101);
			System.out.print(array[i] + " ");
		}
		
		System.out.println();
		
		for(int j = 0; j < array.length; j++) {
			if(array[j] < numMenor) {
				numMenor = array[j];
			}else if(array[j] > numMaior) {
				numMaior = array[j];
			}
		}
		
		System.out.print(numMaior + " " + numMenor );
	}
	
	// Questão 8: preencher um array com 100 números inteiros 
	// e calcular a média aritmética
	public static void calcularMedia2() {
		int[] array = new int[10];
		double soma = 0;
		
		Random gerador = new Random();

		for (int i = 0; i < array.length; i++) {
			array[i] = gerador.nextInt(10);
			System.out.print(array[i] + " ");
		}
		
		System.out.println();
		
		for(int j = 0; j < array.length; j++) {
			soma = soma + array[j];
		}
		
		double media = soma / array.length;
		System.out.print(media);
	}
	
}
