package com.security.algorithms.implementations;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import java.util.Scanner;

@SpringBootApplication
public class ImplementationsApplication {

	public static void main(String[] args) {
		SpringApplication.run(ImplementationsApplication.class, args);
		Scanner scanner = new Scanner(System.in);
		System.out.printf("Escolha uma algoritmo para calculo de hash:\n" +
				"\t1) BCrypt;\n"+
				"\t2) Pbkdf2;\n"+
				"\t0) Finalizar/Sair;\n"  );
		int x;
		x = scanner.nextInt();
		switch (x) {
			case 1:
				TesterBCrypt testerBCrypt = new TesterBCrypt();
				testerBCrypt.run();
				break;
			case 2:
				TesterPbkdf2 testerPbkdf2 = new TesterPbkdf2();
				testerPbkdf2.run();
				break;
			default: System.out.println("Opção inválida.");
				break;
		}
	}
}
