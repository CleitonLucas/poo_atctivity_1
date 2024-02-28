package poo_atividades;

import java.util.Scanner;

public class atividade_1_2 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		String nome;
		byte idade;
		float peso;
		float altura;
		String genero;
		byte opcao;

		System.out.println("Informe seu nome:");
		nome = sc.next();

		System.out.println("Informe sua idade:");
		idade = sc.nextByte();

		System.out.println("Informe seu peso:");
		peso = sc.nextFloat();

		System.out.println("Informe sua altura:");
		altura = sc.nextFloat();

		System.out.println("Informe seu genero ('M' para Masculino e 'F' para Feminino)");
		genero = sc.next();

		System.out.println(
				"Informe a operacao que quer realizar. Para saber seu IMC digite 1, mas para saber seu Metabolismo Basal digite 2. Para sair digite 0:");
		opcao = sc.nextByte();

		switch (opcao) {
		case 1:
			calcimc(peso, altura, nome);
			break;
		case 2:
			calcmtb(idade, genero, peso, altura, nome);
			break;
		default:
			System.out.println("Opcao invalida !");
		}
	}

	public static void calcimc(float peso, float altura, String nome) {
		double imc = peso / Math.pow(altura, 2);
		String resultado = String.format("%.2f", imc);
		if (imc < 19) {
			System.out.println("Ola " + nome + ", Seu IMC eh: " + resultado + ". Voce esta abaixo do peso");
		} else if (imc >= 19 && imc < 25) {
			System.out.println("Ola " + nome + ", Seu IMC eh: " + resultado + ". Voce esta com peso normal");
		} else if (imc >= 25 && imc < 30) {
			System.out.println("Ola " + nome + ", Seu IMC eh: " + resultado + ". Voce esta com sobrepeso");
		} else if (imc >= 30 && imc < 40) {
			System.out.println("Ola " + nome + ", Seu IMC eh: " + resultado + ". Voce esta com obesidadade tipo 1");
		} else {
			System.out.println("Ola " + nome + ", Seu IMC eh: " + resultado + ". Voce esta com obesidade morbida");
		}
	}

	public static void calcmtb(byte idade, String genero, float peso, float altura, String nome) {
		float metab;
		if (genero.equals("M")) { 
			metab = 88.362f + (13.397f * peso) + (4.799f * altura) - (5.677f * idade);
			System.out.println("Ola " + nome + ", Seu Metabolismo Basal eh: " + metab + "Kcal/dia");
		} else {
			metab = 447.593f + (9.247f * peso) + (3.098f * altura) - (4.330f * idade);
			System.out.println("Ola " + nome + ", Seu Metabolismo Basal eh: " + metab + "Kcal/dia");
		}
	}
}
