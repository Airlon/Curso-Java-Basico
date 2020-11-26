package aula6;

import java.util.Scanner;

public class Argumentos {
	
	public static void main (String [] args) {
		Scanner in = new Scanner (System.in);
		
		String nome;
		
		System.out.println("Digite um nome:");
		 nome = in.nextLine();
		
		System.out.println("Você digitou " +nome );
	}

}
