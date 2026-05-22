package AulaFor;

import java.util.Scanner;

public class cofre {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in); 
		int n, resultado; 
		
		System.out.println("Informe um numero para a soma");
		n= ler.nextInt(); 
		
		for(int i=0;  i <=100; i++) { 
			resultado= n+i; 
			System.out.println(n + "+" + i + "=" + resultado);
		}
		ler.close(); 
		}
}
