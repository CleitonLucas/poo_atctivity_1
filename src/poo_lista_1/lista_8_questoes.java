package poo_lista_1;
import java.util.Scanner;

public class lista_8_questoes {
	public static void main(String[] args) {
		
	}
	
	//Questo 1: calculo da media aritimetica.
	public static float calcularMedia(float[] array, String[] materias) {
		Scanner sc = new Scanner(System.in);
		
		for(int i = 0; i < array.length; i++) {
			System.out.println("Informe suas notas de " + materias[i] + " :");
			array[i] = sc.nextFloat();		
		}
		
		float soma = 0;
		
		for(int notas = 0; notas < array.length; notas++) {
			soma = soma + array[notas];
		}
		
		float media = soma / array.length;
		return media;
	}
	
	//Questao 2: impressão inversa de um array com 10 elementos.
	public static void imprimirInverso(int[] array) {
		for(int i = array.length - 1; i >= 0; i--) {
			System.out.print(array[i] + " ");
		}
	}
	
	//Questão 3: impressão inversa de um array com 100 elementos aleatorios.
	public static void imprimirAleatorio(int[] array) {
		
	}

}
