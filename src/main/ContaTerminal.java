package main;

import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
	public static void main(String[] args) {
		
		 Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
		 
		 System.out.println("Seja Bem Vindo !");
		 System.out.println("Digite o número da Agência: ");
		 int numero = scanner.nextInt();
		 
		 System.out.println("Digite a Agência: ");
		 String  agencia = scanner.next();
		 
		 System.out.println("Digite o Nome: ");
		 String  nome = scanner.next();
		 
		 scanner.nextLine();
		 
		 System.out.println("Digite o Saldo: ");
		 double saldo = scanner.nextDouble();
		 
		 System.out.println("Olá " + nome + ", obrigado por criar uma conta em nosso banco, sua agência é " + numero + ", conta " +  agencia + " e seu saldo " + saldo + " já está disponível para saque.");	 
		 
	}
}
