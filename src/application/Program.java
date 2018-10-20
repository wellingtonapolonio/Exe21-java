package application;

import java.util.Locale;
import java.util.Scanner;

import entities.funcionario;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int num, h;
		double vH, s;
		
		num = sc.nextInt();
		h = sc.nextInt();
		vH = sc.nextDouble();
		
		funcionario f = new funcionario(num, h, vH);
		
		s = f.salario (h, vH);
		
		System.out.println("Number = "+ num);
		System.out.printf("Salary = US$ %.2f%n " ,s);
		
		sc.close();

	}

}
