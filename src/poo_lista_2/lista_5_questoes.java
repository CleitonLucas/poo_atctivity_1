package poo_lista_2;
import java.util.Scanner;

public class lista_5_questoes {
	public static void main(String[] args) {
		imprimirClasses();
	}
	
	// Questão 1: usando o teclado imprimir o numero do tipo int, long e float.
	public static void imprimirClasses() {
		Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um número inteiro:");
        int numeroInteiro = scanner.nextInt();

        System.out.println("Digite um número longo:");
        long numeroLongo = scanner.nextLong();

        System.out.println("Digite um número de ponto flutuante:");
        float numeroFloat = scanner.nextFloat();

        System.out.printf("O número inteiro digitado foi %d, o número long digitado foi %d e o número float foi %.2f.%n",
                numeroInteiro, numeroLongo, numeroFloat);
	}
	
	// Questão 2: calcular imc e exibir na tela de acordo com a fórmula.
	public static void imprimirIMC() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Informe seu peso:");
		float peso = sc.nextFloat();
		
		System.out.println("Informe sua altura:");
		float altura = sc.nextFloat();
		
		double imc = peso / Math.pow(altura, 2);
		String resultado = String.format("%.2f", imc);
		
		System.out.println("O valor do seu IMC eh: " + resultado);
	}
	
	// Questão 3: imprimir a área do trapézio com as medidas em cm. 
	public static void imprimirAreaTrapezio() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o comprimento da base maior do trapézio (em cm):");
        double baseMaior = sc.nextDouble();

        System.out.println("Digite o comprimento da base menor do trapézio (em cm):");
        double baseMenor = sc.nextDouble();

        System.out.println("Digite a altura do trapézio (em cm):");
        double altura = sc.nextDouble();

        double area = ((baseMaior + baseMenor) * altura) / 2;

        System.out.println("A área do trapézio em cm² é: " + area);
	}
	
	// Questão 4: receber 2 números inteiros e imprimir o maior.
	public static void imprimirMaior() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite um número qualquer:");
		double numP = sc.nextDouble();
		
		System.out.println("Digite outro número:");
		double numS = sc.nextDouble();
		
		if(numP > numS) {
			System.out.println("Esse numero eh o maior: " + numP);
		}else if(numP < numS) {
			System.out.println("Esse numero eh o maior: " + numS);
		}else {
			System.out.println("Os nnumeros digitados sao iguais");
		}
	}
	
	// Questão 5: identificar se o número é par ou ímpar.
	public static void ehParImpar() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite seu numero para descobrir se eh Par ou Impar:");
		double numero = sc.nextDouble();
		
		if(numero % 2 == 0) {
			System.out.println("Este numero eh Par");
		}else {
			System.out.println("Este numero eh Impar");
		}
	}
}
