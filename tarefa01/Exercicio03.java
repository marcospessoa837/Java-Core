package tarefa01;
import java.util.Scanner;

public class Exercicio03 {

	public static void main(String[] args) {
		// Escreva um algoritmo para ler dois valores do teclado e exibir como resposta a soma dos valores.
		try {
			Scanner sc = new Scanner(System.in);
			
			System.out.println("Vamos fazer a soma dos dois valores!");
			System.out.print("Digite o primeiro Valor: ");
			int primeiroValor = sc.nextInt();
			System.out.print("Digite o segundo Valor: ");
			int segundoValor = sc.nextInt();
			
			int soma = primeiroValor + segundoValor;
			System.out.println("A soma dos valores = " + soma);
			sc.close();
		} catch (Exception e) {
			System.out.println("Digite um valor valido!");
		}
	}

}
